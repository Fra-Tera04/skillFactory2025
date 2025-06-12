## Attività di Testing PT2

### Introduzione al Ciclo di Vita del Testing

- test palanning

  Quel documento in cui il test manager descrive gli obiettivi del/dei test

- progettazione -> peer review

- implementazione -> test case

- erogazione

- chiusura

#### Tipi di test

manuale e automatico

#### Precondizioni:

1. cell
2. pc

- link: [pagina](https://it.surveymonkey.com/r/inapp_rilevazione_fabbisogni_formativi "pagina per il testing")

- Test case da controllare:

  1.  L'obbligatorietà delle domande, devi per forza compilarla per andare avanti, l'asterico

  2.  Coerenza delle risposte

      1. risposta singola ( il radiobutton, cerchietto )
      2. risposta multripla ( casella )
         - massimo n risposte
      3. testbox
         - code injection
         - lunghezza delle stringhe sufficienete
      4. controllo delle matrici di selezione
      5. peer review

  3.  domande sul corso
      1. si -> specifiche per la formazione -> contatto
      2. no -> skip
      3. dopo -> contatto
      4. invio email per la partecipazione a un corso
  4.  ringrazionamento
  5.  informativa privacy

#### Fasi del testing già eseguite dal team di Skillfactory:

1. test funzionali
2. smoke testing
   - testing preliminare riguardo le funzonalità base.
