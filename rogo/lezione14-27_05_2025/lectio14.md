---
title: "Page Title"
subtitle: "Page sub-title"
author: "Author name"
description: "This is a test"
institute: "MU"
date: "20/02/2020"
abstract: "YAML"
keywords:
  - key1
  - key2
tags:
  - tag1
  - tag2
---

# Lezione 14 del 27/05/2025

## Indice

- [CV](#curriculum-vitae)
- [NodeJS](#nodejs)

## Curriculum Vitae

Creiamo un CV sulla piattaforma di Skillbook

## JavaScript e NodeJS

### Dichiarazione Variabili

La sintassi per creare una varibile in JS è la seguente:

**keyword** | **nome_variabile** | **simbolo_di_assegnazione** | **valore** | **separatore**

```js
var a = 1;
```

- La **keyword** usata per creare una variabile è `var` o `let` in base a...

- Il **nome di una varibaile** non può iniziare con numeri o caratteri speciali, e non può essere una _keyword_

- Il **Simbolo di assegnazione** è l'uguale

- Il **valore** può essere una qualsiasi espressione ( stringa, numero, oggetto)

- Il **Separatore** è il punto e virgola `;`

### Le Funzioni

Si definiscono con la _keyword_ `function` + il nome della funzione + `()` `{` il corpo della funzione `}`7

```javascript
function somma() {
  let counter = 0;
  while (counter <= 10) {
    console.log(counter);

    let tot = 0;
    tot += counter;

    counter++;
  }
}
```

Ora vediamo di creare un bel Menu [qui](PrimoApproccio.js)

Le propeietà delle variabili in js, ovvero ogni variabile ha delle funzioni e degli attributi associati come lenth(), toUpperCase, toLowerCase etc.

Le proprietà degli array

[Qui](altro.js)
