"""

  Stampare un menu con le seguenti voci:

  1.  Quadrato
  2.  Rettangolo
  3.  Triangolo isoscele

  L'utente può scegliere una delle figure geometriche selezionando il progressivo corrispondente (1 - 2 oppure 3).

  In base alla figura geometrica scelta, 
    chiedere all'utente di inserire le misure dei lati e/o dell'altezza che vi occorrono per calcolare, 
    per ciascuna figura geometrica, 
    la misura del perimetro e dell'area.

  Il programma, dunque, deve stampare la misura del perimetro e dell'area della figura scelta dall'utente.

"""
from math import sqrt


print("\nBenvenuto\n")

area = 0
perimentro = 0
figura = ""

numeroFigura = int(input("\nScegli una delle seguenti voci:\n1.  Quadrato\n2.  Rettangolo\n3.  Triangolo isoscele\n"))

if numeroFigura == 1:
    figura = "quadrato"
    lato = int(input("Inserisci il valore del lato\n"))
    area = lato**2
    perimentro = lato*4

elif numeroFigura == 2:
    figura = "rettangolo"

    base = int(input("Inserisci il valore della base\n"))
    altezza = int(input("Inserisci il valore del'altezza\n"))
    
    area = base*altezza
    perimentro = (base + altezza)*2

elif numeroFigura == 3:
    figura = "triangolo isoscele"
    x = input("Conosci l'altezza?(s/n)\n")

    if x == "s" or x == "S":
        base = int(input("Inserisci il valore della base\n"))        
        altezza = int(input("Inserisci il valore del'altezza\n"))

    else:
        base = int(input("Inserisci il valore della base\n"))
        lato = int(input("Inserisci il valore del lato obliquo\n"))
    
        altezza = sqrt( base**2 + lato**2 )     
        
    area = base*altezza/2
    perimentro = base + altezza*2

    
else:
    print("ops... c'è stato un errore")
    input("premi un tasto per chiudere\n")
    exit(0)

print(f"\nIl Perimetro:{perimentro}\nArea{area}\ndella figura {figura}\n")

