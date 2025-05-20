'''

utente = {
    "nome":"",
    "congnome":"",
    "cf":"",
    "citta":""
}

'''

utenti = []
scelta = 1
fine = -1


def menu():
    print("\n--Menu--")
    print("Opzione 1 - Inserisci Utente")
    print("Opzione 2 - Leggi Utenti Inseriti")
    print("Opzione 3 - Cerca un Utenti per CF")
    print("Opzione 4 - Esci")
    print("")


def inserimento_utente():
    
    nome_ = input("Inserisci il nome dell'Utente: ")
    congome_ = input("Inserisci il cognome: ")
    cf_ = input("Inserisci il Codice Fiscale: ")
    citta_ = input("Inserisci la Città: ")

    utente = dict(nome = nome_, cognome = congome_, cf = cf_, citta = citta_)
    utenti.append(utente)

    input("premi un tasto per continuare...\n")




def visualizza_utente( utente ):

    if isinstance(utente, dict):
        print("\nRiga | Nome | Cognome | Codice Fiscale | Città\n")
        print(f"0 | {utente["nome"]} | {utente["cognome"]} | {utente["cf"]} | {utente["citta"]}\n")
    else:
        print("Utente non trovato\n")



def visuailzza_utenti():

    print("\nRiga | Nome | Cognome | Codice Fiscale | Città\n")
    
    count = 0
    for utente in utenti:
        print(f"{count} | {utente["nome"]} | {utente["cognome"]} | {utente["cf"]} | {utente["citta"]}")
        count+=1

    input("\npremi un tasto per continuare...\n")
    

def ricerca_by_cf():
    cf_ = input("insiersc il cf: ")
    ret = {}

    for utente in utenti:
        if utente["cf"] == cf_:
            ret = utente
            break

    
    input("premi un tasto per continuare...\n")
    return ret

    
def esci():
    print("Alla prossima\n\n")



# processo:

while scelta != fine:

    menu()

    scelta = input("\nScegli un'opzione da 1-4: ")
            
    if scelta == "1":
        inserimento_utente()

    elif scelta == "2":
        visuailzza_utenti()
                
    elif scelta == "3":
        visualizza_utente(ricerca_by_cf())

    elif scelta == "4":
        scelta = -1
        esci()

    else:
        print("Scelta non contemplata\n")


