package utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;

/**
 * Clase de Acceso a Base de datos, abstracta, que permite hacer de forma simple
 * y sin preocuparse de la sintaxis SQL, las operaciones CRUD sobre una bd.
 * 
 * @author Miguel Páramos
 *
 */
public abstract class DAO {

	/**
	 * objeto conexión, desde el que se va a referenciar a la BD. la operativa será
	 * conectar, usar, y desconectar lo antes posible.
	 */
	private static Connection connection;

	/**
	 * Función privada que abre una conexión con un servidor de base de datos. Las
	 * propiedades de la base de datos deben estar definidas en un fichero
	 * ./bdconfig.ini con el siguiente formato: 1º Linea: ip o dns del servidor 2º
	 * Linea: puerto 3º Linea: nombre bd 4º Linea: usuario BD 5º Linea: contraseña
	 * BD
	 * 
	 * @return statement listo para hacer la consulta que necesitemos
	 */
	private static Statement connect() {
		try {

			/**
			 * BufferedReader esto es pa hacerlo mas facil, la lectura de los archivos de
			 * ip,nombre usuario...
			 */
			BufferedReader lector = new BufferedReader(new FileReader("./bdconfig.ini"));
			String ip = lector.readLine();
			int puerto = Integer.parseInt(lector.readLine());
			String nombreBD = lector.readLine();
			String usuario = lector.readLine();
			String password = lector.readLine();
			lector.close();
			connection = DriverManager.getConnection("jdbc:mysql://" + ip + ":" + puerto + "/" + nombreBD, usuario,
					password);
			return connection.createStatement();
		} catch (IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * Funcion para insertar HashMaps en bases de dato
	 * 
	 * @param table
	 * @param campos
	 * @return
	 * @throws SQLException
	 */
	public static int insert(String table, HashMap<String, Object> campos) throws SQLException {
		Statement querier = connect();
		// insert into cliente(email,nombre,contraseña)values(w232323 ()y tal)
		// values('lad@das.es','aaa'.12123);

		// insert into cliente (email,nombre,telefono,contraseña) values(
		// 'dasdd@wewe.es','asasd','121212','2121212',

		String query = "insert into " + table + " (";
		Iterator it = campos.keySet().iterator();
		while (it.hasNext()) {
			String clave = (String) it.next();
			query += clave + ",";
		}
		query = query.substring(0, query.length() - 1) + ") values (";
		Iterator itv = campos.values().iterator();
		while (itv.hasNext()) {
			Object elemento = itv.next();
			if (elemento.getClass() != String.class && elemento.getClass() != Character.class) {
				query += elemento + ",";
			} else {
				query += "'" + elemento + "',";
			}

		}
		query = query.substring(0, query.length() - 1) + ")";
		if (Config.verboseMode) {
			System.out.println(query);
		}
		int ret = querier.executeUpdate(query);
		disconnect(querier);
		return ret;
	}

	// DELETE FROM table WHERE email='email' AND nombre='nombre';
	public static int delete(String table, HashMap<String, Object> campos) throws SQLException {
		Statement querier = connect();
		String query = "delete from " + table + " where ";
		Iterator itc = campos.entrySet().iterator();
		while (itc.hasNext()) {

			Entry actual = (Entry) itc.next();
			if (actual.getValue().getClass() != String.class && actual.getValue().getClass() != Character.class) {
				query += (String) actual.getKey() + "=" + (String) actual.getValue() + " AND ";
			} else {
				query += (String) actual.getKey() + "='" + (String) actual.getValue() + "' AND ";
			}

			query = query.substring(0, query.length() - 5);

		}

		if (Config.verboseMode) {
			System.out.println(query);
		}
		int ret = querier.executeUpdate(query);
		disconnect(querier);
		return ret;
	}

	/**
	 * función privada que cierra en su interior tanto el statement pasado por
	 * argumentos como la conexión, para dejar libre la entrada a más programas que
	 * quieran conectar a la misma bd
	 * 
	 * @param smt Statement que se va a liberar (cerrar).
	 */
	private static void disconnect(Statement smt) {
		try {
			smt.close();
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static ArrayList<Object> consultar(String tabla, HashSet<String> columnasSacar,
			HashMap<String, Object> restricciones) throws SQLException {

		// hacemos una consulta wapa. Select * , depues un where, lo pasamos a una
		// funcion en el daw, y luego
		// lo montamos en un hashmap

		// Primer paso: Creamos una conecion mediante la clase CONNECTION (yo he llamado
		// conection a esa variable )
		// luego le colocamos el DriverManager(ya antes incluido en el POM )
		// Connection conection=DiverManager.getConeccion(argumentos de la base de dato
		// y su conexion);
		// luego se le coloca su devido try catch

		Statement smt = connect();

		// luego de eso colocamos el Statement(acuerdate que tiene
		// que estar dentro del try), que es el objeto que te permite hacer consultas

		/**
		 * Segundo paso
		 * 
		 * ¿Que es un Statement ?====> Se trata ni mas ni menos que una unidad de código
		 * que representa una acción o secuencia de acciones
		 * 
		 * Statement smt=========> Variable que hace de objeto que se cree Statement smt
		 * =connection.createStatement(); ======> Igualamos el Statement a la coneccion
		 * IMPORTANTE, IMPORTAR DE JAVA.SQL aahh y por ultimo, smt.close, esa será la
		 * principal wea de nuestro curro,consultar y apagar consultar y apagar
		 * consultar y apagar (me cansé de escribir )
		 */

		/**
		 * Tercer paso usar el Select, pero con funciones de Java. Se hace con
		 * executeQuery y entre los parentesis ponemos la sentencia SQL Select * from
		 * tabla
		 * 
		 */

		String query = "select ";

		Iterator ith = columnasSacar.iterator();

		while (ith.hasNext()) {
			query += (String) ith.next() + ",";
		}
		query = query.substring(0, query.length() - 1) + " from " + tabla + (restricciones.size() > 0 ? " where " : "");

		Iterator itm = restricciones.entrySet().iterator();

		while (itm.hasNext()) {

			Entry actual = (Entry) itm.next();
			if (actual.getValue().getClass() != String.class && actual.getValue().getClass() != Character.class) {
				query += (String) actual.getKey() + "=" + (String) actual.getValue() + " AND ";
			} else {
				query += (String) actual.getKey() + "='" + (String) actual.getValue() + "' AND ";
			}

		}
		if (restricciones.size() > 0) {
			query = query.substring(0, query.length() - 5);
		}

		System.out.println(query);
		ResultSet cursor = smt.executeQuery(query);

		ArrayList<Object> fila = new ArrayList<Object>();

		while (cursor.next()) {

			Iterator hsCols = columnasSacar.iterator();

			while (hsCols.hasNext()) {
				String nombreCol = (String) hsCols.next();
				try {
					fila.add(cursor.getInt(cursor.findColumn(nombreCol)));
				} catch (NumberFormatException | SQLException e) {
					fila.add(cursor.getString(cursor.findColumn(nombreCol)));
				}
			}
		}

		disconnect(smt);

		return fila;

	}
	
	
	
	public static int actualizar(String tabla,HashMap<String,Object>datosModificar,
			HashMap<String,Object>restricciones) throws SQLException {
		
		String query=" update "+ tabla+" set ";
		Iterator itm =datosModificar.entrySet().iterator();
		while(itm.hasNext()) {
			
			Entry actual=(Entry)itm.next();
			if (actual.getValue().getClass() != String.class &&
					actual.getValue().getClass() != Character.class) {
				query+=actual.getKey()+" = "+actual.getValue()+",";		
				
			}else {
				query+=actual.getKey()+" ='"+actual.getValue()+"',";		
			}
		}
		query =query.substring(0,query.length() -1)+" where ";
		Iterator itr=restricciones.entrySet().iterator();
		while(itr.hasNext()) {
			
			Entry actual=(Entry)itr.next();
			if (actual.getValue().getClass() != String.class &&
					actual.getValue().getClass() != Character.class) {
				query+=actual.getKey()+" = "+actual.getValue()+" and ";		
				
			}else {
				query+=actual.getKey()+" ='"+actual.getValue()+"' and ";		
			}
		}
		query=query.substring(0,query.length()-5);
		
		if (Config.verboseMode) {
			System.out.println(query);
		}
		
		Statement smt =connect();
		int ret=smt.executeUpdate(query);
		disconnect(smt);
		
		
		
		return ret;
	}
}
