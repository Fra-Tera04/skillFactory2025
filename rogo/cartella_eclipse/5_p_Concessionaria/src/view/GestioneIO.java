package view;

import java.util.Collection;
import java.util.Scanner;

import conctroller.Repository;
import conctroller.RepositoryForMap;
import model.Auto;
import model.Moto;
import model.Veicolo;

public class GestioneIO implements IGestioneIO{

	Repository repo;
	Scanner s;


	
	// Colori dello sfondo
	public static final String BG_BLACK = "\u001b[40m";
	public static final String BG_WHITE = "\u001b[107m";
	
	// Colori del testo
	public static final String BLACK = "\u001b[30m";
	public static final String RED = "\u001b[31m";
	public static final String GREEN = "\u001b[32m";
	public static final String YELLOW = "\u001b[33m";
	public static final String BLUE = "\u001b[34m";
	public static final String MAGENTA = "\u001b[35m";
	public static final String CYAN = "\u001b[36m";
	public static final String WHITE = "\u001b[37m";

	// Stili
	public static final String BOLD = "\u001b[1m";
	public static final String UNDERLINE = "\u001b[4m";

	// Colori di sfondo
	public static final String BG_RED = "\u001b[41m";
	public static final String BG_GREEN = "\u001b[42m";
	public static final String BG_BLUE = "\u001b[44m";

	// Costanti per i codici ANSI
	public static final String RESET = "\u001b[0m";



	public GestioneIO() {
		repo = new RepositoryForMap();
		s = new Scanner(System.in);
	}

	@Override
	public String leggiString(String m) {
		System.out.print(m + CYAN + "->" + RESET);
		return s.nextLine();
	}

	@Override
	public int leggiInt(String m) {
		System.out.print(m + CYAN + " -> " + RESET);
		return Integer.parseInt(s.nextLine());
	}

	@Override
	public double leggiDouble(String m) {
		System.out.print(m + CYAN + " -> " + RESET);
		return Double.parseDouble(s.nextLine());
	}

	@Override
	public void stampa(String m) {
		System.out.println(m);
	}

	@Override
	public Veicolo formVeicolo() {

		Veicolo v = null;

		System.out.println(GREEN + BOLD + "-------------" + RESET);
		System.out.println(GREEN + BOLD + "| " + UNDERLINE + "Form Veicolo" + RESET + GREEN + BOLD + " |" + RESET);
		System.out.println(GREEN + BOLD + "-------------" + RESET);

		String targa = leggiString("Inserisci la Targa del Veicolo");
		String modello = leggiString("Inserisci il Modello del Veicolo");
		String marca = leggiString("Inserisci la marca del Veicolo");
		String colore = leggiString("Inserisci il colore del Veicolo");
		
		int nPorte;
		String stileManubrio;

		int aaa = leggiInt("Il tuo veicolo è una Auto(1) o una Moto(2)?");

		if( aaa == 1 )
		{
			nPorte = leggiInt("Inserisci il Numero di Porte della tua Auto");
			v = new Auto(targa,modello,marca,colore,nPorte);
		}
		else if( aaa == 2 )
		{
			stileManubrio = leggiString("Inserisci lo Stile del Manubrio della tua Moto");
			v = new Moto(targa,modello,marca,colore,stileManubrio);
		}
		
		System.out.println(GREEN + BOLD + "--------------------------------------" + RESET);
		
		return v;
	}

	
	@Override
	public Veicolo formModificaVeicolo() {


		System.out.println(GREEN + BOLD + "-------------" + RESET);
		System.out.println(GREEN + BOLD + "| " + UNDERLINE + "Form Modifica Veicolo" + RESET + GREEN + BOLD + " |" + RESET);
		System.out.println(GREEN + BOLD + "-------------" + RESET);

		Veicolo v = formVeicolo();
		
		repo.update(v);
		
		System.out.println(GREEN + BOLD + "--------------------------------------" + RESET);
		return null;
	}

	@Override
	public Veicolo formDeleteVeicolo() {

		System.out.println(GREEN + BOLD + "-------------" + RESET);
		System.out.println(GREEN + BOLD + "| " + UNDERLINE + "Form Elimina Veicolo" + RESET + GREEN + BOLD + " |" + RESET);
		System.out.println(GREEN + BOLD + "-------------" + RESET);

		String targa = leggiString("Inserisci la Targa del Veicolo che vuoi Eliminare");
		
		Veicolo v = repo.readById(targa);
		
		if( v != null)
		{
			String risposta = leggiString(BG_WHITE + BOLD + BLACK + "Sei sicuro di voler cancellare quest Veicolo?" + RESET);
		
			if( risposta.toLowerCase().equals("si"))
				repo.delete(v);
		}
		else
			stampa("La targa " + targa + " non è stata trovata");
		
		System.out.println(GREEN + BOLD + "--------------------------------------" + RESET);
		
		return null;
	}

	
	public void schedaVeicolo(Veicolo v, int n) {

		System.out.println(GREEN + BOLD + "---------------" + RESET);
		System.out.println(GREEN + BOLD + "| " + UNDERLINE + "Scheda Veicolo - " + n + RESET + GREEN + BOLD + " |" + RESET);
		System.out.println(GREEN + BOLD + "---------------" + RESET);

		System.out.println(BOLD + "Targa Veicolo" + RESET + " -> " + v.getTarga());
		System.out.println(BOLD + "Marca"         + RESET + " -> " + v.getMarca());
		System.out.println(BOLD + "Modello"       + RESET + " -> "  + v.getModello());
		System.out.println(BOLD + "Colore"        + RESET + " -> "  + v.getColore());

		if( v instanceof Auto)			
			System.out.println(BOLD + "Numero Porte"   + RESET + " -> "  + ((Auto)v).getNumeroPorte() );
		if( v instanceof Moto)			
			System.out.println(BOLD + "Stile Manubrio" + RESET + " -> "  + ((Moto)v).getStileManubrio() );

		System.out.println( GREEN + BOLD +"-----------------------\n" + RESET);
	}

	@Override
	public void schedaVeicolo(String targa) {
		Veicolo v = repo.readById(targa);
		if( v == null ) {
			System.err.println("Veicolo non trovato");
			v = new Auto(null,null,null,null,-1);
		}
		schedaVeicolo(v,1);
	}

	@Override
	public void schedaVeicoli(Collection<Veicolo> list) {

		System.out.println(GREEN + BOLD + "----------------------" + RESET);
		System.out.println(GREEN + BOLD + "| " + UNDERLINE + "Sezione Schede Veicoli" + RESET + GREEN + BOLD + " |" + RESET);
		System.out.println(GREEN + BOLD + "----------------------" + RESET);

		
		for (Veicolo v : list) {
			int count = 1;
			schedaVeicolo(v, count++);
		}
	}

	@Override
	public void menu()
	{

		System.out.println(GREEN + BOLD + "--------------------------------------" + RESET);
		System.out.println(GREEN + BOLD + "| " + UNDERLINE + "Gestione Veicoli - Menu Principale" + RESET + GREEN + BOLD + " |" + RESET);
		System.out.println(GREEN + BOLD + "--------------------------------------" + RESET);

		System.out.println(YELLOW + "1. " + RESET + "Inserisci un nuovo veicolo");
		System.out.println(YELLOW + "2. " + RESET + "Visualizza tutti i veicoli");
		System.out.println(YELLOW + "3. " + RESET + "Cerca veicolo per targa");
		System.out.println(YELLOW + "4. " + RESET + "Aggiorna dati veicolo");
		System.out.println(YELLOW + "5. " + RESET + "Elimina veicolo");
		// System.out.println(BLUE + "6. " + RESET + "Mostra statistiche"); // Opzione speciale
		System.out.println(YELLOW + "99. " + RESET + "Esci dall'applicazione");

		System.out.println(GREEN + BOLD + "--------------------------------------" + RESET);

	}

	@Override
	public void addio() {
		System.out.println(GREEN + BOLD + "--------------------------------------" + RESET);
		System.out.println(YELLOW + BOLD + "| " + "Ti ringraziamo per aver usato Il Nostro Servizio" + RESET + GREEN + BOLD + " |" + RESET);
		System.out.println(GREEN + BOLD + "--------------------------------------" + RESET);
	}


}
