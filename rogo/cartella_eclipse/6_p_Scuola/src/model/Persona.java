package model;

import java.time.LocalDate;

public class Persona {
	
	public String cf;
	public String nome;
	public String cognome;
	public LocalDate dataDiNascita;
	
	public Persona() {
		super();
		this.cf = "NaN";
		this.nome = "NaN";
		this.cognome = "NaN";
		this.dataDiNascita = null;
	}
	
	public Persona(String cf, String nome, String cognome, LocalDate dataDiNascita) {
		super();
		this.cf = cf;
		this.nome = nome;
		this.cognome = cognome;
		this.dataDiNascita = dataDiNascita;
	}
	
	@Override
	public String toString() {
		return "Persona [CF=" + cf + ", nome=" + nome + ", cognome=" + cognome + ", dataDiNascita=" + dataDiNascita + "]";
	}
	public void setCF(String cf) {
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
	public LocalDate getDataDiNascita() {
		return dataDiNascita;
	}
	public void setDataDiNascita(LocalDate dataDiNascita) {
		this.dataDiNascita = dataDiNascita;
	}
	
}
