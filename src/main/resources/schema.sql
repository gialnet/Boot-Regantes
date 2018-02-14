CREATE TABLE Fincas(
    id int,
    title varchar(20)
    );

CREATE TABLE Profiles(
    id int,
    content varchar(20),
    age int
    );

CREATE TABLE propiedades
(
   codigo       varchar(5)   PRIMARY KEY NOT NULL,
   descripcion  varchar(50)   NOT NULL,
   comunero     varchar(5)    NOT NULL,
   propietario  varchar(5)  ,
   comunidad    varchar(3)  ,
   unidades     varchar(50) ,
   horas        varchar(50) ,
   anejo        varchar(50) ,
   ordenriego   varchar(50)
);