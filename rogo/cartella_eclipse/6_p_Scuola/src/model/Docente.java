package model;

import java.time.LocalDate;

public class Docente extends Persona{

	public String scuolaDiRiferimento;
	public Contratto tipoContratto;
	public double stipendio;
	public String materia;
	public String classe;
		
	public Docente() {
		super();
		this.scuolaDiRiferimento = null;
		this.tipoContratto = null;
		this.stipendio = -1;
		this.materia = null;
		this.classe = null;
	}
	
	public Docente(String cf, String nome, String cognome, LocalDate dataDiNascita, String scuolaDiRiferimento,
			Contratto tipoContratto, double stipendio, String materia, String classe) {
		super(cf, nome, cognome, dataDiNascita);
		this.scuolaDiRiferimento = scuolaDiRiferimento;
		this.tipoContratto = tipoContratto;
		this.stipendio = stipendio;
		this.materia = materia;
		this.classe = classe;
	}

	public String notaDisciplinare(String nota) {return nota;}
	public double votoVerifica(Studente s) {return (int)Math.random()*10;}
	
	
	
	
	@Override
	public String toString() {
		return "Docente [scuolaDiRiferimento=" + scuolaDiRiferimento + ", tipoContratto=" + tipoContratto
				+ ", stipendio=" + stipendio + ", cf=" + cf + ", nome=" + nome + ", cognome=" + cognome
				+ ", dataDiNascita=" + dataDiNascita + ", materia=" + materia +"]";
	}

	

	public String getClasse() {
		return classe;
	}
	public void setClasse(String classe) {
		this.classe = classe;
	}
	public String getScuolaDiRiferimento() {
		return scuolaDiRiferimento;
	}
	public void setScuolaDiRiferimento(String scuolaDiRiferimento) {
		this.scuolaDiRiferimento = scuolaDiRiferimento;
	}
	public Contratto getTipoContratto() {
		return tipoContratto;
	}
	public void setTipoContratto(Contratto tipoContratto) {
		this.tipoContratto = tipoContratto;
	}
	public double getStipendio() {
		return stipendio;
	}
	public void setStipendio(double stipendio) {
		this.stipendio = stipendio;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}
	
	
	
}
