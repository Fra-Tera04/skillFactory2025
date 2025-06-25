package es2;


public class Avvio {
	
	// crud
	// perosna: id,nome,co,eta,cf,
	// voglio crud con crudServices e visualizzarle con gestoreIO.
	// crud: insert, readAll
	// statistiche: anni media, n. persone inserite, n persone rimosse
	
	public static void main(String[] args) {

		GestoreIO input = new GestoreIO();
		CrudService crud = new CrudService();
		
		int scelta;
		boolean continuare = true;
	
		do 
		{	
			input.menu();
			scelta = input.leggiI("Inserisci la tua scelta -> ");
	
			switch ( scelta ) {
				
				case 1 -> { 
					Persona p = input.formPersona();
					crud.insert(p);
				} 
				
				case 2 -> input.stampa(crud.readAll());
				
				case 3 -> input.statistiche();
				
				case 4 -> input.remove();
				
				case 99 -> continuare = false;
				
				default -> {System.out.println("Errore nella scelta, riprova per piacere");} 
			};
			
			input.leggiS("Premi invio per andare avanti...");
			
		}
		while( continuare );
		
	}
}
