package conctroller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import model.Auto;
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
		return map.values();
	}
	
	@Override
	public Veicolo update(Veicolo v){
		
		Veicolo ret = null;
		
		try {
			ret = map.replace(v.getTarga(), v);
		} catch (Exception e) {
			e.printStackTrace();
			ret = new Auto();
		}
		
		return ret;
	}
	
	@Override
	public Veicolo delete(Veicolo v) {
		return map.remove(v.getTarga());
	}
}


