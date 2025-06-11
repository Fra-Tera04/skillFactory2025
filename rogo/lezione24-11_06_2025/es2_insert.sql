/*
DROP SCHEMA skillbook_23_2;

CREATE DATABASE skillbook_23_2;
USE skillbook_23_2;


# ALTER TABLE ruoli MODIFY ruolo ENUM('Docente','Studente','Collaboratore');

#

# ALTER TABLE ruoli MODIFY ruolo ENUM('Docente','Studente','Collaboratore');
INSERT INTO ruoli(ruolo) 
VALUES ('Docente'),('Studente'),('Collaboratore');

INSERT INTO docenti(nome,cognome,id_ruolo) 
VALUES ('Marco','Antonio',1),('Maria','Scoppola',1),('Ligma','balls',2),('Stravo','Scossovo',3);

INSERT INTO corsi(nome) 
VALUES ('Fisica'),('Educazione Fisica');


INSERT INTO cross_docenti_corsi(id_docente, id_corso) 
VALUES (1,1),(2,1),(3,2),(4,NULL);

ALTER TABLE docenti RENAME TO utenti;

select * from v_docenti_ruoli_corsi;



# Errore:

SELECT A.nome, A.cognome, A.ruolo, A.conto, B.conto
FROM (SELECT u.id id, u.nome nome, u.cognome cognome, count(*) conto
		FROM utenti u
		JOIN ruoli r ON r.id = u.id_ruolo
		GROUP BY r.ruolo
        ) AS A
join 
	(SELECT u.id id, u.nome nome, u.cognome cognome, count(*) conto
		FROM utenti u
		JOIN cross_docenti_corsi cdc ON cdc.id_docente = u.id
        JOIN corsi c ON c.id = cdc.i
		GROUP BY c.nome
        ) AS B 
on B.id = A.id;

# -------





# quanti utenti?
#select count(*) N_Utenti from utenti;


# quanti utenti per ruolo?
SELECT r.ruolo, count(*) N_utenti
FROM utenti u
JOIN ruoli r ON r.id = u.id_ruolo
GROUP BY r.ruolo;

INSERT INTO utenti(nome,cognome,id_ruolo) 
VALUES ('Francesco','Totti',3);

*/

# visualizza ruoli con meno di 2 persone
SELECT r.ruolo, count(*) N_ruoli_associati
FROM utenti u 
LEFT JOIN ruoli r ON r.id = u.id_ruolo
GROUP BY r.ruolo
HAVING count(*)<=2;


