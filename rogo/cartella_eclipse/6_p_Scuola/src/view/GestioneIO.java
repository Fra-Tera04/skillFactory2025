package view;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

import controller.Crud;
import model.Contratto;
import model.Docente;
import model.Persona;
import model.Studente;

public class GestioneIO implements IGestioneIO {

	Crud repo;
	Scanner s;


	
	// Colori dello sfondo
	private static final String BG_BLACK = "\u001b[40m";
	private static final String BG_WHITE = "\u001b[107m";
	
	// Colori del testo
	private static final String BLACK = "\u001b[30m";
	private static final String RED = "\u001b[31m";
	private static final String GREEN = "\u001b[32m";
	private static final String YELLOW = "\u001b[33m";
	private static final String BLUE = "\u001b[34m";
	private static final String MAGENTA = "\u001b[35m";
	private static final String CYAN = "\u001b[36m";
	private static final String WHITE = "\u001b[37m";

	// Stili
	private static final String BOLD = "\u001b[1m";
	private static final String UNDERLINE = "\u001b[4m";

	// Colori di sfondo
	private static final String BG_RED = "\u001b[41m";
	private static final String BG_GREEN = "\u001b[42m";
	private static final String BG_BLUE = "\u001b[44m";

	// Costanti per i codici ANSI
	private static final String RESET = "\u001b[0m";


	public GestioneIO() {
		repo = new Crud();
		s = new Scanner(System.in);
	}
	
	@Override
	public LocalDate leggiData(String messaggio) {
		
		
		
		LocalDate data = null;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
        try {
    
        	String inputUtente = s.nextLine(); // Legge l'intera riga di input	
        	data = LocalDate.parse(inputUtente, formatter);
        	
            
        } catch (DateTimeParseException e) {
        	
            // Se c'è un errore di formato o la data non è valida (es. 30/02/2023)
            stampa(RED + "Errore: Formato data non valido o data inesistente. Riprova. " +
                   "Assicurati di usare il formato GG/MM/AAAA (es. 31/12/1990)." + RESET);
        }
        catch( Exception e)
        {
        	e.printStackTrace();
        }
		
		return data;
	}

	@Override
	public String leggiStringa(String m) {
		System.out.print(m + CYAN + " -> " + RESET);
		return s.nextLine();
	}

	@Override
	public int leggiIntero(String m) {
		System.out.print(m + CYAN + " -> " + RESET);
		return Integer.parseInt(s.nextLine());
	}

	@Override
	public double leggiDecimale(String m) {
		System.out.print(m + CYAN + " -> " + RESET);
		return Double.parseDouble(s.nextLine());
	}

	public void stampa(String m) {
		System.out.println(m);
	}

	@Override
	public void formPersona(Persona p) {
		
		System.out.println(GREEN + BOLD + "-------------" + RESET);
		System.out.println(GREEN + BOLD + "| " + UNDERLINE + "Form Persona" + RESET + GREEN + BOLD + " |" + RESET);
		System.out.println(GREEN + BOLD + "-------------" + RESET);

		String cf = leggiStringa("Inserisci il CF");
		String nome = leggiStringa("Inserisci il Nome");
		String cognome = leggiStringa("Inserisci il Cognome");
		LocalDate dataDiNascita = leggiData("Inserisci la tua Data di Nascita (dd/MM/yyyy)");
		
		p.setCF(cf);
		p.setNome(nome);
		p.setCognome(cognome);
		p.setDataDiNascita(dataDiNascita);
		
		boolean continuare = true;	
		
		try {
			
			do {
				
				int aaa = leggiIntero("Sei uno Studente(1) o un Docente(2)");
		
				if( aaa == 1 )	
				{
					p = formStudente(p);
					continuare = false;
				}
				else if( aaa == 2 )
				{
					p = formDocente(p);
					continuare = false;
				}
				else
					stampa(RED + "Errore, Clicca invio per Ripetere il Form..." + RESET);
					
				leggiStringa("");
			}while( continuare );
			
		}
		catch (Exception e) {
			e.printStackTrace();
			
		}
		System.out.println(GREEN + BOLD + "--------------------------------------" + RESET);
		
	}
	
	private Docente formDocente(Persona p) {
		
		stampa(GREEN + "\t----------------------------" + RESET);
		stampa(GREEN + "\tForm Docente " + RESET);
		stampa(GREEN + "\t----------------------------" + RESET);
		
		String sdr = leggiStringa("\tInserisci la Tua Scuola di Riferimento");
		Contratto c = leggiContratto();

		double stipendio = leggiIntero("\tInserisci il tuo Stipendio");
		
		String materia = leggiStringa("\tInserisci la Tua Materia");
		
		String classe = leggiStringa("\tInserisci la Classe che controlli");
		
		Docente d = new Docente(p.cf, p.nome, p.cognome, p.dataDiNascita, sdr,
				c, stipendio, materia, classe);
		
		return d;
	}

	public Contratto leggiContratto()
	{
		stampa(GREEN + "\t\t----------------------------" + RESET);
		stampa(GREEN + "\t\tLista di Contratti possibili"+ RESET);
		stampa(GREEN + "\t\t----------------------------" + RESET);
		stampa("\t\t"+ Contratto.values().toString());
			
		return Contratto.valueOf(s.nextLine());
	}

	private Studente formStudente(Persona p) {
		
		return new Studente(p.cf, p.nome, p.cognome, p.dataDiNascita, new LinkedHashMap<String, List<Double>>());
	}

	@Override
	public void schedaPersona(Persona p) {
		
		// da sovrascrivere
		p.toString();
		
	}

	@Override
	public void visualizzaPersone(List<Persona> persone) {
		persone.forEach( p -> schedaPersona(p));
	}

	@Override
	public void menu() {

		System.out.println(GREEN + BOLD + "-------------------------------------------------" + RESET);
		System.out.println(GREEN + BOLD + "| " + UNDERLINE + "Gestione Qualcosa Qualocsa - Menu Principale" + RESET + GREEN + BOLD + " |" + RESET);
		System.out.println(GREEN + BOLD + "-------------------------------------------------" + RESET);

		System.out.println(YELLOW + "1. " + RESET + "Inserisci un nuova Persona");
		System.out.println(YELLOW + "2. " + RESET + "Visualizza tutti i veicoli");
		System.out.println(YELLOW + "3. " + RESET + "Cerca veicolo per targa");
		System.out.println(YELLOW + "4. " + RESET + "Aggiorna dati veicolo");
		System.out.println(YELLOW + "5. " + RESET + "Elimina veicolo");
		// System.out.println(BLUE + "6. " + RESET + "Mostra statistiche"); // Opzione speciale
		System.out.println(YELLOW + "99. " + RESET + "Esci dall'applicazione");

		System.out.println(GREEN + BOLD + "--------------------------------------------" + RESET);
		
	}

	public Persona formDeleteVeicolo() {

		System.out.println(GREEN + BOLD + "-------------" + RESET);
		System.out.println(GREEN + BOLD + "| " + UNDERLINE + "Form Elimina" + RESET + GREEN + BOLD + " |" + RESET);
		System.out.println(GREEN + BOLD + "-------------" + RESET);

		String cf = leggiStringa("Inserisci il Codice Fiscale della Persona che vuoi Eliminare dal Sistema");
		
		if( repo.leggi(cf) != null)
		{
			String risposta = leggiStringa(BG_WHITE + BOLD + BLACK + "Sei sicuro di voler cancellare questa Persona?" + RESET);
		
			if( risposta.toLowerCase().equals("si"))
				repo.elimina(cf);
		}
		else
			stampa("La Persona (" + cf + ") non è stata trovata");
		
		System.out.println(GREEN + BOLD + "--------------------------------------" + RESET);
		
		return null;
	}

	
	public void addio()
	{
		System.out.println(GREEN + BOLD + "--------------------------------------" + RESET);
		System.out.println(YELLOW + BOLD + "| " + "Ti ringraziamo per aver usato Il Nostro Servizio" + RESET + GREEN + BOLD + " |" + RESET);
		System.out.println(GREEN + BOLD + "--------------------------------------" + RESET);

	}
/*

	@Override

	
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


 */

}
