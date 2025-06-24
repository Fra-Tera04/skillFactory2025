package es2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class CrudService 
{
	
	private static Map<Integer, Persona> map;
	private static int id = 0;
	
	public CrudService()
	{
		super();
		map = new HashMap<>();
	}
	
	
	
	public void insert(Persona p)
	{
		map.put(++id, p);
	}
	
	public Collection<Persona> readAll()
	{
		return map.values();
	}

}
