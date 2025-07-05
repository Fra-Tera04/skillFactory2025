package controller;

import java.sql.Date;

import model.Dipendente;
import model.Persona;
import model.Sesso;
import repository.RepositoryMySql;
import view.GestoreIO;

public class Controller {

	public static void main(String[] args) {

		GestoreIO input = new GestoreIO();
		RepositoryMySql repo = new RepositoryMySql();

		int scelta;
		boolean continuare = true;

		do 
		{	
			input.menu();
			scelta = input.leggiIntero("Inserisci la tua scelta");

			switch ( scelta ) {

			case 1 -> { 
				Persona p = input.formDipendente();
				repo.insersci(p);
			}

			case 2 -> input.schedaPersona(null);

			case 3 -> {
				String cf = input.leggiStringa("Inserisci il cf della persona");

				input.schedaPersona(repo.leggi(cf));
			}
			
			case 99 -> continuare = false;

			default -> System.out.println("Errore nella scelta, riprova per piacere");
			
			}

			input.leggiStringa("Premi invio per andare avanti");

		}
		while( continuare );

		input.addio();
	}

}
