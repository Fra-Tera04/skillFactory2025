package conctroller;

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
			scelta = input.leggiInt("Inserisci la tua scelta -> ");

			switch ( scelta ) {

				case 1 -> { 
					Veicolo v = input.formVeicolo();
					crud.insert(v);
				} 
				
				case 2 -> input.schedaVeicoli(crud.readAll());
				
				case 3 -> {
					String targa = input.leggiString("Inserisci la targa del veicolo: ");
					input.schedaVeicolo(targa);
				}
				case 4 -> System.out.println("non implementato ancora");
				
				case 5 -> System.out.println("non implementato ancora");
				
				case 99 -> continuare = false;
				
				default -> {System.out.println("Errore nella scelta, riprova per piacere");} 
			};
			
			input.leggiString("Premi invio per andare avanti...");
			
		}
		while( continuare );
	}
}
