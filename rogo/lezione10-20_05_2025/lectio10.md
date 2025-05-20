# Lezione del 20/05/2025

## Indice

1. [Key Competence](#key-competence)
   1. [Il RItorno di Excel](#excel)
   2. [Le Tabelle Pivot](#tabelle-pivot)
   3. [Word](#word)
2. [Python](#python)
   1. [I dizionari](#json)
   2. [Il return](#il-return)

## Key Competence

### Excel

Dopo i subtotali abbiamo... **Consolidamento**

Il principio di excel è di mettere tutto in un singolo foglio, ma se prorpio devo, possiamo utilizzare i subtotali su più database. I quali devono avere le stesse colonne.

Supponiamo di avere due fogli, Gennaio e Febbraio. Vado in modalità gruppo (ctrl) e li riempio. Uso la funzione _consolida_ su Dati.

- [Esercizio excel](dopo_i_sub.xlsx)

  vendo prodotti, ci sono tre venditori, possono andare in qualsiasi regione italiana. Per ogni agente voglio una panoramica delle vendite ecc.

Questo esercizio è fatto per essere fallito, o cmq per introdurre una dinamica di ricerca e lo strumento **Tabelle Pivote**

### Tabelle Pivot

Consentono di avere uno sguardo ordinato e accurato sullo stato del db di riferimento in tempo reale, potendo andare a modificare quale campo è presente sulle righe e sulle colonne, avendo a disposizione anche la sezione per impostare dei filtri e funzioni come la somma o la media.

### Word

Visioniamo la Relazione modificata di Word tramite gli elementi paragrafi e tabulazioni.

Campi del documento:

                                            spettabile xxx
                                                presso xxx
                                                cap 80134
                                                via F.S.G.
    Nome Relaizone
    Introduzione al Documento
    Documento

        Indice
        ...
        ...

    pié di pagina

## Python

### JSON

Quando si parla di JSON, almeno in questo contesto, si intende una sintassi chiave-valore che in python indica un dizionario.

Creare un gestionale con i dizionari [Qui](gestionale_2.py)

### Il Return

Un'altra parola speciale in python e nella gran parte dei linguaggi di programmazione è **return**, la quale funge da chiusura forzata funzioni.

Al _return_ puoi associare una varibile di ritorno oppure no.

```python
def somma():
    a = 1; b = 2
    return a+b

>> 2
```

Un esempio [Qui](il_return.py)
