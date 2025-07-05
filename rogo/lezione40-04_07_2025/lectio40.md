# Lezione 40 del 04/07/2025

## Indice

1. [Regex](#regex)
2. [Testing](#testing)
3. [JDBC e le Select](#jdbc-e-le-select)

## Regex

. \* ^ $ [] {}

/ escape

## Testing

### I Java Test Unite

## JDBC e Le Select

### a

per quanto riguarda la restituizione di un select, che sia un unico valore va usato:

```Java
ResultSet rs = ps.execute();
var p = new Persona();

if( rs.next() )
{
    p.setcf(rs.getString("cf"));
    ...
}
```

Quando si hanno molti valori...

```Java
ResultSet rs = ps.executeQuery();
Persona p = new Persona();
ArrayList<Persona> list = new ArrayList<>();

while( rs.next() )
{
    p.setcf(rs.getString("cf"));
    ...
    list.add(p);
}
```

---

**Report Esercitazione di Testing Database SQL con Java (JDBC)**

---

### 1\. Introduzione

Il presente report documenta l'esercitazione pratica di testing su un sistema di gestione database (mysql), utilizzando il linguaggio Java e l'API JDBC per la connettività. L'obiettivo principale dell'esercitazione era implementare e testare due operazioni CRUD su un database relazionale, garantendo la corretta interazione tra l'applicazione Java e il database per maturare una comprensione piu profonda sull'uso della tecnologia jdbc. Il sistema è stato strutturato in tre package principali: `crud`, `model`, e `test`.

### 2\. Architettura del Progetto

Il progetto è stato organizzato nei seguenti package e classi:

#### 2.1 Package `model`

Questo package contiene la definizione delle entità che vengono persistite nel database.

- **`Veicolo.java` (Classe Astratta):**

  - **Scopo:** Rappresenta l'entità generica di un veicolo, definendo attributi comuni (es. `id`, `marca`,`targa`, `modello`, `annoDiProduzione`) e metodi astratti o concreti condivisi da tutte le sottoclassi.
  - **Costruttori:** Un costruttore con tutti gli attributi e uno vuoto.
  - **Metodi:** Getters e Setters per gli attributi comuni.

- **`Auto.java` (Classe Concreta):**

  - **Scopo:** Estende la classe `Veicolo` e aggiunge attributi specifici per un'automobile .
  - **Ereditarietà:** Eredita gli attributi e i metodi di `Veicolo`.

  - **Costruttori:** I costruttori chiamano `super()`.
  - **Metodi:** Getters e Setters per gli attributi specifici di `Auto`.

#### 2.2 Package `crud`

Questo package è responsabile dell'interazione diretta con il database per eseguire le operazioni CRUD.

- **`ICrudService.java` (Interfaccia):**

  - **Scopo:** Definisce il contratto per le operazioni CRUD. Garantisce che qualsiasi classe che implementi questa interfaccia offra un set standard di funzionalità per la gestione delle entità.

- **`CrudService.java` (Classe Concreta):**

  - **Scopo:** Implementa l'interfaccia `ICrudService` fornendo la logica concreta per le operazioni CRUD utilizzando JDBC. Questa classe è parametrizzata con il tipo di entità che gestisce (es. `CrudService<Auto>`).
  - **Dipendenza:** Dipende dalla classe `ConnectionDB` per ottenere una connessione al database.
  - **Implementazione Metodi:**
    - `findAll()`: Recupera tutte le righe dalla tabella `auto`, mappandole in una `List<Auto>`.
    - `update(Auto auto)`: Aggiorna una riga esistente nella tabella `auto`.
  - **Gestione `ResultSet`:** `ResultSet` viene iterato e i dati vengono mappati sull'oggetto `Auto`.
  - **Gestione `PreparedStatement`:** `PreparedStatement` per query parametrizzate e prevenzione SQL injection.
  - **Gestione `SQLException`:** Gestione delle eccezioni JDBC.

- **`ConnectionDB.java` (Classe di Utilità):**

  - **Scopo:** Gestisce l'apertura e la chiusura della connessione al database. Centralizza le credenziali del database (URL, utente, password) e fornisce un metodo statico per ottenere un'istanza di `Connection`.
  - **Metodi Esempio:** `public static Connection getConnection();`, `public static void closeConnection(Connection conn);`.
  - **Configurazione:** Indica dove sono configurati i dettagli di connessione.

#### 2.3 Package `test`

Questo package contiene le classi per il testing delle funzionalità implementate.

- **`TestCrud.java` (Classe di Test):**

  - **Scopo:** Contiene i test unitari e/o di integrazione per verificare il corretto funzionamento delle operazioni CRUD implementate in `CrudService`.

  - **Test Eseguiti (Esempi):**
    - Test di Creazione: `testInserisci()` – Verifica che una nuova auto venga inserita correttamente e che l'ID generato sia valido.
    - Test di Lettura di Tutti: `testLeggi()` – Verifica che tutti le auto vengano recuperate correttamente in una lista.

- **Configurazione del Database:**

  - Nome del Database: `concessionariaDB` (o il nome effettivo)
  - Utente Database: `root` (o l'utente effettivo)
  - Password Database: `admin`
  - URL di Connessione: `jdbc:mysql://localhost:3306/miodb` (o l'URL effettivo)
  - Struttura della tabella `veicoli` :
    ```sql
    CREATE TABLE auto (
        id INT AUTO_INCREMENT PRIMARY KEY,
        marca VARCHAR(20) NOT NULL,
        modello VARCHAR(20) NOT NULL,
        targa VARCHAR(10) NOT NULL,
        anno_produzione INT,
        stipendio DECIMAL,
    );
    ```

### 3\. Conclusioni

L'esercitazione ha permesso di acquisire una solida comprensione dell'interazione tra un'applicazione Java e un database SQL tramite JDBC. La strutturazione del codice in package `model`, `crud` e `test` ha dimostrato l'importanza della modularità e della separazione delle responsabilità per un codice più pulito e manutenibile.

In particolare, l'implementazione dell'interfaccia `ICrudService` e della classe `CrudService` ha evidenziato come le operazioni CRUD possano essere astratte e riutilizzate per diverse entità. La sequenza di istruzioni che passa dalla stringa SQL passanod per un `PrepareStatment` al metodo `execute()` ed `executeQuery()` per la restituizione di un valore di conferma o di una query. I test eseguiti hanno confermato la corretta implementazione delle funzionalità, sebbene sia sempre possibile estendere la copertura dei test con scenari più complessi e la gestione delle transazioni.

Questa esercitazione fornisce una base robusta per lo sviluppo di applicazioni Java che richiedono la persistenza dei dati.

---
