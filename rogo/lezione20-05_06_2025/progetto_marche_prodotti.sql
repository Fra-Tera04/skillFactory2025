/* */


CREATE TABLE IF NOT EXISTS categoria (
	id INT AUTO_INCREMENT PRIMARY KEY,
    nome_categoria VARCHAR(15) UNIQUE
);

CREATE TABLE IF NOT EXISTS marca (
	id INT AUTO_INCREMENT PRIMARY KEY,
    nome_marca VARCHAR(15) UNIQUE
);

CREATE TABLE IF NOT EXISTS prodotto (
	id INT AUTO_INCREMENT PRIMARY KEY,
    nome_prodotto VARCHAR(15) NOT NULL UNIQUE,
    prezzo DECIMAL NOT NULL,
    quantita INT NOT NULL,
    data_produzione DATE NOT NULL,
    descrizione VARCHAR(500),
    id_categoria INT,
    FOREIGN KEY (id_categoria) REFERENCES categoria(id),
    id_marca INT,
    FOREIGN KEY (id_marca) REFERENCES marca(id)
);

INSERT IGNORE INTO categoria(nome_categoria) VALUES ("scarpe");
INSERT IGNORE INTO categoria(nome_categoria) VALUES ("pantaloni");
INSERT IGNORE INTO categoria(nome_categoria) VALUES ("altro");

INSERT IGNORE INTO marca(nome_marca) VALUES ("Zanichelli");
INSERT IGNORE INTO marca(nome_marca) VALUES ("Portorico");
INSERT IGNORE INTO marca(nome_marca) VALUES ("Amazon");

INSERT IGNORE INTO prodotto(nome_prodotto, prezzo, quantita, data_produzione, descrizione, id_categoria, id_marca) 
VALUES ('scarpa DX', 15, 3, '2025-05-19', '01 questa è una desrizon 01', 1,2);
INSERT IGNORE INTO prodotto(nome_prodotto, prezzo, quantita, data_produzione, descrizione,id_categoria,id_marca) 
VALUES ('scarpa SX', 14, 7, '2025-05-19', '02 questa è una desrizon 02', 2,2);
INSERT IGNORE INTO prodotto(nome_prodotto, prezzo, quantita, data_produzione, descrizione,id_categoria,id_marca) 
VALUES ('pantalone', 1, 1000, '2025-05-18', '03 questa è una desrizon 03', 3,1);
INSERT IGNORE INTO prodotto(nome_prodotto, prezzo, quantita, data_produzione, descrizione,id_categoria,id_marca) 
VALUES ('pantalone giallo', 2, 99, '2025-05-20', '04 questa è una desrizon 04', 1,2);
INSERT IGNORE INTO prodotto(nome_prodotto, prezzo, quantita, data_produzione, descrizione,id_categoria,id_marca) 
VALUES ('mortaccio', 13, 87, '2025-05-01', '05 questa è una desrizon 05', 1,3);
INSERT IGNORE INTO prodotto(nome_prodotto, prezzo, quantita, data_produzione, descrizione,id_categoria,id_marca) 
VALUES ('calzone', 82, 096, '2025-05-19', '06 questa è una desrizon 06', 1,3);
INSERT IGNORE INTO prodotto(nome_prodotto, prezzo, quantita, data_produzione, descrizione,id_categoria,id_marca) 
VALUES ('sporcaccio', 85, 9, '2025-05-19', '07 questa è una desrizon 07', 2,2);
INSERT IGNORE INTO prodotto(nome_prodotto, prezzo, quantita, data_produzione, descrizione,id_categoria,id_marca) 
VALUES ('cristo', 15, 3, '2025-05-18', '08 questa è una desrizon 08', 1,1);
INSERT IGNORE INTO prodotto(nome_prodotto, prezzo, quantita, data_produzione, descrizione,id_categoria,id_marca) 
VALUES ('santino', 15, 3, '2025-05-18', '09 questa è una desrizon 09', 3,1);
INSERT IGNORE INTO prodotto(nome_prodotto, prezzo, quantita, data_produzione, descrizione, id_categoria, id_marca) 
VALUES ('ascia', 9876, 4, '2025-05-18', '10 questa è una desrizon 10', 1,2);



CREATE OR REPLACE VIEW view_marca(id, nome_prodotto, prezzo, quantita, data_produzione, nome_marca) 
	AS SELECT p.id, p.nome_prodotto, p.prezzo, p.quantita, p.data_produzione, m.nome_marca  
		FROM prodotto AS p LEFT JOIN marca AS m ON p.id_marca = m.id;


CREATE OR REPLACE VIEW view_categoria(id, nome_prodotto, prezzo, quantita, data_produzione, nome_categoria) 
	AS SELECT p.id, p.nome_prodotto, p.prezzo, p.quantita, p.data_produzione, c.nome_categoria  
		FROM prodotto AS p INNER JOIN categoria AS c ON p.id_categoria = c.id;


CREATE OR REPLACE VIEW view_marca_categoria(id, nome_prodotto, prezzo, quantita, data_produzione, nome_marca, nome_categoria) 
	AS SELECT p.id, p.nome_prodotto, p.prezzo, p.quantita, p.data_produzione, m.nome_marca, c.nome_categoria
		FROM prodotto AS p JOIN marca AS m JOIN categoria as c ON p.id;

SELECT * FROM view_marca_categoria;
