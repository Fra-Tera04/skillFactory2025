magari posso usare latex...

1. Ottenere l'importo di ogni ordine

   - NB: usare la funzione di aggragazione sum(nome_campo) per avere l'importo come il totale dei prezzi.

   - //Clausola: group by

2. Selezionare gli ordini con un importo maggiore o uguale di 400€

   - //Clausola: having

3. Selezionare gli ordini contenenti meno di 4 prodotti

4. selezionare gli ordini aventi un importo compreso tra 400 e 500€
   //Clausola: between

5. trovare il prezzo minimo e quello massimo dalla tabella dei prodotti
   //No clausole

6. trovare il prezzo minimo e quello massimo dalla tabella dei prodotti unendo due query
   //clausola: union (e' una clausola che si mette tra due select)

7. Cercare i prodotti col prezzo minimo e quelli col prezzo massimo
   //Clausola: in (con subquery)
   //Clausola like

8. Cercare tutti i prodotti che iniziano con "m"

9. Cercare tutti i prodotti che comprendono la parola "barilla"

10. Cercare i prodotti che finiscono con "o"

11. alterare la tabella dei prodotti aggiungendo come "not null" le seguenti colonne:
    descrizione, sconto
    //Comandi DDL
12. alterare la tabella dei prodotti rimuovendo la colonna sconto aggiunta nella richiesta n.12

13. rinominare la tabella dei prodotti in products

14. rinominare il campo descrizione in description nella tabella products
