"""

  per svolgere questo esercizio è necessario conoscere gli operatori logici:

  Dati i seguenti criteri di valutazione:
  da 1 a 10 - insufficiente
  da 11 a 20 - mediocre
  da 21 a 30 - sufficiente
  da 31 a 40 - distinto
  da 41 a 50 - ottimo
  da 51 a 100 - eccellente

  Chiedere all'utente di inserire un numero intero.
  Se il numero intero è presente in uno degli intervalli sopra descritti allora stampare la valutazione corrispondente.

  Ad esempio:
  se numero inserito è compreso tra 11 e 20 allora
  stampare "Valutazione: mediocre."
  In questo esercizio dovete controllare se il numero inserito dall'utente è presente in uno degli intervalli di valori.
  Per farlo dovete effettuare due confronti ed unirli con l'operatore logico and.

"""

print("\nBenvenuto")
numero = int(input("Inserisci pure un numero tra 1-100\n"))

if 1 <= numero and numero <= 10:
    print("Valutazione: insufficiente.")

elif 11 <= numero <= 20:
    print("Valutazione: mediocre.")

elif 21 <= numero <= 30:
    print("Valutazione: sufficiente.")

elif 31 <= numero <= 40:
    print("Valutazione: distinto.")

elif 41 <= numero <= 50:
    print("Valutazione: ottimo.")

elif 51 <= numero <= 100:
    print("Valutazione: eccellente.")

else:
    print("Numero fuori dall'intervallo specificato.")

print("\n")