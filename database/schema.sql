CREATE TABLE immobilisation(
   id_immobilisation SERIAL,
   nom VARCHAR(100) ,
   PRIMARY KEY(id_immobilisation, nom)
);

CREATE TABLE Fournisseur(
   id_fournisseur VARCHAR(50) ,
   nom VARCHAR(50) ,
   PRIMARY KEY(id_fournisseur)
);

CREATE TABLE Livreur(
   id_livreur VARCHAR(50) ,
   nom VARCHAR(100) ,
   PRIMARY KEY(id_livreur)
);

CREATE TABLE marque(
   id_marque VARCHAR(50) ,
   nom VARCHAR(50) ,
   PRIMARY KEY(id_marque)
);

CREATE TABLE proces_verbal_reception(
   id_proces SERIAL,
   date_reception DATE NOT NULL,
   etat INTEGER,
   valeur DOUBLE PRECISION,
   designation VARCHAR(50) ,
   id_livreur VARCHAR(50)  NOT NULL,
   id_marque VARCHAR(50)  NOT NULL,
   id_fournisseur VARCHAR(50)  NOT NULL,
   id_immobilisation INTEGER NOT NULL,
   nom VARCHAR(100)  NOT NULL,
   PRIMARY KEY(id_proces),
   FOREIGN KEY(id_livreur) REFERENCES Livreur(id_livreur),
   FOREIGN KEY(id_marque) REFERENCES marque(id_marque),
   FOREIGN KEY(id_fournisseur) REFERENCES Fournisseur(id_fournisseur),
   FOREIGN KEY(id_immobilisation, nom) REFERENCES immobilisation(id_immobilisation, nom)
);

CREATE TABLE proces_verbal_utilisation(
   id_utilisation VARCHAR(50) ,
   date_utilisation DATE,
   id_proces INTEGER NOT NULL,
   PRIMARY KEY(id_utilisation),
   FOREIGN KEY(id_proces) REFERENCES proces_verbal_reception(id_proces)
);
