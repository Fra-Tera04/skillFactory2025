#GLI INSERT


INSERT IGNORE INTO studenti(nome, cognome, anni) 
VALUES ('Matteo','Brizzi',26),('Antonio','Luongo',24),('Mattia','Persichetti',21),('Alesandro','Maziotti',25);

INSERT IGNORE INTO corsi(nome) 
VALUES ('Matematica'),('Algebra'),('Geometria'),('Diritto Civico');

INSERT IGNORE INTO scuole(nome, id_corso, id_studente) 
VALUES ('Elena Di Savoia',1,1),('Elena Di Savoia',2,1),('Elena Di Savoia',3,1),('Elena Di Savoia',4,1),
		('Antonio Serra',1,2),('Antonio Serra',2,2),('Antonio Serra',3,2),('Antonio Serra',4,2),
        ('Morra Cinese',1,3),('Morra Cinese',2,3),('Morra Cinese',3,3),('Morra Cinese',4,3),
        ('Litania Di Lorenzo',1,4),('Litania Di Lorenzo',2,4),('Litania Di Lorenzo',3,4),('Litania Di Lorenzo',4,4);
