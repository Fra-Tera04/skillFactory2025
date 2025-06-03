# Lezione 18 del 03/06/2025

## Indice

1. [La mattina](#gino)
2. [il pomeriggio](#il-test-alla-ibm)

## Gino

L'escursus di Gino oggi ci ricorda un'abilità fondamentale in azineda: l'_Attenzione_.

Ci introudce le componenti del controllo di flusso: parallelogramma per input/output, rettagoli per istruzioni base, rombi per le strutture di controllo e le ellissi per l'inizio e la fine.

Una bella reference al $\text{Teorema di Fisciano: if necessari = numero delle condizioni - 1}$

## Il test alla IBM

Il Solitario del Macchinista è un noto problema che consiste in...

<details>
<summary>Un'interpretazione sbagliata del problema</summary>

Cerca un percorso che vede tutti i g in G, solo una volta.

per ogni g in G, cerca un percorso che vede tutti i g in G, solo una volta

per ogni g in G, fai un ciclo partendo da g1 con un depth first. se tutti i nodi sono neri, allora top.

restituire il percorso o la congizione? il primo o tutti

</details>

<br>

<details>
<summary>Regole del solitario del ferrroviere:</summary>

1. Mischiare le carte
2. mettere le carte al cantro
3. pensare a una carta
4. prendere una carta dal mazzo
5. controllare se le carte sono uguali
6. se si, mettere la carta a dx
7. se no, mettere la carta a sx
8. ci sono ancora carte nel mazzo?
9. se si, ricomincia da punto 3
10. se no, guarda a sinistra, rimescola e ricomincia.

a

1. Mischiare le carte
2. mettere le carte al centro
3. pensare a una carta
4. prendere una carta dal mazzo
5. controllare se le carte sono uguali
6. se si, mettere la carta a dx
7. se no, mettere la carta a sx
8. ci sono ancora carte nel mazzo?
9. se si, ricomincia da punto 4
10. se no, le carte a sinistra diventano le nuove carte del mazzo, torna al punto 1.

</details>

<details>
traccia n.2
<summary>voglio totalizzare tt i numeri da 1-100</summary>

genenrare
totalizzare

stampare al somma

traccia 3

gerenrare una sequenza di numeri da 1-100
sommare solo quelli tra 1-50 e il totale da 1-100

</details>

<details>

<summary>traccia 4</summary>

vengono inseriti numeri dall'utente
se i numeri sono compresi tra 1-50 -> vanno agiuntia somma1
se sono compresi tra 51-100 -> vanno aggiunti a somma2
altrimenti non vengono totalizzati
il programma deve finre se venie inserito 0

[qui](sos2.svg)

</details>

## mamp

download
