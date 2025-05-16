

'''
3 4 
0 2 4 6 8 
28 50 52 54


1. Contare da 1 a 10 ma stampando i varo tra 3 e 7 (escluso);
2. Contare da 12 a 24 mostrando in output i valori minore di 17 e maggiorni di 22 (17 e 22 compresi);
3. Contare da 10 a 1 stampando solo i numeri pari;
4. Contare da 20 a 40 stampando solo i numeri dispari;
5. Contare da 27 a 55 ma stampare quanti numeri parsi sono stati trovati;

'''


# 1. Contare da 1 a 10 ma stampando i varo tra 3 e 7 (escluso);
def conta_1():
    for x in range(1,11):
        if x >= 3 and x<=7:
            print(x)

# 2. Contare da 12 a 24 mostrando in output i valori minore di 17 e maggiorni di 22 (17 e 22 compresi);
def conta_2():
    for x in range(12,24):
        if x < 17 or x > 22:
            print(x)

def conta_2_2():
    for x in range(12,18):
        if x <= 17:
            print(x)
    print("-")
    for x in range(18,24):
        if x >= 22:
            print(x)


# 3. Contare da 10 a 1 stampando solo i numeri pari;
def conta_3():
    for x in range(10,1,-1):
        if x % 2 == 0:
            print(x)

# 4. Contare da 20 a 40 stampando solo i numeri dispari;
def conta_4():
    for x in range(20,40):
        if x % 2 == 1:
            print(x) 

# se inizio con un dispari ti da sempre dispari... è geniaaaaale.
def conta_4_2():
    for x in range(19,40,2):
        print(x) 


# 5. Contare da 27 a 55 ma stampare quanti numeri pari sono stati trovati;
def conta_5():
    conta = 0
    for x in range(27,55):
        if x % 2 == 0:
            conta+=1
            print(x,conta) 






#conta_1()
#conta_2_2()
#conta_3()
#conta_4()
#conta_5()
conta_4_2()