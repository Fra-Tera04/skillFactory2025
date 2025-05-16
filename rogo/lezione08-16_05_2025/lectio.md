# Lezione 8

## Indice

- [Parliamo del Lavoro svolto su excel e su word](#presentazione)
- [Un'Analisi di Word](#uno-studio-di-word)
- [La Parte di Python](#python)

## Presentazione

La presentazione del lavoro si è svolta senza difficoltà. i gruppi erano divisi tra Erica il Ragazzo e Gennaro.

## Uno Studio di Word

### Analisi Preliminare

Analizando un documento word scritto da un non esperto, ci rendiamo conto che le gli strumenti più imporatnti usati male sono stati:

- Le Tabulazioni
- Il Righello
- Gli angoli

### Gli Angoli

Partendo dagli angoli possiamo dire che forniscono un modo veloce per definire qudano inizia una colonna col prossimo tab. Inoltre l'utilizzo degli angoli definisce un'allinemaneto sulla:

- sisitra
- destra
- virgola
- centro

### I Paragrafi e La Clessidra

- paragrafi -> tabulazioni

  - un mondo più tecnico per insierire angoli e caratteri di riempimenti

- il doppio invio / gestione dei paragrafi

  - si gestiscono tramite

- la clessidra
  - un ogetto umltiplo che definisce un rientro diverso per il testo selezionato
  - la parte di sopra
    riesntro speciale per la prima riga
  - la parte di sotto
    rientro speciale rispetto alle righe successive

### esercizio

Usare queste conoscenze per mettere a posto il file Relazione.

## Python

### Il While

Definiamo il costrutto **While** che è formato dalla parola speciale `while` una `condizione-booleana`, i due punti `:` e per finire una sezione di codice correttamente indentata.

### Gli Operatori Logici

L'**AND**: restituisce **Vero** se Tutte le consdizioni sono **Vere**
L'**OR**: restituisce **Falso** se Tutte le consdizioni sono **False**, altiementi **Vero**
L'**NOT**: restituisce **Vero** se viene applicato a una condizone **Falsa**, e vice versa.

### Il For

Definiamo il costrutto **For** che è formato dalle parole speciali `for` una variabile `in` un range, con i soliti due punti `:` anticipano una sezione di codice indentata.

```python
for x in range(inizio_incluso, fine_esclusa, step):
  #istruzioni
```

Da quì abbiamo che l'_inizio_ e lo _step_ è opzionale. La variable _x_ è auto-inizializzata e aggiornata.

### Esercizi

#### La Conta

- Conta da 20 a 30, e stamp ai valori da 27 a 29.
- Conta da 25 a 15, stampando i valori tra 16 ] e ( 27
- [Esercizi Svolti](./python8.py)

#### Il For

Diamo uno sguardo alla sintassi del _for_ con qualche test -> [tests](./test_for.py)

This sentence uses `$` delimiters to show math inline: $\sqrt{3x-1}+(1+x)^2$

**The Cauchy-Schwarz Inequality:**

$$
\left( \sum_{k=1}^n a_k b_k \right)^2 \leq \left( \sum_{k=1}^n a_k^2 \right) \left( \sum_{k=1}^n b_k^2 \right)
$$

---

```mermaid

```
