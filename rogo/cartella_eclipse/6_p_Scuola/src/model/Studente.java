package model;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class Studente extends Persona {

	private Map<String, List<Double>> votiXMateria;
	
	
	public Studente()
	{
		super(null, null, null, null);
		this.votiXMateria = null;
	}
	
	public Studente(String cf, String nome, String cognome, LocalDate dataDiNascita,
			Map<String, List<Double>> votiXMateria) {
		super(cf, nome, cognome, dataDiNascita);
		this.votiXMateria = votiXMateria;
	}
	
	public double media(String materia) {return 0.0;}
	public double maxVoto(String materia) {return 0.0;}
	public double minVoto(String materia) {return 0.0;}

	@Override
	public String toString() {
		return "Studente [votiXMateria=" + votiXMateria + ", cf=" + cf + ", nome=" + nome + ", cognome=" + cognome
				+ ", dataDiNascita=" + dataDiNascita + "]";
	}
	
}
