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

import skillafactory.MonoliteSpring.model.Categoria;
import skillafactory.MonoliteSpring.model.Marca;
import skillafactory.MonoliteSpring.model.Prodotto;
import skillafactory.MonoliteSpring.model.Utente;
import skillafactory.MonoliteSpring.repository.IRepoCategorie;
import skillafactory.MonoliteSpring.repository.IRepoMarche;
import skillafactory.MonoliteSpring.repository.IRepoProdotti;
import skillafactory.MonoliteSpring.repository.RepoMySQL;


@Controller
public class GestoreRichieste {

	@Autowired
	RepoMySQL repoU;

	@Autowired
	IRepoProdotti repoProdotto;

	@Autowired
	IRepoMarche repoMarca;

	@Autowired
	IRepoCategorie repoCategoria;



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


	@PostMapping("/saveProdotto")
	public String saveProdotto(Prodotto p, @RequestParam int idMarca, int idCategoria)
	{	
		try {
			controlliSaveProdotto(p, idMarca, idCategoria);

			Marca m = repoMarca.findById(idMarca).get();
			Categoria c = repoCategoria.findById(idCategoria);

			p.setMarca(m);
			p.setCategoria(c);

		} catch (Exception e) {
			e.printStackTrace();
		}

		repoProdotto.save(p);
		return "/home";
	}


	@GetMapping("/readAllProdotti")
	public String readAllProdotti(Model model)
	{
		model.addAttribute("prodotti", repoProdotto.findAll());

		return "/tabella"; //repoU.findAll();
	}

	@GetMapping("/deleteProdotto")
	public String deleteProdotto(@RequestParam int id)
	{
		try {
			repoProdotto.deleteById(id);
		} catch (Exception e) {
			e.printStackTrace();		
		}
		return "readAllProdotti";
	}


	private void controlliSaveProdotto(Prodotto p, int idMarca, int idCategoria)
	{


	}

}
