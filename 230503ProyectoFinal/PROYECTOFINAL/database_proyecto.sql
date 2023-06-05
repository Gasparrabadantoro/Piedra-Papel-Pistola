CREATE DATABASE IF NOT exists piedra_papel_tijera;
use  piedra_papel_tijera;
DROP TABLE IF exists victorias;
CREATE TABLE victorias (
id int primary key auto_increment,
nombrePersonaje varchar(50),
numeroVictorias integer(3)

);

insert into victorias (nombrePersonaje,numeroVictorias) values('momia',0);
insert into victorias (nombrePersonaje,numeroVictorias)values('samurai',0);
insert into victorias (nombrePersonaje,numeroVictorias) values('torero',0);
insert into victorias (nombrePersonaje,numeroVictorias)values('vaquero',0);



