
drop table vehicles if exists;

CREATE TABLE VEHICLES(
                     
                     Type varchar(150) DEFAULT NULL,
                     Vin bigint NOT NULL,
                     brand varchar(150) DEFAULT NULL,
                     color varchar(150) DEFAULT NULL,
                     engineType varchar(150) DEFAULT NULL,
                     price bigint DEFAULT NULL,
                     year bigint
                     PRIMARY KEY(Vin)  
);


INSERT INTO VEHICLES(Type,Vin,brand,color,engineType,price,year) VALUES
('truck','GMC', 'red', 'gas', '24000', '2016');