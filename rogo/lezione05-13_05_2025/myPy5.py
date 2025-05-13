

# SEZIONE C-2
'''
def menu_calcolatrice():
    print("---MENU---")
    print("1) somma ver. 1")
    print("1) somma ver. 2")

def somma_version_1():
    numero1 = 5
    numero2 = 8

    somma = numero1 + numero2

    print(somma)

def confronto_numeri():
    n1 = int(input("Dammi il primo numero:\n"))
    n2 = int(input("Dammi il secondo numero:\n"))

    if n1 > n2 :
        print(str(n1)+" è più grande di "+str(n2))
    elif n1 < n2:
        somma_version_1()
    else:
        print("I valori sono uguali!\n")

menu_calcolatrice()
confronto_numeri()

'''

# Sezione C-3 - Esercizio
def menu_semaforo():
    print("---SEMAFORO---")
    print("Il semaforo può essere: Verde-Giallo-Rosso")


def semaforo():
    colore = input("Inscerisci il colore del Semaforo:\n").lower()

    if colore == "verde":
        print("|" + colore + " -> vai|")

    elif colore == "giallo":
        print("|" + colore + " -> Attenzione|")

    elif colore == "rosso":
        print("|" + colore + " -> Fermati|")

    else:
        print("\nAttenzione: Alcol Test necessario!\n")

menu_semaforo()
semaforo()

"""

"""
