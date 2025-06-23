import raccolta.logica.*;

public class Main {

	public static void main(String[] args) {
		
		GestoreIO g = new GestoreIO();
		Logica l = new Logica();

		int scelta;
		
		do {
			
			g.menu_1();
			
			
			scelta = g.inputInt("Scegli un'opzione: ");
			
			switch (scelta) {
	
				case 1 -> {System.out.println("Contare da 1 a 10 ma stampando i valori tra 3 e 7 (escluso)\n"); 
							l.conta_1();
							}
				case 2 -> { System.out.println("Contare da 12 a 24 mostrando in output i valori minore di 17 e maggiorni di 22 (17 e 22 compresi)\n"); 
							l.conta_2();
							}
				case 3 -> { System.out.println("Contare da 10 a 1 stampando solo i numeri pari;\n"); l.conta_3();}
				case 4 -> { System.out.println("Contare da 20 a 40 stampando solo i numeri dispari;"); l.conta_4();}
				case 5 -> { System.out.println("Contare da 27 a 55 ma stampare quanti numeri parsi sono stati trovati;"); l.conta_5();}
				case 6 -> scelta = -1;
				
				default -> System.out.println("Errore nella scelta, riprova per piacere"); 
			}
			
			if( scelta == -1 )
				break;
			
			g.inputString("Premi invio per andare avanti...");
			
		}while(scelta != -1);
		
	}
}

