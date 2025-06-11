
/*
CREATE DATABASE skillbook_23_3;
USE skillbook_23_3;

CREATE TABLE categorie(
	id INT AUTO_INCREMENT PRIMARY KEY,
    categoria VARCHAR(45) NOT NULL UNIQUE
    
);

CREATE TABLE marche(
	id INT AUTO_INCREMENT PRIMARY KEY,
    marca VARCHAR(45) NOT NULL UNIQUE
);


CREATE TABLE prodotti(
	id INT AUTO_INCREMENT PRIMARY KEY,
    prodotto VARCHAR(45) NOT NULL UNIQUE,
    prezzo DECIMAL(6,2) NOT NULL,
    quantita INT UNSIGNED NOT NULL,
    id_marca INT,
    id_categoria INT,
    
    FOREIGN KEY (id_marca) REFERENCES marche(id),
    FOREIGN KEY (id_categoria) REFERENCES categorie(id)
);


INSERT INTO categorie(categoria) VALUES ('abbigliamento'),('food'),('attrezzature');

INSERT INTO marche(marca) VALUES ('Nike'),('Adidas');

INSERT INTO prodotti(prodotto, prezzo, quantita,id_marca,id_categoria) 
VALUES ('Scarpe Superstar',70.0,500,1,1),('Bistecca',18.0,500,2,2),('Scalpelli',96.18,3200,1,1),('Scalpelli Basic',9.0,512,2,3);

*/

# calcolare il prezzo medio per ogni categoria
SELECT c.categoria categoria, AVG(p.prezzo) media
FROM prodotti p 
JOIN categorie c ON p.id_categoria = c.id
GROUP BY c.categoria;

# calcolare il prezzo medio per ogni marca
SELECT m.marca marca, AVG(p.prezzo) media
FROM prodotti p 
JOIN marche m ON p.id_marca = m.id
GROUP BY m.marca;

