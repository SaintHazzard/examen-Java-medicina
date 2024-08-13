INSERT INTO examen.country (codecountry, namecountry) VALUES('CO', 'COLOMBIA');
INSERT INTO examen.country (codecountry, namecountry) VALUES('US', 'UNITED STATES');


INSERT INTO examen.region (codecountry_codecountry, codereg, namereg) VALUES('CO', 'SAN', 'SANTANDER');
INSERT INTO examen.region (codecountry_codecountry, codereg, namereg) VALUES('CO', 'BOG', 'BOGOTA');
INSERT INTO examen.region (codecountry_codecountry, codereg, namereg) VALUES('US', 'NY', 'NEW YORK');
INSERT INTO examen.region (codecountry_codecountry, codereg, namereg) VALUES('US', 'CA', 'CALIFORNIA');

INSERT INTO examen.city (codecity, codereg_codereg, namecity) VALUES('BU', 'SAN', 'BUCARAMANGA');
INSERT INTO examen.city (codecity, codereg_codereg, namecity) VALUES('ME', 'SAN', 'MEDELLIN');
INSERT INTO examen.city (codecity, codereg_codereg, namecity) VALUES('BO', 'BOG', 'BOGOTA');
INSERT INTO examen.city (codecity, codereg_codereg, namecity) VALUES('NY', 'NY', 'NEW YORK');   
INSERT INTO examen.city (codecity, codereg_codereg, namecity) VALUES('LA', 'CA', 'LOS ANGELES');
INSERT INTO examen.city (codecity, codereg_codereg, namecity) VALUES('FO', 'SAN', 'FLORIDABLANCA');



INSERT INTO examen.customer (latitud, lon, birthdate, codecitycustomer, emailcustomer, idcustomer, lastnamecustomer, namecustomer) VALUES(25.6, 90.8, '2000-04-30', 'BU', 'admin@campuslands.com', '1007456897', 'perez', 'pepe');  