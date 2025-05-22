'''
1. stampa di nome e cognome  presi da input, passandoli a una funz.

2. prendi un valore numerico da input in 'fine', lo passi a una funzione che conta da 1 a 'fine'

3. verifica username,  (a) -> true se 12>len(a)>3
    f1(list): -> true se 12>len(a)>3
    f2(bool): "username valido"/"username non valido"

4. f(a, b) { conta o crescente o decrescente o stampa "conta impossibile" in base all'equivalenza tra a e b} 
'''

#  1  
def stampa(nome, cognome):
    print(f"Nome = {nome}\nCognome = {cognome}")


'''
nome = input("Inserisci nome: ")
cognome = input("Inserisci cognome: ")

stampa(nome, cognome)
'''



def conta(inizio, fine):
    for count in range(inizio,fine+1):
        print(count)


#conta( int(input("fino a che nuemr ovuoi contare? ")))


#3

def verifica_username(username):
    return 3 <= len(username) <= 12

def stampa_verifica(boo):
    if boo:
        print("username valido")
    else:
        print("username non valido")

#stampa_verifica(verifica_username(input("Inserisci un username: ")))


#4. f(a, b) { conta o crescente o decrescente o stampa "conta impossibile" in base all'equivalenza tra a e b} 

def super_conta(x1, x2):
    if x1 > x2:
        super_for(x1,x2-1,-1)
    elif x1 <= x2:
        super_for(x1,x2+1,1)
    else:
        print("conta impossibile")

def super_for(inizio,fine,step):
    for x in range(inizio,fine,step):
        print(x)

x1 = int(input("Inserisci il primo valore: "))
x2 = int(input("Inserisci il secondo valore: "))
super_conta(x1,x2)


