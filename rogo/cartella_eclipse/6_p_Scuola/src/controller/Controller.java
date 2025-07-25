package controller;

import java.util.List;

import model.Persona;
import view.GestioneIO;
import view.IGestioneIO;

public class Controller {

	public static void main(String[] args) {

		IGestioneIO input = new GestioneIO();
		ICrud crud = new Crud();

		int scelta;
		boolean continuare = true;

		do 
		{	
			input.menu();
			scelta = input.leggiIntero("Inserisci la tua scelta");

			switch ( scelta ) {

			case 1 -> { 
				Persona p = new Persona();
				input.formPersona(p);
				crud.inserisci(p);

			} 

			case 2 -> input.schedaPersona(null);

			case 3 -> {
				String cf = input.leggiStringa("Inserisci il cf della persona");

				input.schedaPersona( crud.leggi(cf));
				//input.schedaVeicolo(targa);
			}
			case 4 -> input.formPersona(null);

			case 99 -> continuare = false;

			default -> {System.out.println("Errore nella scelta, riprova per piacere");} 
			};

			input.leggiStringa("Premi invio per andare avanti");

		}
		while( continuare );

		input.addio();
	}

}


