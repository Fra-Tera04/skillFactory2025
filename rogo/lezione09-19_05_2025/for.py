'''
- Es per il FOR ( 1, 2, 3, 4, 5, )

'''

# Traccia 1: usando il ciclo for, conta da 3 a 33
def conta_1():
    for x in range(3,34):
        print(x)

# Traccia 2: usando il ciclo for, conta da 10 a 1
def conta_2():
    for x in range(10, 0, -1):
        print(x)

# Traccia 3: conta da 21 a 33, stampando solo i numeri pari
def conta_pari():
    for x in range(21, 34):
        if x % 2 == 0:
            print(x)

# Traccia 4: conta da 20 a 50, stampando solo i numeri da 33 a 47 escluso
def conta_4():
    for x in range(20, 51):
        if x >= 33 and x < 47:
            print(x)

# Traccia 5: conta da 30 a 60, stampando solo i numeri minori di 37 (escluso) e maggiori di 44 incluso
def conta_5():
    for x in range(30, 61):
        if x < 37 or x >= 44:
            print(x)

# Traccia 6: conta da 17 a 79, stampando quanti numeri dispari hai trovato
def conta_6():
    disp = 0
    for x in range(17, 80):
        if x % 2 == 1:
            disp += 1
    print(disp)

# Traccia 7: conta da 78 a 13, stampa la somma dei valori pari 
def conta_7():
    somma = 0
    for x in range(78, 12, -1):
        if x % 2 == 0:
            somma += x
    print(somma)
    




## sfida meme
def svastica(n=7):
    """
    Stampa una svastica di dimensione n x n (n dispari e >= 5).
    """
    if n < 5 or n % 2 == 0:
        print("La dimensione deve essere un numero dispari >= 5.")
        return

    for i in range(n):
        riga = ""
        for j in range(n):
            if (
                (i < n // 2 and j == 0) or
                (i == n // 2) or
                (i >= n // 2 and j == n - 1) or
                (j == n // 2) or
                (i == 0 and j >= n // 2) or
                (i == n - 1 and j <= n // 2)
            ):
                riga += "*"
            else:
                riga += " "
        print(riga)


