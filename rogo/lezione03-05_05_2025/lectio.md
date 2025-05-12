# Lezione 3

## Indice degli Argomenti

- [Una Infarinatura per un Informatico](#una-infarinatura-per-un-informatico)
  - [Intranet](#intranet)
    - [Risorse](#risorse)
    - [Gestori](#gestori)
  - [Internet](#internet)
  - [Pagine WEB](#pagine-web)
  - [Come una Email arriva al Mittente](#come-una-email-arriva-al-mittente)
  - [La Programmazione](#la-programmazione)

---

## Una Infarinatura per un Informatico

### Intranet

L'intranet è una rete privata<br>
( _Intra_-interna _Net_-network )

- #### Risorse

  - **DBMS** : Software che ci permette di gestire un database ( _Database Management System_ ).
  - **PC** : Personal Computer.

- #### Gestori

  - **Hub** : Un dispositivo che invia un segnale a molti dispositivi.
  - **Switch** : Un dispositivo che invia un segnale a molti dispositivi, con la possibilità di specificare quali.
  - **Router** : Un dispositivo che fa da ponte tra l'intranet e l'internet. Si occupa di instradare le informazioni su internet.

### Internet

La rete pubblica

- **WWW** : Protocollo con cui è costruito internet; consiste in pagine ipertestuali collegate tra loro.
- **URL** : Protocollo per identificare le risorse su internet ( _Uniform Resource Locator_ ).
- **DNS** : Dispositivo hardware/software capace di associare un nome in linguaggio naturale a un indirizzo IP ( _Dinamic Name System_ ).
- **Indirizzo IP** : Protocollo per identificare dispositivi su internet ( es. IPv4, IPv6 ).

### Pagine WEB

scritte in html _Hyper Text Markup Language_

- protocolli
  - http _Hyper Text Transfer Protocol_ : permette di raggiungere/recuperare pagine web
  - https _Hyper Text Transfer Protocol Secure_ : fornisce l'encriptamento delle informazioni

### Come una Email arriva al Mittente

client <-> server <-> client <br>
client <-> server <-> server <-> client <br>
client <-> server mail box <-> server <-> server <-> server mail box <-> client <br>

- client mittente
  - umano mittente
- server mail box
  - servizio che stora le email
  - comunica con il client tramite i protocolli _POP3_, _IMAP_ etc.
- server
  - i server comunicano tra loro tramite il protocollo _SMTP_ che invia la posta elettronica
- client destinatario
  - tramite il protocollo preferito si accede al server di mail box

### La Programmazione

- **I Costrutti Logici :**
  - La sequenza ( _es: x+=1_ )
  - La condizione ( _es: if else_ )
  - L'iterazione ( _es: for, while_ )
