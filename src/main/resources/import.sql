INSERT INTO medicina.country (codecountry, namecountry) VALUES('CO', 'COLOMBIA');
INSERT INTO medicina.country (codecountry, namecountry) VALUES('US', 'UNITED STATES');


INSERT INTO medicina.region (codecountry_codecountry, codereg, namereg) VALUES('CO', 'SAN', 'SANTANDER');
INSERT INTO medicina.region (codecountry_codecountry, codereg, namereg) VALUES('CO', 'BOG', 'BOGOTA');
INSERT INTO medicina.region (codecountry_codecountry, codereg, namereg) VALUES('US', 'NY', 'NEW YORK');
INSERT INTO medicina.region (codecountry_codecountry, codereg, namereg) VALUES('US', 'CA', 'CALIFORNIA');

INSERT INTO city (codecity, codereg, namecity) VALUES('BU', 'SAN', 'BUCARAMANGA');
INSERT INTO city (codecity, codereg, namecity) VALUES('ME', 'SAN', 'MEDELLIN');
INSERT INTO city (codecity, codereg, namecity) VALUES('BO', 'BOG', 'BOGOTA');
INSERT INTO city (codecity, codereg, namecity) VALUES('NY', 'NY', 'NEW YORK');
INSERT INTO city (codecity, codereg, namecity) VALUES('LA', 'CA', 'LOS ANGELES');
INSERT INTO city (codecity, codereg, namecity) VALUES('FO', 'SAN', 'FLORIDABLANCA');



INSERT INTO customer (latitud, lon, birthdate, codecity, emailcustomer, idcustomer, lastnamecustomer, namecustomer) VALUES(25.6, 90.8, '2000-04-30', 'BU', 'admin@campuslands.com', '1007456897', 'perez', 'pepe');  