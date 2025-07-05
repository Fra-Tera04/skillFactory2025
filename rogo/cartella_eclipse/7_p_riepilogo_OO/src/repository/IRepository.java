package repository;

import java.util.List;

import model.Persona;

public interface IRepository {

	public boolean insersci(Persona p);
	public Persona leggi(String cf);
	public List<Persona> leggi();
	public boolean modifica(Persona p);
	public boolean delete(String cf);
	
}
