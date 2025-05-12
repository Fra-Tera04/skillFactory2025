
"""
Esercizio 1:
    
    Inserire il nome di due utenti diversi, inserire le loro eta.
    Confrontare le loro eta:

    Se eta1 è più grande di eta2 allora esegui
    stampa nome1 è più grande di nome2

    Altrimenti se eta1 è più piccolo di eta2 allora esegui
    stampa nome1 è più piccolo di nome2

    Altrimenti esegui
    stampa nome1 è coetaneo di nome2

"""
print("\nBenvenuto\n")

nomeUtente1 = input("insierisci il nome dell'Utente 1\n")
etaUtente1 = int(input("inserisci l'età dell'Utente 1\n"))

nomeUtente2 = input("insierisci il nome dell'Utente 2\n")
etaUtente2 = int(input("inserisci l'età dell'Utente 2\n"))


# Confronto delle età
if etaUtente1 > etaUtente2:
    print(f"{nomeUtente1} è più grande di {nomeUtente2}")

elif etaUtente1 < etaUtente2:
    print(f"{nomeUtente1} è più piccolo di {nomeUtente2}")

else:
    print(f"{nomeUtente1} è coetaneo di {nomeUtente2}")
    
