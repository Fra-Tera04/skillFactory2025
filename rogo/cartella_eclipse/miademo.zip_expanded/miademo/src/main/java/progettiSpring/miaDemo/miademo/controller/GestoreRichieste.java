package progettiSpring.miaDemo.miademo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import progettiSpring.miaDemo.miademo.model.Account;
import progettiSpring.miaDemo.miademo.model.Utente;
import progettiSpring.miaDemo.miademo.repository.IRepoAccount;
import progettiSpring.miaDemo.miademo.repository.IRepoUtente;

@RestController
public class GestoreRichieste {
	
	@Autowired
	IRepoUtente repoUtente;
	
	@Autowired
	IRepoAccount repoAccount;
	
	@GetMapping("/")
	public String saluto() 
	{
		return "Home";
	}
	
	@GetMapping("/saluto")
	public String saluto2(@RequestParam String nome, String cognome) 
	{
		return "Ti saluto "+ nome + " " + cognome;
	}

	
	@PostMapping("/registra")
	public String insert(@RequestParam String nome, String cognome, String cf, double stipendio) 
	{
		
		Utente u = new Utente();
		u.setNome(nome);
		u.setCognome(cognome);
		u.setCf(cf);
		//u.setStipendio(BigDecimal. stipendio);
	
		repoUtente.save(u);
		return "ok";
	}

	@PostMapping("/recu")
	public String recU(Utente u)
	{		
		repoUtente.save(u);
		return "ok";
	}
	
	@DeleteMapping("/deleteu")
	public String deleteU(@RequestParam int id)
	{
		repoUtente.deleteById(id);
		return "ture";
	}
	
	@GetMapping("getallu")
	public List<Utente> redAllU()
	{
		return repoUtente.findAll();
	}
	
	@GetMapping("getu")
	public Optional<Utente> readOneU(@RequestParam int id)
	{
		return repoUtente.findById(id);
	}

	
	
	@PostMapping("/reca")
	public String recA(Account a)
	{		
		repoAccount.save(a);
		return "ok";
	}
	
	@DeleteMapping("/deletea")
	public String deleteA(@RequestParam int id)
	{
		repoAccount.deleteById(id);
		return "ture";
	}
	
	@GetMapping("getalla")
	public List<Account> redAllA()
	{
		return repoAccount.findAll();
	}
	
	@GetMapping("geta")
	public Optional<Account> readOneA(@RequestParam int id)
	{
		return repoAccount.findById(id);
	}

}
