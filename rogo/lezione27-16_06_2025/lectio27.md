# Lezione 27 del 16/06/2025

## Indice

1. [Java - OOP](#java)
2. [HTML-XML](#lhtml-e-lxml)
   1. [HTML](#lhtml-e-lxml)
   2. [CSS](#lo-stile-css)

---

## Java

Un linguaggio di prormamzione _imperativo_ e **orientato agli oggetti** che _compila_ il sorgente in _bytecode_ e lo _interpreta_ attraverso la JVM. questa cosa prende il nome di **semi-interpretato**

## OOP

Object Orienterd Programming è un paradigma di programmazione in cui usiamo alcuni principi (che vedremo) per strutturare un codice piu robusto sicuro e portabile ripetto a un paradigma imperativo/procedurale.

La robustezza la sicurezza la portabiità etc. vengono dalle seguenti proprietà della oop:

0. Coesione

   - Il codice è diviso per componenti che devno essere coerenti per inismemistica, scopo, e comportamento.
   - Alta coesione, molto bene, requisito basico.

1. Componenti

   - I componeneti possono tanto essre gli Oggetti tanto le Classi.
   - In ogni caso i componenti avranno uno stato interno e un comportamento mediante gli attributi e metodi.
   - i componenti devono tendere a una alta coesione e un basso accopiamento.

### Packegeing in Java SE

- Controller &harr; main

---

## L'HTML e l'XML

- L'Hyper Text Marckup Language usa dei tag standardizati autochiudenti o meno, per creare pagine web.

- eXtensible Markup Language è un meta linguaggio di marcatura che usa i tag.

### forms

in HTML per creare un form si puo usare la struttura:

```html
<fieldset>
  <legend>Modello Form</legend>
  <form>
    <label>email</label>
    <input type="email" placeholder="em@ail.com" />
    <br />
    <label>password</label>
    <input type="password" placeholder="arg123.!" />
    <br />
    <button>registrati</button>
  </form>
</fieldset>
```

$$\downarrow$$

<fieldset>
  <legend>Modello Form</legend>
  <form>
    <label>email</label>
    <input type="email" placeholder="em@ail.com" />
    <br />
    <label>password</label>
    <input type="password" placeholder="arg123.!" />
    <br />
    <button>registrati</button>
  </form>
</fieldset>

---

Quando si definisce una pagina web prima di tutto si indica con quale linguaggio di marcatura usare; nel caso di aggiunta di estensioni **xml**/**thymelife** si aggiungono degli attributi al tag di **root** `<html></html>` oppure `<xml></xml>`.

Poi si usa il tag `<head></head>` per configurare/inizializzare correttamente la pagina.

All'interno della _testa_ abbiamo `<title></title>`, `<style></style>`, `<script></script>`, `<metadatasss per la codifica utf8>`, `<metadatasss per il responsive>`...

"Infine" abbiamo il `<body></body>` per la parte visibile all'utente.

Ora quando usiamo i tab, troviamo due tipi di tag, quelli inline e quelli blocklevel, ovvero tag che seguono una dispoizione orizzontale o verticale.

### Lo Stile CSS

Cascade Style Sheet è un linguaggoi usato per definire la formattazione di documenti HTML. Segue una sintassi tag @ { attributi }, dove il tag è il riferimento nell'html, la @ rappresenta il tipo di qualcosa che possiamo applicargli e tra e parentesi abbiamo gli attributi che modifica effettivamente il foglio.

Il CSS, come vedremo per gli Script in futuro, può essere

1. interno &rarr; scritto nel tag `<style></style>`
2. inline &rarr; aggiungendo l'attributo/proprietà style all'interno del tag di riferimento
3. esterno &rarr; in un altro documento, importato traimte il tag `<link rel="stylesheet" type="text/css" href="main.css" />` all'inetrno del file HTML

La gerarchia di sovrascrizione del CSS é: _inline_ > _interno_ > _esterno_
