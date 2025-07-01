package model;

public class Persona {

	
	private String nome;
	private String cognome;
	private static int id=0; 
	
	public Persona(String nome, String cognome) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		id = getId() + 1;
	}
	
	public Persona() {
		super();
		this.nome = "Formaggino";
		this.cognome = "Formaggino";
		id = getId() + 1;
	}

	@Override
	public String toString() {
		return "Persona [nome=" + nome + ", cognome=" + cognome + "id="+ id + "]";
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public static int getId() {
		return id;
	}
	
}
