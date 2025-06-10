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

E' il lavoro nel quale si distinguono i principianti e i pro, si tratta di una pratica per portare i dati in possesso a uno stato di ordine standardizzato

### Regole

#### Regole di Gino

1. Ogni tabella deve avere un campo o un insieme di campi che rappresentano univocamente una riga
   - Una soluzione è usare una **Chiave Primaria Surrogata**
2. Eliminare i campi ridondanti, o sotto forma di dato tipizzato o sottoforma di dato calcolato
3. Eliminare i campi calcolati, dove il valore puù essere derivato dalle informaizoni a disposizione nelle altre colonne

#### Regole delle Forme Normali

1. Ogni campo deve contenere valori atomici (no campi con valori multipli o liste). (1NF)

2. Ogni attributo non chiave deve dipendere completamente dalla chiave. (2NF)

3. Ogni attributo non chiave deve dipendere solo dalla chiave priaria e non da altri attributi non chiave (no dipendenze transitive). (3NF)

4. ...

## Esercizi

#### Dati i dati...

| nome | cogmome | luogo di nascita | data di nascita | sesso | CF  | Titolo di studio | contatto | tipo contatto | eta |
| :--: | :-----: | :--------------: | :-------------: | :---: | :-: | :--------------: | :------: | :-----------: | --: |

#### Dati questi dati...

#### ...Fai reverse engegniering per creare un db che mi rappresenti questi dati.

### discernimento - normalizzazione

Considerando un'autput significativo fornito dal committente, si rivela che il titolo e il

### tabelle narmalizzate

- Persone
  id
  CF
  nome
  cogmome
  luogo di nascita
  data di nascita
  sesso
- Titoli_di_Studio
  id
  titolo

- Contatti
  id
  contatto
  tipo_contatto

FLOOR(DATEDIFF(CURDATE(), ...)/365);

persona1 Ntitolo
cross_p_tds
personaN 1titolo
