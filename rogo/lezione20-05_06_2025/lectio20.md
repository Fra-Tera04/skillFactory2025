# Lezione 20 del 05/06/2025

## Indice

## Recap

### I DB

I DB sono sistemi di archiviazione e persisiteva dei dati. Si opera su di essi con un DBMS attraverso un comando SQL. Di solito usiamo i DB relazionali, hce hanno le properità ACID: Atomicity, Consistency, Isolation, Durability

### I Linguaggi che usiamo con i DB

SQL -> DDL - DML - DQL

\_

DDL -> CREATE - ALTER - DROP

    CREATE TABLE [table name] ( [column definitions] ) [table parameters]

    ALTER tipo nome parametri

    DROP tipo nome

ALTER TABLE nome_tabella RENAME COLUMN nome_vecchia_colonna TO nome_nuova_colonna;

tra i parametri di ALTER TABLE abbiamo ADD e DROP COLUMN

---

devo aggiustare qui

---

DML -> INSERT - UPDATE - DELETE

INSERT INTO db [(campi)] VALUE (valori...)

UPDATE db SET condizione

DELETE campo FROM db [ WHERE condizione ]

\_

DQL -> SELECT - FROM - WHERE - ORDER BY - GROUP BY

    SELECT nome_campo
    FROM db
    WHERE condizione
    [ORDER BY asc/desc]
    [GROUP BY nome_campo]

\_

<details>
<summary>Il "Tornare Indietro"</summary>

Una buona idea in SQL, qunado si sta facendo cose importanti è il concetto che ti permette di "tornare indietro" se fai un casino, ed è la Transazione.

In mysql si usa così:

    START TRANSACTION;

    -- Qui fai le tue operazioni (INSERT, UPDATE, DELETE, ecc.)
    UPDATE accounts SET balance = balance - 100 WHERE id = 1;
    UPDATE accounts SET balance = balance + 100 WHERE id = 2;

    -- Se tutto va bene:
    COMMIT;

    -- Se qualcosa va storto:
    ROLLBACK;

In postgres invece così:

    BEGIN;
    SET TRANSACTION ISOLATION LEVEL SERIALIZABLE;

    -- Qui fai le tue operazioni (INSERT, UPDATE, DELETE, ecc.)
    UPDATE accounts SET balance = balance - 100 WHERE id = 1;
    UPDATE accounts SET balance = balance + 100 WHERE id = 2;
    INSERT INTO accounts (account_id, balance) VALUES (1, 1000);

    -- Se tutto va bene:
    COMMIT;

    -- Se qualcosa va storto:
    ROLLBACK;

</details>

## Le Relazioni

Una volta create delle tabelle con dei campi, dobbiamo definire che tipo di relazione hann otrd i loro. i tip di relazioni si possono dividere in:

- 1 : 1
  Due tabelle per cui ogni riga dell'una ha un corrispettivo univico nell'altra, è in realtà una sola tabella
- 1 : \*
  Una campo della tabella ha uno o piu corrispettivi in un altra tabella. Come la realzione tra biglietto del tram e i diversi tram su cui puoi salire.
- \* : \*
  Se una tabella può avere molti corrispettivi in una seconda tabella, e la seconda tabella può avere tanti corrispettivi nella prima tabella, si aprla di relazioni molti a molti. In questo caso quando si passa da un diagramma ER a uno Relazionale

#### Vincoli

I vincoli più importanti sono le _Primary Key_ e le _Foreign Key_, esisitono anche altri vincoli sugli attibuti quali. _unique_ etc.

## Le Join

### Introduzione

Per far vedere più tabelle insieme basta aggiungere una virgola `,` nel `FROM` tra i vari nomi di tabelle.

Ma non sono unite con la logica, sono solo messe una di fiano all'altra. Per far visualizzare due (o più) tabelle unite tramite dal punto div ista relazionale si una la _keyword_ `JOIN`:

    SELECT * FROM tabella1 JOIN tabella2;
    SELECT * FROM tabella1 JOIN tabella2 ON PK_T1 = PK_T2

Se le PK delle tabelle hanno lo stesso nome basta la prima riga, se hanno nomid iversi si deve specificare quali colonne si vuole usare.

### Join right | left | ...

- **INNER JOIN**

  Restituisce solo le righe con corrispondenze in entrambe le tabelle.

- **LEFT JOIN (o LEFT OUTER JOIN)**

  Restituisce tutte le righe dalla tabella di sinistra e le righe corrispondenti dalla tabella di destra. Se non ci sono corrispondenze, i risultati della tabella di destra saranno NULL.

- **RIGHT JOIN (o RIGHT OUTER JOIN)**

  Restituisce tutte le righe dalla tabella di destra e le righe corrispondenti dalla tabella di sinistra. Se non ci sono corrispondenze, i risultati della tabella di sinistra saranno NULL.

- **FULL JOIN (o FULL OUTER JOIN)**

  Restituisce tutte le righe quando c'è una corrispondenza in una delle due tabelle. Se non ci sono corrispondenze, i risultati della tabella senza corrispondenze saranno NULL.

## Le View

sono un modo per semplficare alcune operazioni (come di join tra tabelle) e risparmiare tempo computazinale, e nascondere dei dati che non devono essere visualizzati in quel momento

    CREATE VIEW nome_view [(nomi_output)] AS SELECT colonne_in ordine_di_uscita FROM ...;

Ed ora un bel esercizio per il pomeriggio:

## Esercizio

Se vuoi vedere il db svolto tramite la traccia sottostante lo puoi vedere [Qui](progetto_marche_prodotti.sql)

<details>
<summary>Traccia</summary>

1. Creare le seguenti tabelle:

   - categorie: id, nome_categoria

   - marche: id, nome_marca

   - prodotti: id, nome_prodotto, prezzo, quantita, data_produzione, descrizione (campo facoltativo)

2. Creare le seguenti relazioni:

   - categorie-prodotti

   - marche-prodotti

3. Inserire 3 categorie

4. Inserire 5 marche

5. Inserire 10 prodotti.

NB.: quando inserire i valori nei campi del prodotto, considerate al la chiave esterna.

6. Creare le seguenti viste:

   - vista con i campi: id, nome_prodotto, prezzo, quantita, data_produzione, nome_marca

   - vista con i campi: id, nome_prodotto, prezzo, quantita, data_produzione, nome_categoria

   - vista con i campi: id, nome_prodotto, prezzo, quantita, data_produzione, nome_categoria, nome_marca

7. Fare le seguenti query direttamente sulla vista piu' completa:

   - trovare i prodotti con prezzo maggiore di 500

   - trovare i prodotti con prezzo compreso tra 500 e 900

   - trovare i prodotti che hanno ho prezzo mnore di 500 o maggiore di 800

   - ordina i prodotti per nome

   - ordina i prodotti per prezzo

</details>
