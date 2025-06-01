/*
1. 
*/

// 1. ricerca un numero in un vettore

let input = require("readline-sync");
let vettore = [
  87, 433, 4567, 0, 8, 765, 43, 2, 9, 7, 21, 3, 4, 5, 6, 7, 65, 4, 0,
];

function ricerca(numero) {
  let ret = null;

  for (const elem of vettore) {
    if (elem == numero) {
      ret = numero;
      break;
    }
  }
  return ret;
}

// console.log(ricerca(input.question("insierisci un numero da cercare:" )));

//console.log(vettore)

function ricerca_2(numero) {
  let media_pari = 0;
  let media_dispari = 0;
  let n_volte = 0;
  let n_pari = 0;

  for (const elem of vettore) {
    if (elem == numero) n_volte++;

    if (elem % 2 == 0) {
      n_pari++;
      media_pari += elem;
    } else media_dispari += elem;
  }
  media_pari /= n_pari;
  media_dispari /= vettore.length - n_pari;

  return [n_volte, n_pari, vettore.length - n_pari, media_pari, media_dispari];
}

// console.log(ricerca_2(input.question("insierisci un numero da cercare:" )));

// avendo una matrice di stringhe 3x3 con primo elemento un vettore di campi (nome, cognome, eta), come secondo e terzo abbiamo degli esempi...
// output: [[nome,cognome,eta][pino, mauro, 30][bitno, vaurao, 40]]

let matrice_3x3 = [
  ["nome", "cognome", "età"],
  ["marco", "aurelio", "30"],
  ["massimo", "decimo", "20"],
];

function vedi_matrice() {
  let riga = "";

  for (let i = 0; i < matrice_3x3.length; i++) 
  {
    riga = "";
    for (let j = 0; j < matrice_3x3[i].length; j++)
      //console.log(matrice_3x3[i])
      riga += matrice_3x3[i][j] + " ";

    console.log(riga);
  }
}

vedi_matrice();
