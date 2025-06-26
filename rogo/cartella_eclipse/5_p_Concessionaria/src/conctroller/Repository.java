package conctroller;

import java.util.Collection;
import java.util.Map;

import model.Veicolo;

public interface Repository {

	void insert(Veicolo v);

	Veicolo readById(String targa);

	Collection<Veicolo> readAll();

	void update();

	void delete(Veicolo v);

}