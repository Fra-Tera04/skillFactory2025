package progettiSpring.miaDemo.miademo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class GestoreRichieste {

	@GetMapping("/saluto")
	public String saluto() 
	{
		return "Saluti a tutti i popoli";
	}


	@GetMapping("/saluto2")
	public String saluto2(@RequestParam String nome, String cognome) 
	{
		return "WoooooW ecco "+ nome + " " + cognome;
	}

	@GetMapping("/saluto3")
	public String saluto2(@RequestParam int n1, int n2, int n3) 
	{
		int soso = n1+n2+n3;
		return "WoooooW ecco la somma di "+ n1 + " + " + n2 + " + "+n3 + " = "+ soso;
	}

	
}
