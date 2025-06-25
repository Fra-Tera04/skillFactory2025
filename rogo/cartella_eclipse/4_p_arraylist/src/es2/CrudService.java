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



	public boolean remove(Persona p)
	{
		boolean ret = false;
		for (Map.Entry<Integer, Persona> entry : map.entrySet()) 	
			if (entry.getValue().equals(p))
			{
				map.remove(entry.getKey());
				ret = true;
			}
		return ret;
	}

	public boolean remove(String codiceFiscale)
	{
		boolean ret = false;
		for (Map.Entry<Integer, Persona> entry : map.entrySet()) 	
			if (entry.getValue().getCf().equals(codiceFiscale))
			{
				map.remove(entry.getKey());
				ret = true;
			}
		return ret;
	}

	
	public void insert(Persona p)
	{
		map.put(++id, p);
	}

	public Collection<Persona> readAll()
	{
		return map.values();
	}

	public static int getId() {
		return id;
	}

}
