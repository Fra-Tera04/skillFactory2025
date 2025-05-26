from inspect import _void


utenti = []

def leggi(utente):

    if isinstance(utente, str):
        if utente == "":
            print("CF non trovato")

        else:
            print(f"Info-Utente = {utente}\n")

    if isinstance(utente, dict):
        print(f"nome = {utente["nome"]}\nCF = {utente["CF"]}\n")
    
    if isinstance(utente, list):
        for utente in utenti:
            print(f"nome = {utente["nome"]}\nCF = {utente["CF"]}\n")


def inserimento(utente):
    utenti.append(utente)
    
def rimuovi_remove(utente):
    
    if isinstance(utente, dict):
            utenti.remove(utente)

    elif isinstance(utente, str):
        for user in utenti:
            if user["CF"] == utente:
                utenti.remove(user)
                break


def rimuovi_pop(cf):
    for i in range(0, len(utenti)):        
        if utenti[i]["CF"] == cf:
            utenti.pop(i)
            break

# pop e remove base funzioanno ma c'è un caso in cui falliscono:
# il problema è che pop e remove modificano la lista su cui il loop opera
# quindi può succedere che con la rimozione si salti un elemento
# oppure si vada oltre la dimensione dell'array

# con le versione _1 e _2 non c'è questo problema

'''
def rimuovi_pop_1(cf):
    dim = len(utenti)
    for i in range(0, dim):
        if utenti[i]["CF"] == cf:
            utenti.pop(i)
            break


def rimuovi_pop_2(cf):
    for i in range(len(utenti) -1, -1, -1):        
        if utenti[i]["CF"] == cf:
            utenti.pop(i)
            break


def rimuovi_remove_1(cf):
    for utente in utenti[:]:
        if utente["CF"] == cf:
            utenti.remove(utente)
            break

def rimuovi_remove_2(cf):
    u = ""
    for utente in utenti:
        if utente["CF"] == cf:
            u = utente
            break
    utenti.remove(u)
'''


def form_registrazione():
    nome_ = input("Nome: ")
    CF_ = input("CF: ")

    return dict(nome=nome_, CF=CF_)

def cerca():
    cf_ = input("Inserisci il cf della persona... ")
    ret = ""

    for utente in utenti:
        if utente["CF"] == cf_:
            ret = utente
            break

    return ret




def menu():
    print("---MENU---")
    print("1. Aggiungi un utente")
    print("2. Cerca un utente")
    print("3. VIsualizza tutti gli utenti")
    print("4. Elimina un utente")
    print("5. Esci")

scelta = "1"

while scelta != "Esci":
    
    menu()
    scelta = input("\nScegli un'opzione... ")

    if scelta == "1":
        inserimento(form_registrazione())
        print("\n")

    elif scelta == "2":
        leggi(cerca())
        print("\n")

    elif scelta == "3":
        leggi(utenti)

    elif scelta == "4":
        rimuovi_remove(input("Scrivi il cf cell'utente che vuoi eliminare.\n"))
        print("\n")

    elif scelta == "5":
        scelta = "Esci"
        print("\n")

    else:
        print("Input non valido, riprova...\n")

    input("Premi Invio...\n")


#print(utenti)
