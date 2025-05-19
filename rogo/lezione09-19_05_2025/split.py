
# SPLIT - 1
'''

prodotto = "EA7;Maglia Napoli;130;Azzurra"

marca = ""
oggetto = ""
prezzo = 0.0
colore = ""


campi_prodotto = prodotto.split(";")

marca = campi_prodotto[0]
oggetto = campi_prodotto[1]
prezzo = float(campi_prodotto[2])
colore = campi_prodotto[3]

print("prezzo: "+ str(prezzo))
print("marca ",marca)
print("oggetto ",oggetto)
print("colore ",colore)

print(campi_prodotto)
'''

# JSON - 2

'''

utente = {
    "nome": "mario",
    "cognome": "bross",
    "cf": "rgofnc00t22f839s",
    "citta": "monaco"
}


print(utente)
print(utente["nome"])
print(utente.get("cognome"))
print(utente.get("cf"))
print(utente.get("citta"))

'''

# JSON DINAMICO - 3

'''
'''
nome = input("Insiersci nome: ")
cognome = input("Insiersci cognome: ")
cf = input("Insiersci cf: ")
citta = input("Insiersci città: ")

utente = dict(nome_ = nome, cognome_ = cognome, cf_ = cf, citta_ = citta)

print("nome: " + utente["nome_"])
print("cognome: " + utente["cognome_"])
print("città: " + utente["citta_"])
print("cf: " + utente["cf_"])
