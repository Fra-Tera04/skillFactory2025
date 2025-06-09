/*
	Tabelle
	
    Una vista: view_scuola ( id(studente), nome, congome, anni, corso )
	
    AUTORE: francesco rogo
*/

drop schema skillfacotry_lezione22_1;

CREATE SCHEMA IF NOT EXISTS skillfacotry_lezione22_1;
USE skillfacotry_lezione22_1;

CREATE TABLE IF NOT EXISTS corsi(
	id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(30) UNIQUE
);

CREATE TABLE IF NOT EXISTS studenti(
	id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(30),
    cognome VARCHAR(30),
    anni INT
);

CREATE TABLE IF NOT EXISTS scuole(
	id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(30),
	id_corso INT,
    id_studente INT,
    
    FOREIGN KEY (id_corso) REFERENCES corsi(id) ,
    FOREIGN KEY (id_studente) REFERENCES studenti(id)
);

CREATE OR REPLACE VIEW view_scuola AS
SELECT st.id id_studente, st.nome nome, st.cognome cognome, st.anni anni, sc.nome scuola, c.nome corso
FROM studenti st JOIN scuole sc ON st.id = sc.id_studente JOIN corsi c ON c.id = sc.id_corso;





