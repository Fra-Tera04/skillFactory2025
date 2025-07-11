package conctroller;

import java.util.ArrayList;
import java.util.List;

import model.Veicolo;
import view.GestioneIO;
import view.IGestioneIO;

public class Controller {

	
	public void sos()
	{
		IGestioneIO input = new GestioneIO();
		Repository crud = new RepositoryForMap();
		
		int scelta;
		boolean continuare = true;

		do 
		{	
			input.menu();
			scelta = input.leggiInt("Inserisci la tua scelta");

			switch ( scelta ) {

				case 1 -> { 
					Veicolo v = input.formVeicolo();
					crud.insert(v);
				} 
				
				case 2 -> input.schedaVeicoli(crud.readAll());
				
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
