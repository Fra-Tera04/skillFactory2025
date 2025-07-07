# Lezione 41 del 07/07/2025

## Indice

1. [Frameworks](#frameworks)

2. [WEB-APP](#app-web)
   1. [Introduzione](#introduzione)
   2. [REST API](#rest)

## Frameworks

### Introduzione

Un'architettura di supporto al programamtore per costruire programmi attravero l'IoD.

Spring ha sia la IoD che la DI.

Spring &rarr; IoC

a parte le classi model, Spring tratta i componenti come singleton.

Hybernate &rarr; orm (l'implementazione di HY dell'IoC)

crea db ad oggetti partendo dalle classi, perche uso la ram come base invece di mettere subito i dati su disco.

Con l'orm delegheremo le operazioni ddl dml dql.

### Spring Inizializer

Attraverso il quale possiamo inizializzare i metadati, le dipendenze, il linguaggio e il tipo di build Dependences (Maven/Gradle)

### Collegare Web e Java

Tramite @RestController diciamo che questa classe xxx dovrà essere gestita come un controller di richieste REST.

Con il @GetMapping mappiamo l'indirizzo /(qualcosa) verso il metodo sottostante.

@Param

## App Web:

Usiamo richieste http per dare informazioni alle quali il server può restituire:

1. 200 ok
2. 400 risorsa error
3. 500 server error

### REST

tipi di richieste: GET - POST

- Get: richiesta di default, per ottenre info.

- Post: per mandare info.
