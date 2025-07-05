package view;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

import model.Dipendente;
import model.Persona;
import model.Sesso;
import repository.RepositoryMySql;

public class GestoreIO {

	

	RepositoryMySql repo;
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


	public GestoreIO() {
		repo = new RepositoryMySql();
		s = new Scanner(System.in);
	}
	
	
	public Date leggiData(String messaggio) {
		
		LocalDate data = null;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(messaggio);
		
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
		
		return Date.valueOf(data);
	}

	
	public String leggiStringa(String m) {
		System.out.print(m + CYAN + " -> " + RESET);
		return s.nextLine();
	}

	
	public int leggiIntero(String m) {
		System.out.print(m + CYAN + " -> " + RESET);
		return Integer.parseInt(s.nextLine());
	}

	
	public double leggiDecimale(String m) {
		System.out.print(m + CYAN + " -> " + RESET);
		return Double.parseDouble(s.nextLine());
	}

	public void stampa(String m) {
		System.out.println(m);
	}

	
	public Persona formDipendente() {
		
		System.out.println(GREEN + BOLD + "-------------" + RESET);
		System.out.println(GREEN + BOLD + "| " + UNDERLINE + "Form Persona" + RESET + GREEN + BOLD + " |" + RESET);
		System.out.println(GREEN + BOLD + "-------------" + RESET);

		String cf = leggiStringa("Inserisci il CF");
		String nome = leggiStringa("Inserisci il Nome");
		String cognome = leggiStringa("Inserisci il Cognome");
		Date dataDiNascita = leggiData("Inserisci la tua Data di Nascita (dd/MM/yyyy)");
		Sesso secs = Sesso.valueOf(leggiStringa("Inserisci il tuo sesso (maschio/femmina/altro)").toUpperCase());
		String luogoDiNascita = leggiStringa("Inserisci il tuo Luogo di Nascita");
		int stip = leggiIntero("Inserisci lo Stipendio");
		
		System.out.println(GREEN + BOLD + "--------------------------------------" + RESET);
		return new Dipendente(cf, nome, cognome, dataDiNascita, luogoDiNascita, secs, stip); 	
	}
	
	public void schedaPersona(Persona p) {
		
		// da sovrascrivere
		p.toString();
		
	}

	
	public void visualizzaPersone(List<Persona> persone) {
		persone.forEach( p -> schedaPersona(p));
	}

	public void menu() {

		System.out.println(GREEN + BOLD + "-------------------------------------------------" + RESET);
		System.out.println(GREEN + BOLD + "| " + UNDERLINE + "Gestione Qualcosa Qualocsa - Menu Principale" + RESET + GREEN + BOLD + " |" + RESET);
		System.out.println(GREEN + BOLD + "-------------------------------------------------" + RESET);

		System.out.println(YELLOW + "1. " + RESET + "Inserisci un nuovo Dipendente");
		System.out.println(YELLOW + "2. " + RESET + "Visualizza tutti");
		System.out.println(YELLOW + "5. " + RESET + "Elimina");
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
				repo.delete(cf);
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


}
