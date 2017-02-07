#------------------------------------------------------------
#        Script MySQL.
#------------------------------------------------------------

CREATE DATABASE IF NOT EXISTS  Hippodrome;

USE Hippodrome;


#------------------------------------------------------------
# Table: Poney
#------------------------------------------------------------

CREATE TABLE Poney(
        id_Poney int (11) Auto_increment  NOT NULL ,
        name     Varchar (25) ,
        weight   Int ,
        PRIMARY KEY (id_Poney )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Jockey
#------------------------------------------------------------

CREATE TABLE Jockey(
        id_Jockey int (11) Auto_increment  NOT NULL ,
        firstname Varchar (25) NOT NULL ,
        lastname  Varchar (25) ,
        weight    Int ,
        PRIMARY KEY (id_Jockey )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Course
#------------------------------------------------------------

CREATE TABLE Course(
        id_Course   int (11) Auto_increment  NOT NULL ,
        date_course Date ,
        PRIMARY KEY (id_Course )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Courir
#------------------------------------------------------------

CREATE TABLE Courir(
        rank      Int ,
        id_Jockey Int NOT NULL ,
        id_Poney  Int NOT NULL ,
        id_Course Int NOT NULL ,
        PRIMARY KEY (id_Jockey ,id_Poney ,id_Course )
)ENGINE=InnoDB;

ALTER TABLE Courir ADD CONSTRAINT FK_Courir_id_Jockey FOREIGN KEY (id_Jockey) REFERENCES Jockey(id_Jockey);
ALTER TABLE Courir ADD CONSTRAINT FK_Courir_id_Poney FOREIGN KEY (id_Poney) REFERENCES Poney(id_Poney);
ALTER TABLE Courir ADD CONSTRAINT FK_Courir_id_Course FOREIGN KEY (id_Course) REFERENCES Course(id_Course);
