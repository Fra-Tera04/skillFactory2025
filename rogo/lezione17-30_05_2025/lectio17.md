# Lezione 17 del 30-05-2025

## Indice

## Node - JS

Oggi si continua a fare esercizi su js [qui](index.js)

## Git

Uno strumento di versionamento del codice sulla tua macchina, leggero ed efficiente. Si sviluppa nel preare un servizio capace di salvare le varie versioni del tuo progetto divise per unità base: tramite `commit`, distribuiti per un insieme ben diviso di _commit_ e obbiettivi nei veri `branches`, puoi cambiare branch tramite il comando `switch`.

Le operazioni base di git iniziano tutte con il comando `git` nel terminale seguito da uno di qusti:

1. init
   - per settare l'ambiente
   - devi stare nella cartella dove vuoi afr partire il tuo progetto
   - si fa solo una volta
2. add
   - il comando è `git add <nome-file>`
   - aggiungerà il file ai files modificati e da voler salvare
3. commit
   - salverà i files aggiunti con `add` nel branch di riferimento
   - il branch di riferimento di base è il _Master_ che è quello principale
   - tramite il comando `git commit -m "cosa è successo"`
4. branch
   - con questo argomento possiamo creare un nuovo branch aggiungendo il nome del branch al comando
   - `git branch <nome-branch>`
   - per eliminare un branch si usa il comando: `git branch -d <nome-branch>`
5. switch
   - tramite questo comando si può cambiare branch
   - il comando è `git switch <nome-branch>`
   - per crare un nuovo branch si usa il comando `git switch -c <nome-branch>`
6. restore
   - questo comando serve per ripristinare i files
   - tramite il comando `git restore <nome-file>` si ritorna indietro all'ultimo file committato
7. status
   - per conoscere alcuni dettagli del repository
8. clone
   - questo comando ti clona, copia in locale, un git remoto.
   - tramite il comando `git clone <url-ssh>`
9. push
   - tramite `git push <nome-remoto> <nome-branch>`
10. pull
    - tramite `git pull <nome-remoto> <nome-branch>`

## GitHub

E' un sisitema centralizzato che hosta i tuoi progetti e implementa il loro versioning
