# Lezione 28 del 17/06/2025

---

## Index

1. [Frontend](#il-frontend)
2. [css](#il-css)
3. [html](#altro-html)
4. [Bootstrap](#bootstrap)

---

## Il Frontend

In aggiunta allo scheletro html, alla head, a una form, abbiamo i tag:

$$
\bold{Select}
\downarrow
$$

<div style="text-align: center;">
    <select>
        <option>maschio</option>
        <option>femmina</option>
    </select>
</div>

```html
<select style="text-align: center;">
  <option>maschio</option>
  <option>femmina</option>
</select>
```

$$
\bold{Radiobutton:}
$$

<div style="text-align: center;">
<label>
<label>titolo di studio:</label>
<input type="radio" name="scelta" value="diploma" checked /> diploma
<input type="radio" name="scelta" value="laurea" /> laurea
<input type="radio" name="scelta" value="master" /> master
</label>

</div>

```html
<div>
  <label style="text-align: center;">
    <label>titolo di studio:</label>
    <input type="radio" name="scelta" value="diploma" checked /> diploma
    <input type="radio" name="scelta" value="laurea" /> laurea
    <input type="radio" name="scelta" value="master" /> master
  </label>
</div>
```

$$
\bold{Radiobutton:}
$$

<div style="text-align: center;">
  <label> animali domestici</label>
  <input type="checkbox" name="accetto" /> Cane
  <input type="checkbox" name="accetto" /> <b>Gato</b>
  <input type="checkbox" name="accetto" /> <b>Pitone</b>
  <input type="checkbox" name="accetto" />mostro
</div>

```html
<div style="text-align: center;">
  <label> animali domestici</label>
  <input type="checkbox" name="accetto" /> Cane
  <input type="checkbox" name="accetto" /> <b>Gato</b>
  <input type="checkbox" name="accetto" /> <b>Pitone</b>
  <input type="checkbox" name="accetto" />mostro
</div>
```

$$
\bold{Textarea:}
$$

<div style="text-align: center;">
  <textarea placeholder="scrivi qualcosa" maxlength="300"></textarea>
</div>

```html
<div style="text-align: center;">
  <textarea placeholder="scrivi qualcosa" maxlength="300"></textarea>
</div>
```

$$\text{I divisori e le linee:}$$

```html
<!-- \n -->
<br />

<!-- linea -->
<hr />
```

### Il CSS

Il Cascading Style Sheet, è un foglio che definisce le regole grafiche e stilistiche che la pagina web seguirà.

##### I Selettori

Per definire lo stile di un tag html lo indichiamo nel css e specifichiamo le caratteristiche. e questi postono essere di tipo, con gerarchia...

##### Il Selettore Universale &rarr; \*

##### I Selettori di Elemneti &rarr; \<tag>

##### I Selettori di Classi &rarr; .nome-classe

##### I Selettori di ID &rarr; #NomeID

---

Sapendo questo, possiamo anche fa realtre cose, per esempio:

##### I Selettori di Attributi &rarr; tag[attributo]

##### I Selettori Discendenti &rarr; div p

Tramite lo spazio.

##### I Selettori di Figli Diretti &rarr; div > p

    Seleziona un elemento che è figlio diretto di un altro.

##### I Selettori di Fratelli Adiacenti &rarr; div + p

Seleziona un elemento che è immediatamente preceduto da un altro, sullo stesso livello.

##### I Selettori di Fratelli Generici &rarr; div ~ p

Seleziona tutti gli elementi che sono preceduti da un altro, sullo stesso livello.

---

### Altro HTML

$$
\bold{il tag \\<table>:}
$$

da mettere al centro con i margini ma ancora non lo so fare...

<div >
    <table>
    <!--table raw -->
    <!--riga dei campi-->
    <tr>
        <!--table header -->
        <th>id</th>
        <th>nome</th>
        <th>cognome</th>
    </tr>
    <tr>
        <!--table data -->
        <td>1</td>
        <td>gigi</td>
        <td>righi</td>
    </tr>
    <tr>
        <!--table data -->
        <td>2</td>
        <td>pippa</td>
        <td>pippa</td>
    </tr>
    <tr>
        <!--table data -->
        <td>3</td>
        <td>sposso</td>
        <td>franco</td>
    </tr>
    </table>
</div>

a

```html
<table>
  <!--table raw -->
  <!--riga dei campi-->
  <tr>
    <!--table header -->
    <th>id</th>
    <th>nome</th>
    <th>cognome</th>
  </tr>
  <tr>
    <!--table data -->
    <td>1</td>
    <td>gigi</td>
    <td>righi</td>
  </tr>
  <tr>
    <!--table data -->
    <td>2</td>
    <td>pippa</td>
    <td>pippa</td>
  </tr>
  <tr>
    <!--table data -->
    <td>3</td>
    <td>sposso</td>
    <td>franco</td>
  </tr>
</table>
```

```html
<div>
  <!--ordered list -->
  <ol>
    <!--ordered item -->
    <li>Pasta barilla</li>
  </ol>
  <ol>
    <li>Intimo godzilla</li>
  </ol>
  <ol>
    <li>monaco iashin</li>
  </ol>
</div>
```

Per creare un link in html si usa il tag \<a>

```html
<a href="">link</a>
```

#### I Div

I divisori sono porzioni del body che possiamo dimensionare. Per dimensionarli ci serve il CSS

<style>
.upper-div{
    height:300px;
    width: 50%;
    background-color: black;
}
</style>

```html
<style>
  .upper-div {
    height: 300px;
    width: 50%;
    background-color: black;
  }
</style>
```

ma sinceramente. non so che sta succedendo con i div.
teoricaente ok, ma praticamnete fa il chezz che gli pare. ma cc?
poi domnai si vede bro. tt apposto

puoi trovare i file html [qui](index.html)
il foglio css [qui](fogliuno.css)

### Bootstrap

copio link dal sito

rubo il codice

#### Traccia

usa questi **Components** in un file html:

- jumbotron
- from
- tabella
- 3 cards
- 1 carosello ( come funziona?)

#### Le griglie in bootstrap
