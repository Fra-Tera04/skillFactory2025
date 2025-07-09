package skillafactory.MonoliteSpring.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import skillafactory.MonoliteSpring.model.Utente;
import skillafactory.MonoliteSpring.repository.RepoMySQL;


@Controller
public class GestoreRichieste {

	@Autowired
	RepoMySQL repoU;
	
	
	@PostMapping("/rec")
	public String registrati(@RequestParam String surname, String email)
	{		
		System.out.println("nome: " + surname+ "\nemail: " + email+"\nArrivati\n");	
		return "/home";
	}

	@PostMapping("/recu")
	public String recU(Utente u)
	{	
		
		repoU.save(u);
		
		return "/home";
	}
	
	@DeleteMapping("/deleteu")
	public String deleteU(@RequestParam int id)
	{
		repoU.deleteById(id);
		return "/home";
	}
	
	@GetMapping("readallu")
	public String readAllU(Model model)
	{
		model.addAttribute("utenti", repoU.findAll());
		
		return "/tabella"; //repoU.findAll();
	}
	
	@GetMapping("readu")
	public Optional<Utente> readOneU(@RequestParam int id)
	{
		return repoU.findById(id);
	}

	
	
}
