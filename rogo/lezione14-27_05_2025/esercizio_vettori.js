
let input = require('readline-sync');

let utenti = [];

function display_menu(){
    console.log("---MENU---")
    console.log("1. View")
    console.log("2. Add")
    console.log("3. ")
    console.log("10. Esci")

}

function leggiString(m)
{
    return input.question(m);
}

function leggiInt(m)
{
    return parseInt(input.question(m));
}

function leggiFloat(m)
{
    return parseFloat(input.question(m));
}

function form_utente()
{
    let nome = leggiString("Scrivi il tuo nome: ")
    let cognome = leggiString("Scrivi il tuo cognome: ")
    let eta = leggiInt("Scrivi la tua età: ")
    let stipendio = leggiFloat("Inserisci il tuo stipendio: ")

    let utente = nome + ";" + cognome + ";" + eta + ";" + stipendio;
    return utente
}

function addUtente(utente)
{
    utenti.push(utente);
}


function view_utentei()
{
    for (const element of utenti) {
        console.log(element)
    }
    console.log("\n")
}


let scelta  = 0;
while(scelta != 10){       

    display_menu();
    scelta = leggiInt("Inserisci la tua scelta: ")

    switch (scelta) {
        case 1:
            view_utentei();
            break;

        case 2:
            addUtente(form_utente())
            break
            
        case 3:            
            break

        case 4:
            break

        default:
            scelta = 10
            console.log("default")
            break;
    }
}
