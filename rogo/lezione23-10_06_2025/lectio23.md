# Lezione 23 del 10/06/2025

## Indice

1. [Ieri e Oggi](#ieri-e-stamani)
2. [Esercizi](#interrogagino)

## Ieri e Stamani

- Ho imparato l'uso del forward e reverce engegniering di mysql.

- Ho creato una tabella, una chiave primaria un campo, una enum, una chiave esterna.

- la fk dove va?

  la fk va dove sta la dicitura: a molti.

---

- Abbiamo ripetuto come capire il tipo della relazione tra le tabelle:

  1. Si prende come riferimento l'entità prinicpale e si controlla se l'altra tabella ha una relazione 1 o a molti.

  2. Si guarda la relazione dal punto di vista delle singole entità e si stabilisce la relazione.

- Per creare un DB si applica un processo:

  1. Estraggo/Recupero i dati dal Committente

  2. Li discretizzo
  3. Applico le regole di normalizzazione
  4. Creo delle relazioni significative
  5. Ne discuto

**Tutto questo va sotto il nome di:**

#### Processo di Creazione e Implemntazione di un DataBase

## Interrogagino

#### 1. visualizzare una select mediante _una_ join

#### 2. visualizzare una select mediante _due_ join

#### 3. visualizzare una select mediante _tre_ join

#### 4. visualizzare una select mediante _quattro_ join

#### 5. visualizzare l'averege degli stipendi degli utenti

#### ...

Non mi è piaciuto come mi sono rapportato, troppo teso, contraddico, sono stato in difensiva e attacco.

cosa si puo fare?

---

---

<details>

<summary>wip</summary>

## Tabella MD

| nome | cogmome | luogo di nascita | data di nascita | sesso | CF  | Titolo di studio | contatto | tipo contatto | eta |
| :--: | :-----: | :--------------: | :-------------: | :---: | :-: | :--------------: | :------: | :-----------: | --: |

---

## Tabella latex

$$
\begin{aligned}

& \text{Tabella attributi forniti dal cliente}
\\& \begin{array}{cccc}

\hline
\hline
& nome & cogmome & luogo di nascita & data di nascita & sesso & CF & Titolo di studio & contatto & tipo contatto & eta\\
\end{array}
\end{aligned}
$$

---

## Tabella Programma

$$

\begin{table}[!ht]
\centering
\begin{tabular}{|c|c|c|c|c|c|c|c|c|c|}
\hline
\textbf{a} & \textbf{a} & \textbf{a} & \textbf{a} & \textbf{a} & \textbf{a} & \textbf{a} & \textbf{a} & \textbf{a} & \textbf{a} \\ \hline
~ & ~ & ~ & ~ & ~ & ~ & ~ & ~ & ~ & ~ \\
~ & ~ & ~ & ~ & ~ & ~ & ~ & ~ & ~ & ~ \\
~ & ~ & ~ & ~ & ~ & ~ & ~ & ~ & ~ & ~ \\
~ & ~ & ~ & ~ & ~ & ~ & ~ & ~ & ~ & ~ \\
~ & ~ & ~ & ~ & ~ & ~ & ~ & ~ & ~ & ~ \\
~ & ~ & ~ & ~ & ~ & ~ & ~ & ~ & ~ & ~ \\
~ & ~ & ~ & ~ & ~ & ~ & ~ & ~ & ~ & ~ \\
~ & ~ & ~ & ~ & ~ & ~ & ~ & ~ & ~ & ~ \\
~ & ~ & ~ & ~ & ~ & ~ & ~ & ~ & ~ & ~ \\

\hline

\end{tabular}
\caption{complimenti}
\end{table}
$$

---

$$

\begin{aligned}
& \text {Table 1.1. A Jupyter notebook table using LaTeX }\\
&

\begin{array}{cccc}

\hline \hline
\text { Case } & \text { Method 1 } & \text { Method 2 } & \text { Method 3 } \\

\hline
1 & 50 & 837 & 970 \\
2 & 47 & 877 & 230 \\
3 & 31 & 25 & 415 \\
4 & 35 & 144 & 23656 \\
5 & 45 & 300 & 556 \\
\hline

\end{array}
\end{aligned}


$$

</details>

$$
$$
