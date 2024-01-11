CREATE TABLE immobilisation(
   id_immobilisation SERIAL,
   nom VARCHAR(100) ,
   PRIMARY KEY(id_immobilisation, nom)
);