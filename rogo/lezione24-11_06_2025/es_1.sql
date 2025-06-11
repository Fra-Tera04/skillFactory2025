
# MANCANO ALCUNI INSERT, MENTRE LA CREAZIONE DEL DB E' NEL "FILE DB_ES_UTENTI_RUOLI.SQL"



#ALTER TABLE utenti ADD citta VARCHAR(10) NOT NULL;

# i primi 3 utenti 1.5K, l'altro 2K

#INSERT INTO utenti(nome,cognome,id_ruolo,stipendio,citta) VALUES ('Ocsic','Cisco',2,4000,'Milano'),('Monia','Larro',1,7500,'Napoli');

#UPDATE utenti SET citta='Milano' WHERE id=2;
#UPDATE utenti SET citta='Napoli' WHERE id=2;
#UPDATE utenti SET citta='Roma' WHERE id=2;

#select concat(nome,' ', cognome ,' con stipendio: ',stipendio, ' nella citta di ', citta) risultato FROM utenti;

# SELECT AVG(stipendio) 'stipendio medio' FROM utenti;

# SELECT citta, AVG(stipendio) 'stipendio medio' FROM utenti GROUP BY citta;

# SELECT citta 'dove lo stipendio medio > 2.4K' FROM utenti GROUP BY citta HAVING AVG(stipendio)>2400 ;
