# Lezione 31 del 23/06/2025

## Indice

1. [Gli Array](#gli-array-in-java)

   1.[Statici](#gli-array-statici)

   2.[Dinamici](#gli-array-dinamici)

2. [Strutture Dati]()

## Gli array in Java

### Gli Array "Statici"

in java sono degli oggetti speciali per il copilatore java. la sintassi è la seguente `int [] arr = new int[n];` con `arr` che indica il nome della varibaile array, e `n` che indica la grandezza del vettore. E' possibile creare vettori multi-dimesionali aggiungendo parentesi quadre.

### Gli Array "Dinamici"

in java sono degli oggetti immutabili che permettono di gestire collezioni di elementi di dimensione variabile. La sintassi è simile a: `List<Integer> arrList = new ArrayList<>();`, in qunato ha `tipo<elemeto> nome = new tipo<>();`.

### Le Mappe

#### Le HashMap

sono un'implementazione del concetto di mappa (chiave : valore) tramite la struttura dati **Hash**, `Map<Integer,String> map = new HashMap<>();`

insert: `map.put(1,"")`

get: `map.get(key)`

update: `map.put(1,"")`

delete: `map.remove(1)`
