package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import model.Persona;
import java.math.BigDecimal;

public class Avvio {

	public static void main(String[] args) {

		List<Persona> arr = new ArrayList<>();
		
		Persona p1 = new Persona("cf_marmorc€","marco","moro",2300.7f);
		Persona p2 = new Persona("cf_scomote€","moltoc","scorf",1200.2f);
		Persona p3 = new Persona("cf_mosason€","mosac","oroson",2100.1f);
		
		arr.add(p1);
		arr.add(p2);
		arr.add(p3);
		
		
		
		for (Persona persona : arr) 
			System.out.println(persona);
		
		Map<String,Persona> arrH = new HashMap<>();
		
		Persona p4 = new Persona("cf_marmorc€","marco","moro",2300.7f);
		Persona p5 = new Persona("cf_scomote€","moltoc","scorf",1200.2f);
		Persona p6 = new Persona("cf_mosason€","mosac","oroson",2100.1f);
		
		arrH.put("01", p4);
		arrH.put("02", p5);
		arrH.put("03", p6);
		
		for (Entry<String,Persona> p : arrH.entrySet()) 
			System.out.println(p.getValue());
		
	}
}
