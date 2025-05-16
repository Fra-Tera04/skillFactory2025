'''
INDICE argomenti:

- calcolatrice
- conta da 1 a 10
'''


# CALCOLATRICE
'''
def calcolatrice():
    print("\n---MENU---\n")
    print("1. somma")
    print("2. sottrazione")
    print("3. Moltiprimcazione")
    print("4. Divisione")
    print("5 per smettere")
    print("\n---END---\n")
    
    operazione = 0
    while operazione != 5:
        operazione = int(input("\nScegli l'operazione:\n"))
        numero1 = int(input("Inserisci il primo numero: "))
        numero2 = int(input("Inserisci il secondo numero: "))

        if operazione == 1 :
            print("Hai scelto la somma")
            risultato =  numero1 + numero2
        if operazione == 2 :
            print("Hai scelto la sottrazione")
            risultato =  numero1 - numero2
        if operazione == 3 :
            print("Hai scelto la moltiplicazione")
            risultato =  numero1 * numero2
        if operazione == 4 :
            print("Hai scelto la divisione")
            risultato =  numero1 / numero2
        print(risultato)

calcolatrice()
'''


# CONTA 
# usa il while, usa gli operatori relazionli


def conta():
    x = 1
    p = ""
    while x <= 9:
        p += str(x) + "-"
        x += 1

    p += str(x)
    print(p)

def piramide():

    limite = 5
    x = 1
    while x <= limite:
        spazi = ""
        y = 1
        while y <= (limite - x):
            spazi += " "
            y += 1

        asterischi = ""
        y = 1
        while y <= (2 * x - 1):
            asterischi += "*"
            y += 1

        print(spazi + asterischi)
        x += 1

'''
   
    for x in range(1,5):
        
        dx = dx-x
        for _ in range(1,dx):
            space += " "
        for _ in range(1,x):
            asterisco += "*" 
        
        print(space + asterisco)
        space = ""
'''     

#conta()
piramide()
