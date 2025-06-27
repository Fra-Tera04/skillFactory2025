package controller;

import java.util.List;

import conctroller.Repository;
import conctroller.RepositoryForMap;
import model.Persona;
import model.Veicolo;
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
					String targa = input.leggiString("Inserisci la targa del veicolo");
					
					input.schedaVeicoli( List.of(crud.readById(targa)) );
					//input.schedaVeicolo(targa);
				}
				case 4 -> input.formModificaVeicolo();
				
				case 5 -> input.formDeleteVeicolo();
				
				case 99 -> continuare = false;
				
				default -> {System.out.println("Errore nella scelta, riprova per piacere");} 
			};
			
			input.leggiString("Premi invio per andare avanti");
			
		}
		while( continuare );
		
		input.addio();
	}

	}

}
