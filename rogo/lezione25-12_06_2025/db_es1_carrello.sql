/*
CREATE DATABASE skillbook_25_1;
USE skillbook_25_1;

#DELETE FROM prodotti;
#ALTER TABLE prodotti AUTO_INCREMENT = 1;


CREATE TABLE IF NOT EXISTS ordini(
	id INT auto_increment primary key,
    ordine VARCHAR(45) NOT NULL
);

CREATE TABLE IF NOT EXISTS prodotti(
	id INT auto_increment primary key,
    nome VARCHAR(45) NOT NULL,
    prezzo DECIMAL(6,2) NOT NULL
);

CREATE TABLE IF NOT EXISTS cross_carrello(
	id INT auto_increment primary key,
    id_ordine INT,
    id_prodotto INT,
    
    FOREIGN KEY (id_ordine) REFERENCES ordini(id),
    FOREIGN KEY (id_prodotto) REFERENCES prodotti(id)
);


CREATE OR REPLACE VIEW v_ordine AS
SELECT o.id id_ordine, o.ordine codice_ordine, p.nome nome_prodotto, p.prezzo prezzo  
FROM prodotti p 
JOIN cross_carrello cc ON cc.id_prodotto = p.id
JOIN ordini o ON o.id = cc.id_ordine;


INSERT INTO ordini(ordine) 
VALUES ('001-asdf'),('002-a'),('003-b'),('004-c'),('005-d');


INSERT INTO prodotti(nome, prezzo) 
VALUES ('Garpet barilla',5000), ('Cornice in alluporistilloso',880), 
	('Gomma da Svitare',13),('Scassa Noci - fuori serie', 3456.97),
    ('Marmellata di plastica e alberi barilla',1.67),
    ('Scultura di PI ',3141.59),('Mostarda barilla',12.98),
    ('Scultura di E',271.82);


INSERT INTO cross_carrello(id_ordine,id_prodotto) 
VALUES (1,1),(1,2),(1,3),(1,4),(2,5),(3,6),(2,6),(4,7),(4,8);

*/

# 1
SELECT v.codice_ordine ordine, sum(v.prezzo) importo
FROM v_ordine v
GROUP BY v.codice_ordine;

#2
SELECT v.codice_ordine ordine, sum(v.prezzo) importo
FROM v_ordine v
GROUP BY v.codice_ordine
HAVING importo > 400;

#3
SELECT v.codice_ordine ordine, sum(v.prezzo) importo
FROM v_ordine v
GROUP BY v.codice_ordine
HAVING count(*) < 4;

#4
SELECT v.codice_ordine ordine, sum(v.prezzo) importo
FROM v_ordine v
GROUP BY v.codice_ordine
HAVING importo > 400 AND importo < 500;
#HAVING importo > 400 AND importo < 5000;

#5
SELECT MIN(p.prezzo) prezzo_minimo, MAX(p.prezzo) prezzo_massimo
FROM prodotti p;

#6
SELECT MIN(p.prezzo) prezzo_min_max
FROM prodotti p
union
SELECT MAX(p.prezzo) prezzo_massimo
from prodotti p;

#7
SELECT *
FROM prodotti p
where p.prezzo in ( 
	(
		select max(p2.prezzo) 
		From prodotti p2
	),
    (
		select min(p3.prezzo) 
		From prodotti p3
    )
);

#8
SELECT *
FROM prodotti p
WHERE p.nome like 'm%';


#9
SELECT *
FROM prodotti p
WHERE p.nome like '%barilla%';

#10
SELECT *
FROM prodotti p
WHERE p.nome like '%o';

#5-6-7
(
  SELECT 'Minimo' tipo, nome, prezzo
  FROM prodotti
  WHERE prezzo = (SELECT MIN(prezzo) FROM prodotti)
)
UNION
(
  SELECT 'Massimo' tipo, nome, prezzo
  FROM prodotti
  WHERE prezzo = (SELECT MAX(prezzo) FROM prodotti)
);

(
SELECT 'Prezzo medio' sopra_sotto, '/' nome, AVG(prezzo) prezzo FROM prodotti
)
UNION
(
  SELECT 'SOPRA LA MEDIA' tipo, nome, prezzo
  FROM prodotti
  WHERE prezzo > (SELECT AVG(prezzo) FROM prodotti)
)
UNION
(
  SELECT 'SOTTO LA MEDIA' tipo, nome, prezzo
  FROM prodotti
  WHERE prezzo < (SELECT AVG(prezzo) FROM prodotti)
);
