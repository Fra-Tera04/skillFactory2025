# Esercizi

# Visualizza il noe e cognome dellutente con età minima

/*
SELECT st.nome, st.cognome, st.anni
FROM studenti st
WHERE anni = ( SELECT min(anni) FROM studenti );
*/

# conta quanti studenti seguono matematica e hanno piu di 17 anni

/*
SELECT corso, count(*) n_frequentanti
FROM view_scuola
WHERE corso = 'Matematica';
*/

# selziona gli studneti con nomi x , y
/*
SELECT nome, cognome
FROM studenti
WHERE nome in ('Massimo','Mattia');
*/

# seleziona sgli studenti cin anni tra x, y

# selezionare gli studenti che nel loro cognome hanno la 'sa'
/*
SELECT *
FROM studenti
WHERE nome like '%sa%';
*/

# seleziona i corsi dove l'età massima è = 19
/*
SELECT corso, max(anni) eta_assima
FROM view_scuola
GROUP BY corso
HAVING  max(anni) <= 3;
*/

#
/*

SELECT corso, count(*) n_studenti_per_corso
FROM view_scuola
GROUP BY corso;

# 

SELECT corso, count(*) n_studenti_per_corso
FROM view_scuola
GROUP BY corso
HAVING n_studenti_per_corso >= 0;


# ogni studente quanti corsi segue


SELECT nome, count(*) n_corsi
FROM view_scuola
GROUP BY id_studente;

*/

# 

