# Lezione 4

## Indice Degli Argomenti

- [Cosa faremo durante il Corso](#contenuti-del-corso)
- [Programmi da installare](#scaricando-cose)
- [Recap lezioni precedenti](#concetti-gia-visti)
- [Gerarchia Delle Risorse Dati](#la-gerarchia-delle-risorse-dati)
- [Operatori Logici](#operatori-logici)
- [Prove con Python](#prove-con-python)
- [Key Competence](#key-competence)
- [Office](#office)

---

## Contenuti del Corso

Gli argomenti del corso si divideranno in alcuni moduli che potranno, o meno, scambiarsi di posizione per agevolare l'apprendimento.

Abbiamo:

- Logica di programmazione (Python, JS, git)
- Key competence (Pacchetto Office)
- SQL
- Frontend (HTML, CSS, JS)
- Programmazione a oggetti (Java)
- Frameworks (Spring, Hibernate)

## Scaricando Cose

- [ x ] VS Code
- [ x ] git
- [ x ] GitHub
- [ x ] HIK-Share

## Concetti gia visti

[introduzione 1](./../lezione01-23_04_2025/introduzione.txt)
[introduzione 2](./../lezione02-24_04_2025/introPt2.md)
[introduzione 3](./../lezione03-05_05_2025/lectio.md)

## La gerarchia delle risorse dati

1. cpu-registri ( velocissimi e grandi strettamente il necessario epr contenere una parola macchina )
2. cache ( molto veloci e che fanno da ponte tra registri e ram, ci possnon essere vari livelli di cache )
3. [RAM](#ram---random-access-memory)
4. hard-disk ( un componente dedicato a conservare i dati anche dopo lo spegnimento del computer )

### RAM -> Random Access Memory

la ram viene usata per conservare dati che servono nell'immediato
i dati possono concervare sia i nomi delle variabili sia i loro ocntenuti, quindi testi, immagini, numeri.

### Dettaglio sui dati

A parte gli hard-disk, le altre forme di conservazioen dei dati funzionano fino a che c'è corrente, fino a che il pc è acceso. dopo il dato vinene cancellato, perso.

## Operatori logici

- L'uguale `=` rappresenta l'Assegnazione. Quello che sta a destra va in quello ceh sta a sinistra dell'uguale.

  > sx = dx.

  > nome della variabile = contenuto

  ```
  nom = "marco"
  numeor = 5
  ```

  L'uguale `=` può rappresentare anche una inizializzazione. Ovvero quadno andiamo a _dichiarare_ per la prima volta una _variabile_

- Il più `+`

  - Se abbiamo due numeri rappresenterà l'_A1ddizinoe_

    > 2 + 3

  - Se abbiamo due leggere o parole, prenderà il significato di _concatenzaione_

    `"papa " + " e mamma"`

    risulta:

    `"papa e mamma"`

## Prove con Python

Vediamo un [Primo approccio a Python](./../lezione01-23_04_2025/introduzioneAPython.py)

E un veloce sguardo alle prime _strutture di controllo_ tramite: un [Secondo approccio a Python](./../lezione02-24_04_2025/introPt2.md)

## Key Competence

<details>
<summary>Una Buona Presentazione</summary>

Tramite una veloce presentazione la tutor x si fa un'idea sulle nostre abilita relazionali e di percorso.
L'insieme delle abilità che smarmellano e che fanno una buona figura.

Studiare unazienda per settarmi per la posizione e presentaizone.

Una cosa imporante quando si tiene un discorso è entrare velocemnte negli argomenti di confort.
Una possibile lista:

- Chi sono

  - nome cognome
  - età
  - luogo

- Percorso di Studi

  - superiori
  - università
  - progetti extracurricolari

- Hobbi

  - leggere ( cosa leggi, perche )
  - scrivere ( cosa scrivi, perche )
  - sport
  - teatro ( spettacoli )

- Perche hai scelto questo corso/qualsiasi cosa

- Attitudine

  - 1 pro
  - 1 contro
  - Un caso in cui c'era un problema e come l'ho risolto
  - Carateristiche
    - Paziente ...

La **PNL...** è una branchia della linguistica preudo-scientifica. Ma si può imparare qualcosa di utile anche dalle cose pseudo-scienze
Dall'altro lato non sempre si trovano persone accomodanti, perciò bisogna fare tante prove, prepararsi.

</details>

## Office

**Office** non è altro che la riproduzione elettronica di un ufficio ( Presentazioni in PP, Scrittura su Word, Fogli di Calcolo per le Calcolatrici etc. )

### **Excel**

- _Excel_ è un software poentenitssimo perche fa da

  - Foglio di Calcolo
  - Creatore e visualizzatore di grafici
  - Gestore di database ( oltre Access )
  - Creare Macro ( tramite Liguaggio Naturale o Visual Basic )

- I Componenti più importanti di _Excell_ sono:

  - il file _.excel_ è una _Cartella di Lavoro_
  - ogni Cartella può avere più _Fogli di Lavoro_
  - _La Barra della Formula_
  - la _Cella_

per quanto riguarda la cella la si può fillare con testo, numeri eee un riferimento quindi una diade formata da una lettera e un anumero. Loro vanno a indicare una cella **specifica**

- Se volessi riferimi a una singola colonna allora aggiungerei `$` davanti alla lettera

- Se volessi riferimi a una sinogla riga allora aggiungerei `$` davanti al numero

I rferimenti prendono il nome di _relativi_, _misti_ e _assoluti_ in base se non hanno il dollaro, se ne hanno uno solo, se ne ha tutti e due.

Oltre al poter selezionare riferimenti di altre celle, posso selezionare riferimenti di altri fogli ( all'interno della stessa _cartella di lavoro_ )

Vorrei vedere se possono usare un sw non proprepatrio
libreOffice-openOffice
