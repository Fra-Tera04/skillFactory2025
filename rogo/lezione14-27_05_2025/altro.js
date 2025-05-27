
// operazini su stringhe:

function op_su_stringhe()
{
    let nom = "Mam";
    let cognome = "Ma";
    let eta = 30;

    console.log(nom.toUpperCase()+" " +cognome+" "+eta)
}

// operazioni su array

function op_su_vett()
{
    let numeri = [14,1,99,29,223];
    console.log(numeri)
    numeri.pop()
    numeri.push(112)
    console.log(numeri)
}

// 1. somma gli elementi pari dal vettore: [13, 1, 20, 5, 7]

let vettore = [13, 1, 20, 5, 8]

function somma_1()
{
    let somma = 0;
    for (const element of vettore)
        somma += (element %2==0)? element: 0;
        
    console.log(somma)
}

// 2. fai la media artimetica sugli elem dispari del vettore

function media_ari()
{
    let media = 0;
    let count = 0;
    for(const elem of vettore){
        if(elem%2 == 1)
        { 
            media += elem
            count++
        }
    }

    media /= (count != 0)? count : 1;
    console.log(media)
}

vettore = [];

