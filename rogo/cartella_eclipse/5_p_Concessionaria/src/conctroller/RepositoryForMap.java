package conctroller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import model.Veicolo;

public class RepositoryForMap implements Repository {

	Map<String, Veicolo> map;
	
	public RepositoryForMap() {
		
		map = new HashMap<>();
	}
	
	
	@Override
	public void insert(Veicolo v){	
		map.put(v.getTarga(), v);
	}
	
	@Override
	public Veicolo readById(String targa)
	{
		return map.get(targa);
	}
	
	@Override
	public Collection<Veicolo> readAll(){
		return map.values();}
	
	@Override
	public void update(){ System.out.println("non implementato");}
	
	@Override
	public void delete(Veicolo v) {
		map.remove(v.getTarga());
	}
}


