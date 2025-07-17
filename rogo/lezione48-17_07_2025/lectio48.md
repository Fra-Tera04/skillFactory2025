# Lezione 48 del 17/07/2025

## Indice

1. [Framework](#cosè-un-framework)
   1. [Spring](#spring)
   2. [Hibernate](#hibernate)
   3. [Maven](#maven)
2. [Dipendenze](#dipendenze)

## Cos'è un Framework

Framework. Piattaforma/Tecnologia di supporto per la realizzazione di programmi tramite il principio di IoC.

### Spring

E' un framework che implementa l'Ioc tramite le DI (Dependency Injection) e che tratta tutti gli elementi tramme i Bean come Singleton ( un design pattern che regola a un numero limitato, di solito uno, le istanze di una classe).

### Hibernate

Un ORM mappa gli Oggetti di un linguaggio di programmazione a un DB Realzionale e usa le notazioni e i riferimenti per implemtare le _foreign key_

### Maven

Un compilatore e gestore di pacchietti che gestisce le dipendenze attraverso il file POM.xml

Ogni modulo pom ha due Cooredinate chiave che sono:

1. il GroupID &rarr; Percorso delle cartelle
2. l'ArtifactID &rarr; Nome del progetto

## Dipendenze

### Spring Web

modulo per la gestione (invio/ricezione) di richieste HTTP

Le risposte Http variano in base al Content/Type che possono essere di tipo

1. text/html &rarr; formati .html
2. image/jpeg &rarr; formati di immagini
3. audio/mp3 &rarr; formati audio
4. video/mp4 &rarr; formati video

### Lombok

modulo per evitare codice boilerpalte

### Spring Data JPA

modulo per mappare oggetti Java con tabelle relazionali ( tra cui: hibernate, SpringORM, SpringDAO)

### Hibenrate

è una implementazione di Data JPA

### MySQL Driver

### Thymelife

un tamplate engine che aggiunge attributi compatibili con html identificati dal prefisso th e sec.

### Spring Security

un modulo per la sicurezza riguardo l'autenticazione e l'autorizzazione di alcune risorse.

### Jasypt

per la criptazione e decriptazione delle password

### Spring Boot

un'estenzione di Spring che automatiza e semplifica le configurazioni Spring ( beans.xml )
