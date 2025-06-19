package raccolta.logica;

import java.util.Scanner;

public class GestoreIO {

	private Scanner s;
	

	public void menu_1()
	{
		System.out.println("\n--- MENU ---");
		System.out.println("1 - Conta 1");
		System.out.println("2 - conta 2");
		System.out.println("3 - conta 3");
		System.out.println("4 - conta 4");
		System.out.println("5 - conta 5");
		System.out.println("6 - Esci\n");
	}
	
	
	public GestoreIO() {
		super();
		s = new Scanner(System.in);
		
	}
	
	public String inputString(String m)
	{	
		System.out.print(m);	
		
		return s.nextLine(); 	
	}
	
	public int inputInt(String m)
	{	
		System.out.print(m);
		
		return Integer.parseInt(s.nextLine()); 
	}
	
	public double inputDouble(String m)
	{	
		System.out.print(m);
		
		return Double.parseDouble(s.nextLine()); 
	}
	
}
