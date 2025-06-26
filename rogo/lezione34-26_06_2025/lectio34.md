# Lezione 34 del 26/06/2025

## Indice

1. [Interfacce](#interfacce)
2. [Le Date](#le-date-in-java)
3. [Progetto](#progetto-del-pomeriggio)

## Interfacce

E' una classe non istanziabile che fornisce un **comportamento** alle classi che la implementano.

Nelle `interface` possiamo scrivere solo le firme dei metodi, abbiamo a disposizione la possibilità di aggiungere un corpo dicendo che il metodo è _default_ o _static_.

## Le Date in Java

- **Date** è il tipo di dato che si passa ai DB

- **Instant** è un altro tipo di dato che si passa ai DB

- **LocalDate** è il tipo di dato che si usa per fare calcoli durante il flusso di codice

Quando si portano fuori le date si usano i metodi di conversione Date.valueOf(), mentre quando si importano le date si convertono in LocalDate attraverso la LocalDate.valueOf().

## Progetto del pomeriggio

#### Titolo: Concessionaria

#### Classi:

####

### La JavaDoc

#### Cosa si documenta?

Ogni Classe/Interfaccia/etc, ogni metodo, ogni attributo non private.

#### Come?

All'interno delle /\*\*\*/, sopra la cosa da documentare, si usano le _Annotazioni_: @param @return @throw...

#### Esempio pratico tramite codice Java:

```Java
/**
 * Questa interfaccia definisce un contratto per la gestione delle operazioni di input/output (I/O).
 * Fornisce metodi per leggere diversi tipi di dati dalla console (o altra fonte di input),
 * stampare messaggi e gestire l'input/output relativo agli oggetti {@link Veicolo}.
 *
 * L'obiettivo è astrarre le operazioni di I/O, permettendo diverse implementazioni
 * (es. console, file, GUI) senza modificare la logica di business.
 *
 * @author Il Tuo Nome/La Tua Organizzazione // Usa il tuo nome o il nome del team
 * @version 1.0                    // Versione dell'interfaccia
 * @since 2024-06-26               // Da quando è disponibile questa versione
 * @see Veicolo                    // Linka a classi/interfacce correlate per facilitare la navigazione
 */
public interface IGestioneIO {

    /**
     * Legge una stringa dall'input, mostrando un messaggio all'utente.
     * Questo metodo si occupa di richiedere all'utente un input di tipo stringa.
     *
     * @param m Il messaggio da visualizzare all'utente prima di leggere l'input.
     * Questo messaggio guida l'utente su cosa deve inserire.
     * @return La stringa letta dall'input dell'utente.
     * @throws java.util.InputMismatchException Se l'input non è nel formato atteso (non una stringa valida).
     * @throws java.util.NoSuchElementException Se l'input è esaurito.
     */
    public String leggiString(String m);

    /**
     * Legge un numero intero dall'input, mostrando un messaggio all'utente.
     * Il metodo gestisce la richiesta e la conversione dell'input in un intero.
     *
     * @param m Il messaggio da visualizzare all'utente prima di leggere l'input.
     * @return L'intero letto dall'input dell'utente.
     * @throws java.util.InputMismatchException Se l'input fornito dall'utente non è un intero valido.
     * @throws java.util.NoSuchElementException Se l'input è esaurito.
     */
    public int leggiInt(String m);

    /**
     * Legge un numero decimale (double) dall'input, mostrando un messaggio all'utente.
     * Si occupa di richiedere e convertire l'input in un valore double.
     *
     * @param m Il messaggio da visualizzare all'utente prima di leggere l'input.
     * @return Il numero decimale (double) letto dall'input dell'utente.
     * @throws java.util.InputMismatchException Se l'input fornito dall'utente non è un double valido.
     * @throws java.util.NoSuchElementException Se l'input è esaurito.
     */
    public double leggiDouble(String m);

    /**
     * Stampa un messaggio all'output (es. console).
     * Questo metodo è un'interfaccia per mostrare informazioni all'utente.
     *
     * @param m Il messaggio (Stringa) da stampare.
     */
    public void stampa(String m);

    /**
     * Consente all'utente di inserire i dettagli per creare un nuovo oggetto {@link Veicolo}.
     * Il metodo guida l'utente attraverso il processo di inserimento dei dati del veicolo
     * e restituisce l'oggetto Veicolo popolato.
     *
     * @return Un nuovo oggetto {@link Veicolo} con i dati forniti dall'utente.
     */
    public Veicolo formVeicolo();

    /**
     * Visualizza una scheda dettagliata per un singolo oggetto {@link Veicolo}.
     * Presenta all'utente tutte le informazioni rilevanti del veicolo in un formato leggibile.
     *
     * @param v L'oggetto {@link Veicolo} di cui visualizzare la scheda.
     */
    public void schedaVeicolo(Veicolo v);

    /**
     * Visualizza una lista di schede dettagliate per una collezione di oggetti {@link Veicolo}.
     * Itera attraverso la collezione e presenta ogni veicolo in un formato chiaro.
     *
     * @param list Una {@link java.util.Collection} di oggetti {@link Veicolo} da visualizzare.
     * Se la collezione è vuota, viene visualizzato un messaggio appropriato.
     */
    public void schedaVeicoli(Collection<Veicolo> list);

    /**
     * Visualizza il menu principale delle opzioni disponibili all'utente.
     * Questo metodo è tipicamente usato per presentare un elenco di azioni che l'utente può scegliere.
     */
    public void menu();
}
```
