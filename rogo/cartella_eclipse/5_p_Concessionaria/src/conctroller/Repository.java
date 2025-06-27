package conctroller;

import java.util.Collection;

import model.Veicolo;

public interface Repository {

	void insert(Veicolo v);

	Veicolo readById(String targa);

	Collection<Veicolo> readAll();

	Veicolo update(Veicolo v);

	Veicolo delete(Veicolo v);

}