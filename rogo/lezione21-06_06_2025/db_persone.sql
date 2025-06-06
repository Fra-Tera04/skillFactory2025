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

CREATE VIEW vista_1(id_persona_a, id_persona_b, titolo_di_studio) AS
SELECT * FROM persone_a, persone_b, persone_titoli_di_studio;


