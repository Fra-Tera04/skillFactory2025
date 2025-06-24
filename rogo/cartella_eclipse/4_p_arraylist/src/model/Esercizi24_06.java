package model;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Esercizi24_06 {


	public String es1(List<Integer> list)
	{
		String ret = "";

		list.add(5);
		list.add(18);
		list.add(24);

		int somma = list.stream().
				mapToInt(Integer::intValue)
				.sum();

		double media = list.stream().
				mapToInt(Integer::intValue)
				.average()
				.getAsDouble();

		int sommaPari = list.stream()
				.mapToInt(Integer::intValue)
				.filter( n -> n%2 == 0)
				.sum();

		long nDispari = list.stream().
				mapToInt(Integer::intValue)
				.filter( n -> n%2 == 1)
				.count();


		ret = """
				La Somma è uguale a: %d
				La Mediaa è uguale a: %.3f
				La Somma dei Pari è uguale a: %d
				La Conta dei Dispari è uguale a: %d

				""".formatted(somma, media, sommaPari, nDispari);

		return ret;
	}

	public void es2(Map<String,String> map)
	{

		String marca = "", modello = "", targa = "";

		try(Scanner s = new Scanner(System.in)) 
		{
			System.out.println("Inserisci la Marca: ");
			marca = s.nextLine();

			System.out.println("Inserisci il Modello: ");
			modello = s.nextLine();

			System.out.println("Inserisci la Targa: ");
			targa = s.nextLine();

		} catch (Exception e) {
			e.printStackTrace();
		}

		String val = targa+"_"+marca+"_"+modello;
		map.put(targa, val);

	}

	public void es13(List<String> list)
	{
		// 13)Data una lista di nomi, inserire 5 nomi a vostra scelta. 
		// 		 Cercare con un input dinamico un nome della lista. 
		//		 Stampare il nome se viene trovato, 
		// 		 altrimenti mandare in output il messaggio: "Nome non trovato".

		list.add("Scorcio");
		list.add("Moddica");
		list.add("Massimo");
		list.add("Lercioc");
		list.add("Socrateco");
		String nome = "";

		try(Scanner s = new Scanner(System.in))
		{
			System.out.println("Inserisi il nome da ercare nella lista: ");
			nome = s.nextLine();
		}
		catch (Exception e) {
			e.printStackTrace();
		}

		boolean opzione = list.contains("Scorcio");

		if( opzione )
			System.out.println("Nome ("+nome+") Trovato!");
		else
			System.out.println("Nome non Trovato!");
	}

	public void es14(List<String> list) {
		/*
		 * 14)Data una lista di nomi, inserire 5 nomi a vostra scelta.
		 *  Cercare con un input dinamico un nome della lista.
		 *  Eliminare il nome se viene trovato, 
		 *  altrimenti mandare in output il messaggio: "Nome non trovato". 
		 *  Infine visualizzare tutti i valori per verificare se la rimozione e' andata a buon fine.
		 */

		list.add("Scorcio");
		list.add("Moddica");
		list.add("Massimo");
		list.add("Lercioc");
		list.add("Socrateco");

		list.forEach(System.out::println);

		String nome = "";

		try(Scanner s = new Scanner(System.in))
		{
			System.out.println("Inserisi il nome da ercare nella lista: ");
			nome = s.nextLine();

			if( list.contains(nome) )
				list.remove(nome);
			else
				System.out.println("Nome ("+nome+") non trovato");
		}
		catch (Exception e) {
			e.printStackTrace();
		}

		list.forEach(System.out::println);
	}



	public void es15(List<String> list) {
		/*
		 * 15)Modificare il nome se viene trovato, 
		 * altrimenti mandare in output il messaggio: "Nome non trovato". 
		 * Infine visualizzare tutti i valori per verificare se la modifica e' andata a buon fine.
		 */

		list.add("Scorcio");
		list.add("Moddica");
		list.add("Massimo");
		list.add("Lercioc");
		list.add("Socrateco");

		list.forEach(System.out::println);

		String nome = "";

		try(Scanner s = new Scanner(System.in))
		{
			System.out.println("Inserisi il nome da ercare nella lista: ");
			nome = s.nextLine();

			int index = -1;

			if( (index = list.indexOf(nome)) != -1 )
			{
				System.out.println("Inserisi il nuovo nome: ");
				nome = s.nextLine();

				list.set(index,nome);
			}
			else
				System.out.println("Nome ("+nome+") non trovato");

		}
		catch (Exception e) {
			e.printStackTrace();
		}

		list.forEach(System.out::println);
	}

}






