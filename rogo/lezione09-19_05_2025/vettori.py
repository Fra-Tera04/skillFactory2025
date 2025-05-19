
# - ES per gli array ( 1, 2, 3, 4, 5, 6, 7, 8, 9 )


# leggi gli elementi tutti insieme
def vettori_1():
    numeri = [13,90,71,23,17]
    print(numeri)

# for each
def vettori_2():
    numeri = [22, 3, 7, 12, 30, 101]
    for x in numeri:
        print(x)

# uso il while e accedi alla posizione degli ellementi
def vettori_3():
    
    numeri = [22,3,7,12,30,101]
    indice = 0
    dimensione = len(numeri)

    while indice < dimensione:
        print(numeri[indice])
        indice+=1

# 
def arrey_5():
    numeri = [] 
    
    fine = 5
    for _ in range(fine):
        numeri.append(int(input()))

    print("\n-")

    for x in numeri:
        print(x)

def arrey_6():
    numeri = [] 
    fine = 3

    print("Insierisci 3 nominativi (nome cognome):")
    for indice in range(fine):
        numeri.append(input(str(indice+1)+": "))
        
    print("\n-\n")

    
    for x in numeri:
        print(x)

