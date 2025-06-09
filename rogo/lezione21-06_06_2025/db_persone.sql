/*
DROP TABLE persone;
DROP TABLE persone_titoli_di_studio;
DROP TABLE titoli_di_studio;
*/

CREATE TABLE IF NOT EXISTS persone_a(
	id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(20) NOT NULL
);

CREATE TABLE IF NOT EXISTS persone_b(
	id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(20) NOT NULL
);

CREATE TABLE IF NOT EXISTS titoli_di_studio(
	id INT AUTO_INCREMENT PRIMARY KEY,
    id_persona_b INT,
    titolo VARCHAR(20) NOT NULL,
    
    FOREIGN KEY (id_persona_b) REFERENCES persone_b(id)
);

CREATE TABLE IF NOT EXISTS persone_titoli_di_studio(
	id_persona_a INT,
    id_titolo_di_studio INT,
    
    PRIMARY KEY (id_persona_a, id_titolo_di_studio),

    FOREIGN KEY (id_persona_a) REFERENCES persone_a(id),
    FOREIGN KEY (id_titolo_di_studio) REFERENCES titoli_di_studio(id)
);

CREATE VIEW vista_1(nome_a, nome_b, titolo_di_studio) AS
SELECT pa.nome, pb.nome, pt.titolo 
FROM persone_a AS pa JOIN persone_b AS pb, persone_titoli_di_studio AS pt;


