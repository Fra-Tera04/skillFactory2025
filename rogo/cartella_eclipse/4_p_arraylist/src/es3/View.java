package es3;

import java.util.Collection;
import java.util.Scanner;
import java.util.stream.Stream;

import es3.Crud;
import es3.Persona;

public class View {


	private Scanner s = new Scanner(System.in);
	Crud crud = new Crud();
	
	public void menu()
	{
		String mess = """ 
				
				----- MENU -----
				1 - Inserisci una Persona
				2 - Visualizza tutti i Partecipanti
				3 - Visualizza le statistiche 
				4 - 
				
				99 - Exit
				""";
		
		System.out.println(mess);
	}

	public void meuSwitch()
	{
		
		int scelta;
		boolean continuare = true;
	
		do 
		{	
			menu();
			scelta = leggiI("Inserisci la tua scelta -> ");
	
			switch ( scelta ) {
				
//				case 1 -> { 
//					Persona p = formPersona();
//					crud.insert(p);
//				} 
				
				//case 2 -> stampa(crud.readAll());
				
				//case 3 -> statistiche();
				
				//case 4 -> remove();
				
				case 99 -> continuare = false;
				
				default -> {System.out.println("Errore nella scelta, riprova per piacere");} 
			};
			
			leggiS("Premi invio per andare avanti...");
			
		}
		while( continuare );
		

	}
	
	
	

//	public Persona formPersona()
//	{
//		stampa("\nForm Peronsa\n");
//		String n = leggiS("Inserisci nome: ");
//		String cn = leggiS("Inserisci cognome: ");
//		int eta = leggiI("Inserisci eta: ");
//		String cf = leggiS("Inserisci CF: ");
//		String cit = leggiS("Inserisci la tua città: ");
//		
//		return new Persona(n,cn,cit,cf,eta);
//	}
//	
//
//	public void stampa()
//	{
//		crud.readAll().forEach(System.out::println);
//	}
	
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
	
//	public boolean remove()
//	{
//		
//		stampa("Rimuovi una Peronsa:");
//		String cf = leggiS("Inserisci il CF della Persona: ");
//		
//		return crud.remove(cf);
//		
//		
//	}

}
