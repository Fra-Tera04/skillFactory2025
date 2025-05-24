'''
1)Vogliamo calcolare l'età di una persona e poi stampare un messaggio di benvenuto con quell'età.

Funzione 1 (calcola_eta): Riceve l'anno di nascita e l'anno corrente, e restituisce l'età.
Funzione 2 (stampa_messaggio_eta): Riceve l'età, e stampa un messaggio come "Hai 15 anni. Benvenuto!".
--------------------------

2)Hai una lunghezza in centimetri e vuoi convertirla in metri, poi mostrare il risultato in modo chiaro.

Funzione 1 (cm_a_metri): Riceve una lunghezza in centimetri, e restituisce la stessa lunghezza in metri.
Funzione 2 (mostra_risultato_conversione): Riceve una lunghezza in metri, e stampa un messaggio come "La lunghezza è 1.75 metri."
--------------------------

3)Vuoi calcolare il prezzo di una pizza in base al numero di ingredienti extra, e poi calcolare il prezzo totale per più pizze.

Funzione 1 (calcola_costo_pizza): Riceve il prezzo base della pizza e il numero di ingredienti extra, e restituisce il costo totale della singola pizza. (Ogni extra costa 1.50 euro).
Funzione 2 (calcola_totale_ordine): Riceve il costo di una singola pizza e la quantità di pizze, e restituisce il totale dell'ordine.
--------------------------

4)Hai un semaforo e vuoi sapere qual è il colore successivo, per poi stamparlo.

Funzione 1 (prossimo_colore_semaforo): Riceve il colore attuale del semaforo ("verde", "giallo", "rosso") e restituisce il colore successivo.
Funzione 2 (annuncia_cambio_semaforo): Riceve il nuovo colore e stampa "Il semaforo è ora [colore]".
--------------------------

5)Hai un prezzo originale e una percentuale di sconto. Vuoi calcolare il prezzo finale scontato, e poi mostrare quanto hai risparmiato.

Funzione 1 (calcola_prezzo_scontato): Riceve il prezzo originale e la percentuale di sconto, e restituisce il prezzo finale.
Funzione 2 (mostra_risparmio): Riceve il prezzo originale e il prezzo scontato, e stampa quanto si è risparmiato.
'''


# 1)Vogliamo calcolare l'età di una persona e poi stampare un messaggio di benvenuto con quell'età.

def calcola_eta(anno):
    return 2025-anno

def stampa_eta(eta):
    print(f"Hai {eta} anni. Benvenuto!")

# stampa_eta(calcola_eta(int(input("Inserisci il tuo anno di nascita... "))))




# 2)Hai una lunghezza in centimetri e vuoi convertirla in metri, poi mostrare il risultato in modo chiaro.

def cambio_cm_m(centimetri):
    return centimetri * 100

def stampa_metri(metri):
    print(f"La lunghezza è {metri} metri.")




# 3)Vuoi calcolare il prezzo di una pizza in base al numero di ingredienti extra, e poi calcolare il prezzo totale per più pizze.

def costo_pizza_con_extra( costo_una_pizza, n_ingredienti):
    return costo_una_pizza + n_ingredienti*1.5

def costo_complessivo(costo_pizza, n_pizze):
    return costo_pizza * n_pizze

# print(costo_complessivo( costo_pizza_con_extra(int(input("quanto csota la tua pizza?")), int(input("quanti ingredienti in più vuoi?"))), int(input("quante pizze vuoi?"))))


# 4)Hai un semaforo e vuoi sapere qual è il colore successivo, per poi stamparlo.

def next_color(colore):
    ret = ""
    
    if colore == "verde":
        ret = "giallo"
        
    elif colore == "giallo":
        ret = "rosso"
        
    elif colore == "rosso":
        ret = "verde"

    else:
        ret = "Colore non riconsciuto"

    return ret

def stampa_colore(colore):
    print(f"Il colore del semaforo ora è {colore}\n")

# stampa_colore(next_color(input("\nDi che colore è ora il semaforo? (verde-giallo-rosso)\n")))



# 5)Hai un prezzo originale e una percentuale di sconto. Vuoi calcolare il prezzo finale scontato, e poi mostrare quanto hai risparmiato.

def calcola_sconto(prezzo_articolo, percentuale_sconto):
    if percentuale_sconto > 1:
        percentuale_sconto /= 100

    return prezzo_articolo*percentuale_sconto

def mostra_risparmio(prezzo_iniziale, prezzo_scontato):
    print(f"Hai risparmiato esattamente {prezzo_iniziale-prezzo_scontato}")

mostra_risparmio(100,calcola_sconto(100,.5))
