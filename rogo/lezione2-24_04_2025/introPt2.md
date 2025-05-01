# Lezione 2

## Linguaggi intermedi tra il linguaggio naturale e quello dei computer:

### gerarchia:

- linguaggio naturale ( quello parlato )
- linguaggio di pseudo-codifica ( control-flow / flow-chart )
- linguaggio di programmazione ( codice )
- linugaggio macchina ( quello nel quale parlano le cpu )
- linguaggio binario ( fatto da zero e uno )

## usare i numeri su python

### Le conversioni

per trasformare un numero in una stringa -> str(var)
per trasformare una stringa in un numero -> int(var) \ int("5")

> print("Somma di due nuemri è " + str(somma))
> <br>esempio:  
> [Come far esplodaere un .py:](/rogo/lezione1-23_04_2025/introduzioneAPython.py)

### Come dare nomi alle variabili

parole devono essere parlanti, ovvero devono descrivere il loro

camel case: ogni parola ( tranne la prima ) deve iniziare con la lettera maiuscola

## strutture di controllo pt2

### condizionali

si suddividono per quanti casi devono controllare: (due, o più)

- binarie

  - operatori di confronto
    - == identico
    - \> maggiore
    - < minore
    - != diverso

- ennarie

#### if-else

```
if [condizine]:
  istruzioni
elif:
  istruzioni
else:
  istruzioni
```

#### switch

> non c'è

## differenze tra linguaggi di programmazione:

- interpretati
- compilati
- precompilati/bytecode
- ibridi

# Esercizi di mantenimento

- ESERCIZIO 1 -------------

  Inserire il nome di due utenti diversi, inserire le loro eta.
  Confrontare le loro eta:

  Se eta1 è più grande di eta2 allora esegui
  stampa nome1 è più grande di nome2

  Altrimenti se eta1 è più piccolo di eta2 allora esegui
  stampa nome1 è più piccolo di nome2

  Altrimenti esegui
  stampa nome1 è coetaneo di nome2

  [Esercizio 1 .py](EsercizioDiMantenimento1.py)

- ESERCIZIO 2 -------------

  per svolgere questo esercizio è necessario conoscere gli operatori logici:

  Dati i seguenti criteri di valutazione:
  da 1 a 10 - insufficiente
  da 11 a 20 - mediocre
  da 21 a 30 - sufficiente
  da 31 a 40 - distinto
  da 41 a 50 - ottimo
  da 51 a 100 - eccellente

  Chiedere all'utente di inserire un numero intero.
  Se il numero intero è presente in uno degli intervalli sopra descritti allora stampare la valutazione corrispondente.

  Ad esempio:
  se numero inserito è compreso tra 11 e 20 allora
  stampare "Valutazione: mediocre."
  In questo esercizio dovete controllare se il numero inserito dall'utente è presente in uno degli intervalli di valori.
  Per farlo dovete effettuare due confronti ed unirli con l'operatore logico and.

  [Esercizio 2 .py](./EsercizioDiMantenimento2.py)

- ESERCIZIO 3 - Boss finale

  Stampare un menu con le seguenti voci:

  1.  Quadrato
  2.  Rettangolo
  3.  Triangolo isoscele

  L'utente può scegliere una delle figure geometriche selezionando il progressivo corrispondente (1 - 2 oppure 3).

  In base alla figura geometrica scelta, chiedere all'utente di inserire le misure dei lati e/o dell'altezza che vi occorrono per calcolare, per ciascuna figura geometrica, la misura del perimetro e dell'area.
  Il programma, dunque, deve stampare la misura del perimetro e dell'area della figura scelta dall'utente.

  [Esercizio 3 .py](./EsercizioDiMantenimento3.py)
