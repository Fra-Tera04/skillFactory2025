package test;

public class Barista
{

	public String nome, cognome;
	int anniExp;
	
	public void faiCaffe() 
	{
		System.out.println("Ecco il caffè caro");
	}
	public void spillaBirra() 
	{
		System.out.println("Ti spillo tutta la bvirra caro");
	}
	public Barista(String nome, String cognome, int anniExp) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.anniExp = anniExp;
	}

	
}