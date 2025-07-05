package model;

import java.sql.Date;

public class Dipendente extends Persona
{
	private double stipendio;

	
	public Dipendente() {
		super();
	}
	
	public Dipendente(String cf, String nome, String cognome, Date dataNascita, String luogoNascita, Sesso genere,
			double stipendio) {
		super(cf, nome, cognome, dataNascita, luogoNascita, genere);
		this.stipendio = stipendio;
	}

	@Override
	public String toString() {
		return super.toString()+" stipendio=" + stipendio + "]";
	}

	public double getStipendio() {
		return stipendio;
	}

	public void setStipendio(double stipendio) {
		this.stipendio = stipendio;
	}
	
}
