package view;

import java.util.Collection;
import java.util.Map;
import java.util.Scanner;

import conctroller.Repository;
import conctroller.RepositoryForMap;
import model.Auto;
import model.Moto;
import model.Veicolo;

public class GestioneIO implements IGestioneIO{

	Repository repo;
	Scanner s;

	public GestioneIO() {
		repo = new RepositoryForMap();
		s = new Scanner(System.in);
	}

	@Override
	public String leggiString(String m) {
		System.out.println(m);
		return s.nextLine();
	}

	@Override
	public int leggiInt(String m) {
		System.out.println(m);
		return Integer.parseInt(s.nextLine());
	}

	@Override
	public double leggiDouble(String m) {
		System.out.println(m);
		return Double.parseDouble(s.nextLine());
	}

	@Override
	public void stampa(String m) {
		System.out.println(m);
	}

	@Override
	public Veicolo formVeicolo() {

		Veicolo v = null;

		String targa = leggiString("Inserisci la Targa del Veicolo: ");
		String modello = leggiString("Inserisci il Modello del Veicolo: ");
		String marca = leggiString("Inserisci la marca del Veicolo: ");
		String colore = leggiString("Inserisci il colore del Veicolo: ");
		int nPorte;
		String stileManubrio;

		int aaa = leggiInt("Il tuo veicolo sa'à una Auto(1) o una Moto(2)? ");

		if( aaa == 1 )
		{
			nPorte = leggiInt("Inserisci il Numero di Porte della tua Auto: ");
			v = new Auto(targa,modello,marca,colore,nPorte);
		}
		else if( aaa == 2 )
		{
			stileManubrio = leggiString("Inserisci il Numero di Porte della tua Auto: ");
			v = new Moto(targa,modello,marca,colore,stileManubrio);
		}

		return v;
	}

	public void schedaVeicolo(Veicolo v) {
		System.out.println("\n-----------------------");
		System.out.println("Targa Veicolo: "+v.getTarga());
		System.out.println("Marca: "+v.getMarca());
		System.out.println("Modello: "+v.getModello());
		System.out.println("Colore: "+v.getColore());

		if( v instanceof Auto)			
			System.out.println("Numero Porte: "+ ((Auto)v).getNumeroPorte() );
		if( v instanceof Moto)			
			System.out.println("Stile Manubrio: "+ ((Moto)v).getStileManubrio() );

		System.out.println("-----------------------\n");

	}

	@Override
	public void schedaVeicolo(String targa) {
		schedaVeicolo(repo.readById(targa));
	}

	@Override
	public void schedaVeicoli(Collection<Veicolo> list) {

		for (Veicolo v : list) {
			schedaVeicolo(v);
		}
	}

	@Override
	public void menu()
	{
		String mess = """ 

				----- MENU -----
				1 - Inserisci un Veicolo
				2 - Visualizza tutti i Veicoli
				3 - Visualizza un Veicolo
				_4 - Visualizza tutte le Auto
				_5 - Visualizza tutte le moto 

				99 - Exit
				""";

		System.out.println(mess);
	}

}
