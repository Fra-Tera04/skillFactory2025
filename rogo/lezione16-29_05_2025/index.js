
let vettore = [12,34,56,23,8,75,42,0,1]


// Hai due liste di numeri (come voti di due studenti in materie diverse) 
// e vuoi ottenere una nuova lista che contiene la somma dei voti corrispondenti per ogni materia.

let list1 = [10,8,5,6,8,4]
let list2 = [8,6,7,3,6,7]

function somma_materie(l1, l2)
{
    let l3 = []

    if(l1.length != l2.length)
        return [];
    
    for (let i = 0; i < l1.length; i++) 
        l3[i] = l1[i] + l2[i];
    
    return l3;
}

// console.log(somma_materie(list1,list2))

// 2) confronta un elemento di v1 con il corrispettivo in v2 e conta quanti sono più grandi

function conta_x(l1, l2)
{
    let conta = 0;

    for (let i = 0; i < l1.length; i++) 
        if ( l1[i] > l2[i]) 
           conta++
            
    return conta;
}
// 3)Copia gli elementi del primo vettore nel secondo.

function copy(l1, l2)
{    
    for (const element of l1)
        l2.push(element)       
}

let l2 = [];
// copy(list1, l2)

// 4)Conta quante volte un elemento numerico di Vettore1 è uguale di un elemento numerico di Vettore2 nella posizione corrente.

function ugaule(l1,l2)
{
    let ret = 0;
    if( l1.length != l2.length)
        ret = -1;
    else
    {
        for( let i = 0; i < l1.length; i++)
            if(l1[i] == l2[i])
                ret++;
    }

    return ret;
}

// 5)Crea un vettore booleano che aggiunge un valore "true" quando il valore di un vettore numerico e' positivo, "false" quando e' negativo.
let lista3 = [-4,4,76,0,-21]

function cont_bool(l1)
{
    let ret = [];

    for (const elem of l1) 
        (elem >= 0)? ret.push(true) : ret.push(false);

}


// 6)Stampa a ritroso gli elementi di un vettore.

function stampa_a_ritroso(l1)
{
    for(let i = l1.length-1; i>=0; i--)
        console.log(l1[i])
}


// 7)Rimuovi gli elementi pari di un vettore numeri. 

function rimuovi_pari(l1)
{

    for(let i = l1.length-1; i>=0; i--)
        if(l1[i]%2 == 0)
            l1.splice(i,1);

    //return l1.filter( elem => elem%2 != 0 );
}
//console.log(list2)
// rimuovi_pari(list2);
//console.log(list2);


// 8) ordina in maniera crecscente


function swap(l1, i, j)
{
    let x = l1[i];
    l1[i] = l1[j];
    l1[j] = x;
}

function insert_sort(l1)
{

    for(let i = 1; i < l1.length; i++)
    {
        let max = l1[i];
        for( let j = 0; j < i; j++)
            if( max < l1[j] )
                swap(l1, i, j);
        
    }
}

//console.log(list2); insert_sort(list2); console.log(list2);


function buble_sort(l1)
{
    for(let i = 1; i <= l1.length; i++)
        for( let j = 0; j < l1.length-1; j++)
            if( l1[j] > l1[j+1] )
                swap(l1, j, j+1);
}

// console.log(list1); buble_sort(list1); console.log(list1);


function selection_sort_2(l1)
{}
//console.log(list1); buble_sort_2(list1); console.log(list1);


function verifica_parola(parola)
{
    let ret = true
    for( let i = 0; i < parola.length/2; i++)
        if(parola[i] != parola[parola.length-i-1])
        { 
            ret = false; 
            break
        }

    return ret;
}

function verifica_parola2(parola)
{
    let ret = 0;
    for( let i = 0; i < parola.length/2; i++)
        if(parola[i] == parola[parola.length-i-1])
        { 
            ret++        
        }

    return ret==length/2;
}

// console.log(verifica_parola("itopinonavevanonipoti")); console.log(verifica_parola("marco")); console.log(verifica_parola("agtahihatga"));



function insertionSort(arr) {
    
    for (let i = 1; i < arr.length; i++) {
        let key = arr[i];
        let j = i - 1;
 
        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j--;
        }
        
        arr[j + 1] = key;
    }
    
    return arr;
}
//console.log([5, 2, 4, 6, 1, 3]); console.log(insertionSort([5, 2, 4, 6, 1, 3]));




function do_while()
{
    let input = require("readline-sync");    

    let inizio = parseInt(Math.random()*10)
    let condizione = "";

    do
    {
        console.log(inizio)
        inizio++
        
        condizione = input.question("Vuoi continuare a contare?(s-n) ").toLowerCase();
        
    }
    while( condizione != "n" )

}

do_while()



/*
function quick_sort(vett)
{
    qs(vett, 0, vett.length-1)
}

function qs(vett, sx, dx)
{
    if( sx >= dx)
        return

    let q = qs_meta(vett, sx, dx)
    qs(vett, sx, q);
    qs(vett, q+1, dx);

}


function qs_meta(vett, sx, dx)
{
    let i = sx -1;
    let j = dx +1;

    while( i < j )
    {
        while( i<pivot)
        {
            swap(vett[i],pivot)
            i++;
        }
        while( j>pivot)
            swap(vett[j],pi)
            j--

    }
    return j;
}

*/
