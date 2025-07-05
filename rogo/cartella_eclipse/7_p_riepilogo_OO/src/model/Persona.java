package model;

import java.sql.Date;

public class Persona {

	private String cf;
	private String nome;
	private String cognome;
	private Date dataNascita;
	private String luogoNascita;
	private Sesso genere;
	
	private int id = 0; 
	
	public Persona() {
		super();
		setId(getId() + 1);
	}

	public Persona(String cf, String nome, String cognome, Date dataNascita, String luogoNascita, Sesso genere) {
		super();
		this.cf = cf;
		this.nome = nome;
		this.cognome = cognome;
		this.dataNascita = dataNascita;
		this.luogoNascita = luogoNascita;
		this.genere = genere;
		setId(id + 1);
	}

	@Override
	public String toString() {
		return "Persona [cf=" + cf + ", nome=" + nome + ", cognome=" + cognome + ", dataNascita=" + dataNascita
				+ ", luogoNascita=" + luogoNascita + ", genere=" + genere;
	}
	
	public Date getDataNascita() {
		return dataNascita;
	}
	public void setDataNascita(Date dataNascita) {
		this.dataNascita = dataNascita;
	}
	public String getLuogoNascita() {
		return luogoNascita;
	}
	public void setLuogoNascita(String luogoNascita) {
		this.luogoNascita = luogoNascita;
	}
	public String getGenere() {
		return genere.toString();
	}
	public void setGenere(Sesso genere) {
		this.genere = genere;
	}
	
	public String getCf() {
		return cf;
	}

	public void setCf(String cf) {
		this.cf = cf;
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

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
