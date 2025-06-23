package test;

public class Persona {

	String nome, congnome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCongnome() {
		return congnome;
	}

	public void setCongnome(String congnome) {
		this.congnome = congnome;
	}

	public Persona(String nome, String congnome) {
		super();
		this.nome = nome;
		this.congnome = congnome;
	}
}
