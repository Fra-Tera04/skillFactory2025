# Lezione 5

## Indice

1. [Ritorno alla Programmazione ](#ritorno-alla-programmazione)
   1. [Ripasso](#ripasso)
   2. [Le funzioni](#le-funzioni)
   3. [Gli scope](#gli-scope)
   4. [Tipi](#tipi)
2. [Pacchetto Office](#excel)
   1. [Excel](#excel)
      1. [Funzioni semplici](#le-funzioni-in-excel)
      2. [funzioni difficili](#quelle-più-complesse)

---

## Ritorno alla Programmazione

Quando guardiamo un codice lo analizziamo dall'alto verso il basso e da destrra verso sinistra.

### Ripasso

Esempio 1

<details>
<summary>Visualizza codice</summary>

```python
n1 = 5 # inizializzazione
n1 = 4 # aggioranemnto - assegnazione
n2 = 8 # init

somma = n1 + n2 # init + assegnazione mediante una somma

print(n1)
print(n2)
print(somma)

```

</details>

parliamo un po dell'operatore `+` il quale ha signifcati diversi che puoi notare nella:

- [prima lezione ](./../lezione01-23_04_2025/introduzione.txt) e nella
- [seconda lezione](./../lezione02-24_04_2025/introPt2.md#strutture-di-controllo-pt2) in base al contesto.

---

### Le Funzioni

in Python una funzione inizia con la parola chiave `def`. Il corpo della funzione è definito dall'**indentazione**.

<details>
<summary>Visualizza Codice</summary>

```python
def fun1():
    n1 = 5 # inizializzazione
    n1 = 4 # aggioranemnto - assegnazione
    n2 = 8 # init

    somma = n1 + n2 # init + assegnazione mediante una somma

    print(n1)
    print(n2)
    print(somma)

```

</details>

Quando scriviamo funzioni o variabili, è importante usare **nomi descrittivi** che indichino chiaramente il loro scopo

---

Esempio 3: nomi descrittivi

<details>
<summary>Visualizza codice</summary>

```python
def somma1():
    numero1 = 5 # inizializzazione
    numero1 = 4 # aggioranemnto - assegnazione
    numero2 = 8 # init

    somma = numero1 + numero2 # init + assegnazione mediante una somma

    print(numero1)
    print(numero2)
    print(somma)

```

</details>

---

Esempio 4: Valori Booleani

Intoduciamo i valori _Booleani_ , ovvero: _True_ e _False_

<details>
<summary>Visualizza Codice</summary>

```python
scelta = int(input("inserisci la tua scelta tra 1-2-3"))
if scelta == 1      # true
    print("1")
elif scelta == 2    # true
    print("2")
elif scelta == 3    # true
    print("3")
else                # False
    print("non 1-2-3"s)

```

</details>

---

Esempio 5: Creazione di una Calcolatrice

<details>
<summary>Visualizza Codice</summary>

```python
def menu():
    print("---MENU---")
    print("1) somma ver. 1")
    print("1) somma ver. 2")

def somma1():
    numero1 = 5
    numero2 = 8

    somma = numero1 + numero2

    print(somma)


menu()
# scelta()
somma1()

```

</details>

---

Esempio 6: uso dell'Underscore

Quando dichiriamo variabili o funzioni fatte da più parole usiamo l'underscore (`_`) per dividerle. Questo si contrappone al **CamelCase**, che usa lettera maiuscole per separare le parole.

<details>
<summary>Visualizza Codice</summary>

```python
def menu_calcolatrice():
    print("---MENU---")
    print("1) somma ver. 1")
    print("1) somma ver. 2")

def somma_version_1():
    numero1 = 5
    numero2 = 8

    somma = numero1 + numero2

    print(somma)

def confronto_numeri():
    n1 = int(input("Dammi il primo numero:\n"))
    n2 = int(input("Dammi il secondo numero:\n"))

    if n1 > n2:
        print(n1+" è più grande di "+n2)


menu_calcolatrice()
confronto_numeri()
somma_version_1()

```

</details>

e lo possiamo vedere in azione [qui](./myPy5.py) decommentando la sezione C-2

---

Esempio 7 Calcolatrice ~Compleata

<details>
<summary>Visualizza Codice</summary>

```python
def menu_calcolatrice():
    print("---MENU---")
    print("1) somma ver. 1")
    print("2) confronto di due numeri")
    print("3) verifica se un numero è pari")
    print("---Fine---")

def somma_version_1():
    numero1 = 5
    numero2 = 8

    somma = numero1 + numero2

    print(somma)

def confronto_numeri():
    n1 = int(input("Dammi il primo numero:\n"))
    n2 = int(input("Dammi il secondo numero:\n"))

    if n1 > n2:
        print(n1+" è più grande di "+n2)

def verifica_pari():
    numero = int(input("insierisci un numero:\n"))
    if numero % 2 == 0:
        print("Il numero è pari")
    else
        print("Il numero è dispari")


menu_calcolatrice()

scelta = input("Inserisci la tua scelta")

if scelta == 1:
    confronto_numeri()

elif scelta == 2:
    somma_version_1()

elif scelta == 3:
    verifica_pari()

```

</details>

### Gli Scope

Lo **Scope** è l'ambito di visibilità di una variabile. In python, lo scope è **limitato alle funzioni**. Le strutture condizionali e di loop **non creano uno Scope**.

Lo Scope ci dice quali variabili sono **globali** e quali **locali**

### Tipi

In python tutto è un oggetto, e le variabili non sono fortemente tipizzate. Questo fa si che ci possiamo permettere di assegnare un numero a una variabile che conteneva una stringa, e vice versa.

### Esercizio

dichiara una funzione semaforo che prende da input una parola, se è verde stampa vai, se è rosso stampa stop, se è giallo stampa attento, se è verde stampa vai, se inserisce un altra cosa stampa alcol test,

[Esercizio](./myPy5.py)

---

---

## Excel

### Recap

Nela barra posso inseririe testi, indirizzi di celle, indirizzi di fogli eeee indirizzi di **File**. Come? tramite parentesi quadre `[]`.

### Le Funzioni in Excel

#### Quelle Semplici e Standard

- Somma
- Max
- Min
- Media

Colloquio Conoscitivo con uno di Fiver

---

#### Quelle più Complesse

- Le Funzioni Logiche

  - funzione SE

    - =a == b
    - =se(x;y)

    io odio i SE, ho appena fatto un esercizio in cui si deve inserire una valutazione in base al voto, quindi ci sono 5-6 if anndati di merda. Con un'indentazione che su excel fa cacacre... io sono out.

    E ora un altro modo attraverso l'uso della funzione E:

    =SE(E(I36>9;I36<11);"Lodevole";SE(E(I36>8;I36<=9);"Ottimo";SE(E(I36>6;I36<=8);"Buono";SE(I36=6;"sufficiente";SE(E(I36<6;I36>=4);"mediocre";SE(E(I36<4;I36>=0);"insufficiente"))))))

  - funzione E -> and
    condizioni separate da `;` che devono essere vere entrambe

  - funzione O -> or
    condizioni separate da `;` in cui almeno una deve essere vere

<!--

Vorrei imparare a trasformare uno di questi markdown in latex
vorrei imparare mermaid per le mindmaps

Per creare un bel prgetto servono tanti chapter e un unico file, o anche la possibilità di averne n insieme, da questo punto di vista latex e markdown su piu file sembra interessante. potrà essere un esercizio per la prossima volta e per la fine corso

ipermetrope
-->
