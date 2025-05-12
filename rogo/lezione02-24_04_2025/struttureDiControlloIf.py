# Numero direttive: 2 

# direttiva 1 : crea un menu per far scegli una delle 4 operazioni base, inserire due nueri qualsiasi ed evitare eccezioni

"""
print("\nscegli una delle 4 operazioni base")
print("1 - addizione\n2 - sottrazione\n3 - moltiplicazione\n4 - divisione\n")

# operazione = int(input("inserisci l'operazione:\n")) #v1
operazione = input("inserisci l'operazione:\n") 

x1 = float(input("inserisci il primo numero:\n"))
x2 = float(input("inserisci il secondo numero:\n"))


if operazione == "1":
    x3 = x1 + x2
elif operazione == "2":
    x3 = x1 - x2
elif operazione == "3":
    x3 = x1 * x2
elif operazione == "4":
    if x2 != 0:
        x3 = x1 / x2
    else:
        print("non è possibile dividere per 0\nFine programma\n")
        x3 = "error"
else:
    print("qualcosa è andato storto\n")
    x3 = "error" 

if x3 != "error":
    print("Risultato: " + str(x3))


# input("previ invio per contnuare...")
"""

# direttiva 2: stampa "maggiorenne" o "minorenne" in base all'età della persona

nome = input("inserisci il tuo nome:\n")
eta = int(input("inserisci la tua eta:\n"))
condizione = "maggiorenne"

if eta < 18:
    condizione = "minorenne"

print(nome+" è " + condizione)
