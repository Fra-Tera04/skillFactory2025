package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import model.Esercizi24_06;
import model.Persona;
import java.math.BigDecimal;

public class Avvio {

	public static void main(String[] args) {

		Esercizi24_06 e = new Esercizi24_06();
		
		/*
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
		
		List<Integer> arrr = new ArrayList<>();
		System.out.println(e.es1(arrr));
		HashMap<String,String> map = new HashMap<>();
		
		e.es2(map);
		
		for (Map.Entry<String, String> entry : map.entrySet()) {
			String key = entry.getKey();
			String val = entry.getValue();
			
			System.out.println("Key: "+key+" - Value: "+val);	
		}
	*/
		List<String> arr = new ArrayList<>();
		e.es14(arr);
		
		
	}
}
