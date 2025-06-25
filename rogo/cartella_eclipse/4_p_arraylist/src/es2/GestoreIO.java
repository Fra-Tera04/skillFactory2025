package es2;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Stream;

public class GestoreIO {
	
	Scanner s;
	CrudService crud;
	
	public GestoreIO()
	{
		super();
		s = new Scanner(System.in);
		crud = new CrudService();
	}

	public void menu()
	{
		String mess = """ 
				
				----- MENU -----
				1 - Inserisci una Perona
				2 - Visualizza tutti i Partecipanti
				3 - Visualizza le statistiche 
				4 - 
				
				99 - Exit
				""";
		
		System.out.println(mess);
	}
	
	public Persona formPersona()
	{
		stampa("\nForm Peronsa\n");
		String n = leggiS("Inserisci nome: ");
		String cn = leggiS("Inserisci cognome: ");
		int eta = leggiI("Inserisci eta: ");
		String cf = leggiS("Inserisci CF: ");
		String cit = leggiS("Inserisci la tua città: ");
		
		return new Persona(n,cn,cit,cf,eta);
	}
	

	public void stampa()
	{
		crud.readAll().forEach(System.out::println);
	}
	
	public void stampa(Collection<Persona> list)
	{
		list.forEach(System.out::println);
	}
	
	public void stampa(String massage)
	{
		System.out.println(massage);
	}
	
	public String leggiS(String massage)
	{
		String ret = null;

		try
		{
			System.out.println(massage);
			ret = s.nextLine();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return ret;
	}

	public int leggiI(String massage)
	{
		int ret = 0;

		try
		{
			System.out.println(massage);
			ret = Integer.parseInt(s.nextLine());
		}
		catch (Exception e) {
			e.printStackTrace();
		}

		return ret;
	}

	public double leggiD(String massage)
	{
		double ret = 0;

		try
		{
			System.out.println(massage);
			ret = Double.parseDouble(s.nextLine());

		}
		catch (Exception e) {
			e.printStackTrace();
		}

		return ret;
	}
	
	public void statistiche()
	{
		// statistiche: anni media, n. persone inserite, n persone rimosse
		
		Stream<Persona> s = crud.readAll().stream();
		
		double mediaAnni =  s.mapToInt(Persona::getEta)
							.average()
							.orElse(0.0);
		
		int nPersoneInserite = CrudService.getId();
		
		long nPersoneRimosse = nPersoneInserite - s.count();  
		
		
		System.out.println("Le statistiche delle Persone in:");
		System.out.println("Media degli anni\tNumero Persone Inserite\tNumero Persone Rimosse");
		System.out.println("%.2f \t\t%d \t\t%d".formatted(mediaAnni,nPersoneInserite,nPersoneRimosse));
		
		
		
		
	}
	
	public boolean remove()
	{
		
		stampa("Rimuovi una Peronsa:");
		String cf = leggiS("Inserisci il CF della Persona: ");
		
		return crud.remove(cf);
		
		
	}
}
