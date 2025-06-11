# Lezione 24 del 11/06/2025

## Indice

1. [Esercizi](#esercizi)
   1. [Traccia 1](#traccia-1)
   2. [Traccia 2](#traccia-2)
2. [Progettino](#progeggino)
   1. [Introduzione](#introduzione)
3. [L'ultima sql](#lultima-ora)

## Esercizi

### Traccia 1

Dato il seguente esempio di output, creare delle tabelle e le loro relazioni:

| id  | nome   | cognome | ruolo |
| --- | ------ | ------- | ----- |
| 1   | monzi  | manzi   | admin |
| 2   | monzi  | ranti   | admin |
| 3   | scosco | rabzo   | guest |

### Consegne

- aggiungi il campo stipendio con 2 con 1.5K e uno con 2K

- aggiungi il campo città

- calcola lo stipendio medio

- calcola lo stipendio medio per ogni citta

- mostra le citta dove lo stipendio medio super a i 1.8K

  ( si usano group by e having )

- Puoi trovare gli esercizi svolti [Qui](es_1.sql)

- Puoi trovare il DDL del db [Qui](db_es_user_ruoli.sql)

---

### Traccia 2

| id docente | nome  | cognome | ruolo         | corso             |
| ---------- | ----- | ------- | ------------- | ----------------- |
| 1          | maruo | mirko   | collaboratore | null              |
| 2          | giggi | gino    | doecnte       | educazione fisica |
| 3          | giggi | gino    | docente       | fisica            |
| 4          | Manzo | topo    | studente      | fisica            |

- Ricerca tabelle
  docenti
  ruoli
  corsi

- Relazioni

  - docenti \*:1 ruoli
  - docenti \*:\* corsi
  - docenti 1:\* cross
  - cross \*:1 corsi

- FK:

  - id_ruolo in docenti
  - id_persona in cross
  - id_corso in cross

- Querys:
  - Quanti utenti
  - Quanti utenti per ruolo
  - Visualizza ruoli con meno di 2 persone

---

## Progeggino

### Introduzione

Dovremo andare a **Testare** un sondaggio INAP che dovrà essere somministrato agli studenti delle scuole

Il **Testing** è l'attività che si svolge per **Assicurare la Validità** di un software.

Quando si parla di testare la validità di un sw si intende "Garantire" l'assenza di difetti, che possono essere:

1.  Che creano interruzioni ( _Failure_ )
2.  Inadempienza di un _Requisito Funzionale_ ( Funzionalità )
3.  Inadempienza di un _Requisito non Fuzionale_ ( Prestazioni e Quailtà )

    - Affidabilità, Accessibilità, Navigabilità, Sicurezza, Scalabilità, Manutenibilità, Prestazioni, Portabilità,

Ci rendiamo conto che soddisfiamo questi criteri...

Controllando i benchmarck, usando come documento le **User-Story**

Dopo le User-Story si crea il Product-Backlog, ovvero l'ordine di creazione della funzionalità/servizio/applicativo sw

.

Quando si parla del lavoro del tester si fa riferimento a 4 lavori: ?

- Tester Manager,
- Tester Funzionale, chi esegue i **Test-Case**
  - che devono essere **oggettivi** e **ripetibili**
  - econtengono il contesto, le precondizioni, le azioni, i dati da fornire, valori attesi, _tornare un ticket?_
- Test Autometion
- Performance Tester
  controllo i requisiti funzonali

CI/CD

Continues Integration / Conitnues Deployment

## L'Ultima Ora

[qui](es3_db_insert.sql)

### SQL

### Operatori

### Le Funzioni

### Le Procedure

### I Trigger
