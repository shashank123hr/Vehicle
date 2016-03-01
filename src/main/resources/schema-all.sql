drop table vehicles if exists;

CREATE TABLE VEHICLES(
                     
                     Type varchar(150) DEFAULT NULL,
                     Vin bigint NOT NULL AUTO_INCREMENT,
                     brand varchar(150) DEFAULT NULL,
                     color varchar(150) DEFAULT NULL,
                     engineType varchar(150) DEFAULT NULL,
                     price bigint DEFAULT NULL,
                     year bigint
                     
);