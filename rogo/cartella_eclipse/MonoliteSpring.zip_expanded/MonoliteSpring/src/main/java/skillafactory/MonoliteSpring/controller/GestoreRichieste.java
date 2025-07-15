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
import skillafactory.MonoliteSpring.model.Ruolo;
import skillafactory.MonoliteSpring.model.Utente;
import skillafactory.MonoliteSpring.repository.IRepoCategorie;
import skillafactory.MonoliteSpring.repository.IRepoMarche;
import skillafactory.MonoliteSpring.repository.IRepoProdotti;
import skillafactory.MonoliteSpring.repository.IRepoRuolo;
import skillafactory.MonoliteSpring.repository.IRepoUtente;


@Controller
public class GestoreRichieste {

	@Autowired
	IRepoUtente repoU;

	@Autowired
	IRepoProdotti repoProdotto;

	@Autowired
	IRepoMarche repoMarca;

	@Autowired
	IRepoCategorie repoCategoria;

	@Autowired
	IRepoRuolo repoRuolo;

	@PostMapping("/saveUtente")
	public String saveUtente(Utente u, @RequestParam int idRuolo)
	{	
		try {
			controlliSaveUtente(u, idRuolo);

			Ruolo r = repoRuolo.findById(idRuolo).get();
			u.setRuolo(r);

			repoU.save(u);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return "/home";
	}
	@GetMapping("/readAllUtenti")
	public String readAllUtenti(Model model)
	{
		model.addAttribute("utenti", repoU.findAll());

		return "/tabellaUtenti";
	}
	@GetMapping("/deleteUtente")
	public String deleteUtente(@RequestParam int id)
	{
		try {
			
			repoU.deleteById(id);
			
		} catch (Exception e) {
			e.printStackTrace();		
		}
		return "readAllUtenti";
	}
	private void controlliSaveUtente(Utente u, int idRuolo) {
		
	}
	
	// Prodotti -------------------------------------------
	
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

		return "/tabellaProdotti"; //repoU.findAll();
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
