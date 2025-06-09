# Lezione 22 del 09/06/2025

## Indice

- [Query Complesse](#query-complesse)

## Query Complesse

Link al [file](DB_corsi.sql) con struttura dello db e inserimenti

```sql
# SELECT * FROM studenti;

# SELECT count(*) n_righe FROM studenti;
# SELECT avg(anni) media_anni FROM studenti;
# SELECT min(anni) min_anni FROM studenti;
# SELECT max(anni) max_anni FROM studenti;

```

## Traccia n-1

1. visualizza il nome e cognome dellutente con età minima

   $
   \text{SELECT st.nome, st.cognome, st.anni} \\
   \text{FROM studenti st }\\
   \text{WHERE anni = ( SELECT min(anni) FROM studenti );}
   $

2. usa la keyword `in`

   $
   \text{SELECT nome, cognome}\\
   \text{FROM studenti} \\
   \text{WHERE nome in ('Massimo','Mattia');}
   $

3. seleziona gli studenti con anni tra x, y
   si usa la keyword `between`

$\text{SELECT * FROM studenti WHERE anni}$

4. Selezionare gli studenti che nel loro cognome hanno la 'sa'
   si usa la keyword `like` e si usa in combinazione con la wildcard `%`

   $
   \text{SELECT *} \\
   \text{FROM studenti} \\
   \text{WHERE nome like '\%sa\%';} \\
   $

5. seleziona i corsi dove l'età massima è = 19

   $
   \text{SELECT campo fun\_aggregazione} \\
   \text{FROM nome\_tabella} \\
   \text{GROUP BY nome\_campo} \\
   \text{HAVING fun\_aggregazione = valore}
   $

6. per ogni corso quanti studenti seguono?

   $
   \text{SELECT corso, count(*)} \\
   \text{FROM view\_scuola} \\
   \text{GROUP BY corso}
   $

7. ogni studente quanti corsi segue?

   $
   \text{SELECT nome} \\
   \text{FROM view\_scuola} \\
   \text{GROUP BY id\_studente}
   $

## Gino

### La Normalizzazione

è il lavoro nel quale si distinguono i principianti e i pro, si tratta di una pratica per portare i dati in possesso a uno stato di ordine standardizzato

### Regole

#### regole di gino

1. Ogni tabella deve avere un campo o un insieme di campi che rappresentano univocamente una riga
2. eliminare i campi ridondanti, o sotto forma di dato tipizzato o sottoforma di dato calcolato

#### regole delle forme normali

1. ogni campo deve contenere valori atomici (no campi con valori multipli o liste). (1NF)
2. ogni attributo non chiave deve dipendere completamente dalla chiave. (2NF)
3. ogni attributo non chiave deve dipendere solo dalla chiave primaria e non da altri attributi non chiave (no dipendenze transitive). (3NF)

## Esercizio

#### dati i dati...

$
\text{nome | cogmome | luogo\_di\_nascita | data\_di\_nascita | sesso | CF | Titolo\_di\_studio | contatto | tipo\_contatto eta}
$

mario sorrsi roma 09/11/2000 m x diploma xxx f 36
mirko morisi asti 01/5/2001 f x laurea xxx l 13
mario sessa siena 12/2/2003 m x master xxx m 76
matteo distefano napoli 10/03/1995 f x laurea xxx f 3
matteo distefano viterbo 10/03/1998 f x laurea xxx f 98

#### Dati questi dati...

#### ...Fai reverse engegniering per creare un db che mi rappresenti questi dati.

### discernimento - normalizzazione

COnsiderando un'autput significativo fornito dal committente, si rivela che il titolo e il

### tabelle narmalizzate

- Persone
  id
  CF
  nome
  cogmome
  luogo di nascita
  data di nascita
  sesso
  id_persona
  id_persona

- Titoli_di_Studio
  id
  titolo

- Contatti
  id
  contatto
  tipo contatto

SELECT FLOOR(DATEDIFF(CURDATE(), ...)/365);
