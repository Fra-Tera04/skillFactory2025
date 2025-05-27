
/*
1. Primo assaggio degli scope con var e let in SOMMA

2. Creazione di un MENU

*/
let input = require('readline-sync')


function display_menu(){

    console.log("---MENU---")
    console.log("1. Somma con il while")
    console.log("2. ")
    console.log("3. ")
    console.log("10. Esci")

}


function somma_while() {
  let counter = 0;
  let tot = 0;  
  while (counter <= 5) {
    console.log(counter);

    tot += counter;

    counter++;
  }
  console.log(tot)
}

function conta_for(){
    let conta_x = 0

    for (let index = 0; index < 5; index++){
        conta_x += index;
        console.log(conta_x)
    }

}

function conta_for_allindietro(){

    for (let index = 5; index > 0; index--){
        console.log(index)
    }
}


function conta_pari() {
    let fine = 10;
    for (let i = 0; i< fine; i++)
        if( i%2 == 0)
            console.log(i)
}

// conta a ritroso da 30 a 20
// stampa quanti valori dispari trovi

function conta_dipari() 
{
    let somma = 0;
    for (let i = 30; i >= 20; i--)
        if( i % 2 == 1)
            somma++;

    console.log(somma);
}


// conta da 1-20 

function marzapane()
{
    let i = 0;
    let fine = 20;

    while (i < fine)
    {
        if( i >= 10 && i <= 15)
            console.log(i)
        i++
    }

}

function marzapane_2()
{
    let i = 0;
    let fine = 20;

    while (i < fine)
    {
        if(i < 10 || i > 15)
            console.log(i)
        i++
    }

}



let scelta = 4;

while(scelta != 10){       

    display_menu();


    scelta = parseInt( question("INserisci un'opzione: "));
    switch (scelta) {
        case 1:
            console.log("stampo"+ scelta)
            break;
        case 2:
            somma_while();
            break
            
        case 3:
            conta_for();
            scelta = 10;
            break
            
        case 4:
            conta_for_allindietro()
            scelta = 10;
            break
        
        case 5:
            display_menu();
            break

        case 6:
            conta_pari();
            break;

        case 7:
            conta_dipari();
            break;

        default:
            scelta = 10
            console.log("default")
            break;
    }
}
