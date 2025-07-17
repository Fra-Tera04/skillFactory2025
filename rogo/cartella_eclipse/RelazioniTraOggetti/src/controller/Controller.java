package controller;

import java.util.ArrayList;

import gestione.classe.anonima.FiguraGeometrica;
import gestione.classe.anonima.IFigura2D;
import relazioni.tra.oggetti.Account;
import relazioni.tra.oggetti.Ruolo;

public class Controller {

	public static void main(String[] args) {
		
		
		figure();
	}

	
	
	private static void figure2()
	{
		IFigura2D quadrato2d = new IFigura2D() {
			
			@Override
			public double calcolaArea() {
				return 14;
			}
		};
		
		IFigura2D quadrato22d = () -> 4*4;
	}
	
	private static void figure()
	{
		FiguraGeometrica quadrato = new FiguraGeometrica(1,2) {
			
			@Override
			public double calcolaPerimetro() {
				return this.getLatoGen()*4;
			}
			@Override
			public double calcolaArea() {
				double a = this.getLatoGen();
				return a*a;
			}
			@Override
			public String toString() {			
				return "Figura numero: " + this.getId()+ " Con lato: " + this.getLatoGen() +" ha harea: " + this.calcolaArea()+ " e llato: " + this.calcolaPerimetro();
			}
		};
		
		System.out.println(quadrato);
	}
	
	private static void ruoli()
	{
		Ruolo r = new Ruolo(1,"Admin", new ArrayList<Account>());

		Account a = new Account(1,"Carcoc", r);
		r.getAccounts().add(a);

		a = new Account(2,"Scorov",r);
		r.getAccounts().add(a);


		for ( Account acc : r.getAccounts()) 
			System.out.println(acc);
	}
}
