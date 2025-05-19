
'''
funzioni:
    gestionale
    menu
    inserimento_utente
    visuailzza_utenti
    esci

start: 
    gestionale

'''

utenti = []

def menu():
    print("\n--Menu--")
    print("Opzione 1 - Inserisci Utente")
    print("Opzione 2 - Leggi Utenti Insieriti")
    print("Opzione 3 - Esci")
    print("")


def gestionale():
    scelta = 1
    fine = 3
    
    while scelta != fine:

        menu()

        scelta = int(input("\nScegli un'opzione da 1-4: "))
        
        if scelta == 1:
            inserimento_utente()

        elif scelta == 2:
            visuailzza_utenti()
            
        elif scelta == 3:
            esci()            

        elif scelta == 4:
           esci()

        else:
            print("Scelta non contemplata")



def inserimento_utente():
    
    utente_ = input("Inserisci il nome dell'Utente: ")
    utente_ += " " + input("Inserisci il congome: ")
    utente_ += " " +  input("Inserisci il Codiec Fiscale: ")
    utente_ += " " +  input("Inserisci la Città: ")

    utenti.append(utente_)
    input("premi un tasto per continuare...")

def visuailzza_utenti():

    print("\nRiga | Nome | Cognome | Codice Fiscale | Città\n")

    for utente in utenti:
        capo = utente.split(" ")
        
        print("Nome: " + capo[0])
        print("Cognome: " + capo[1])
        print("codice fiscale: "+ capo[2])
        print("Città: "+ capo[3])

    input("\npremi un tasto per continuare...")
    


def azione_3():
    input("premi un tasto per continuare...")

    
def esci():
    print("Alla prossima")



gestionale()
