# Lezione 13

## Indiece

1. [Linguaggi](#linguaggi)

   1. [Cos'è](#cosè-un-linguaggio-di-programmazione)
   2. [Tipi di Linguaggi](#tipi-di-linguaggi)
   3. [Paradigmi di Programmzione](#paradigi-di-progogammazione)
   4. [JSON](#cosa-sono-i-json)

2. [Ripetizione](#ripetizione-esercizi)
   1. [Il penultimo Python](#il-penultimo-python)
   2. [L'ultimo Python](#lultimo-python)
   3. [NodeJS](#installiamo-node-js)

## Linguaggi

### Cos'è un Linguaggio di Programmazione?

è un linguaggio che ha delle strutture di controllo

### Tipi di Linguaggi

Un linguaggio è

1. Compilato:
   - quando attraverso la compilazione del sorgente\*, abbiamo un file in codice macchina\*\* ( come C, C++)
2. Semi-compilati: ( come Java, C#)
   - quando tra il sorgente e il compilato, c'è una traduzione intermedia chiamta compilatzione in bytecode\*\*\*/ intermedia/ ibrida
3. Interpretati: ( come JS, Python)
   - quando le istruzioni sono compilate in codice macchina ed eseguiti ongi volta al momento d'uso

\* Il sorgente è un file scritto in un linguaggio semi-naturale

\*\* Il codice macchina è un file scritto in un lignuaggio fatto di 0 e 1

\*\*\* Il bytecode viene generato dalla compilazione del sorgente attraverso una macchina virtuale, che poi compilerà il bytecode in codice macchina, questo rende la codnivisione del codice sorgente sicura e funzionante su tutte le macchine

### Paradigi di Progogammazione

I paradigmi sono un'insieme di regole che seguono un modello che i linguaggi seguono, ce ne sono tanti ma i principali sono:

1. Procedurale / Imperativo

   - Segue strettamente una _Sequenza di Comandi_
   - Presenta e Modifica _variabili_ ( presenza di _stato_ )
   - Hanno un _focus_ su _come_ fare le cose

2. Funzionale

   - Tutto è strutturato come una Funzione pura (stesso input = stesso output, niente _stato_)
   - Ha la proprietà di Immutabilità (non si modifica nulla)
   - Ha un _focus_ su _cosa_ calcolare

3. Object Oriented

   - Divide il codice in _Oggetti_
   - che hanno le proprietà di
     - Incapsulamento, ereditarietà, polimorfismo
   - ha un _focus_ su _chi_ fa le cose

4. Dichiarativo

   - Descrivi il risultato desiderato
   - Il sistema decide come ottenerlo
   - come SQL

5. Logico
   - Definisci fatti e regole, il sistema deduce

### Cosa sono i JSON

E' un formato di serializzazione, e cioé è un modo per raccoglie organizzare e conservare i dati in modo semplice e legibile

json sta per JavaScript Object Notetion ed è una struttura di coppie chiave-valore

## Ripetizione Esercizi

#### Considerazioni:

- Bella la pizzeria di Gennaro.
- Un passo avanti con gli array.

Vediamo gli esercizi con le modifiche [qui](../lezione12-22_05_2025/weekend_esercizi.py) alla sezione 4

### Il Penultimo Python

Crea il pernultimo crud con python, andando ad implementare una remove con le funzioni base delle liste: pop e remove

L'esercizio ha dimostrato un errore inaspettato legato alla rimozione di un elemento e alla dinamicità della lista `untenti`

[Qui](ripasso_crud.py)

### L'ultimo Python

E ora un esercizio in solitaria...

## Installiamo Node JS
