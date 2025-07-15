package skillafactory.MonoliteSpring.config;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import skillafactory.MonoliteSpring.model.Categoria;
import skillafactory.MonoliteSpring.model.Marca;
import skillafactory.MonoliteSpring.model.Ruolo;
import skillafactory.MonoliteSpring.model.Utente;
import skillafactory.MonoliteSpring.repository.IRepoCategorie;
import skillafactory.MonoliteSpring.repository.IRepoMarche;
import skillafactory.MonoliteSpring.repository.IRepoRuolo;
import skillafactory.MonoliteSpring.repository.IRepoUtente;

@Configuration
public class CheckRecords {

	@Autowired
	IRepoMarche repoMarca;

	@Autowired
	IRepoCategorie repoCategoria;

	@Autowired
	IRepoUtente repoUtente;

	@Autowired
	IRepoRuolo repoRuolo;

	@Bean
	String checkMarche()
	{
		if (repoMarca.findAll().isEmpty()) {

			Marca m = new Marca();
			m.setNome("Adidas");
			repoMarca.save(m);

			m = new Marca();
			m.setNome("Nike");
			repoMarca.save(m);

			m = new Marca();
			m.setNome("Pesca");
			repoMarca.save(m);

			m = new Marca();
			m.setNome("Mortebianca");
			repoMarca.save(m);

			System.out.println("Marche Aggiunte");
		}
		else
			System.out.println("Marche caricate");

		return null;
	}


	@Bean
	String checkCategorie()
	{
		if (repoCategoria.findAll().isEmpty()) {

			Categoria c = new Categoria();
			c.setNome("Nuoto");
			repoCategoria.save(c);

			c = new Categoria();
			c.setNome("Industria");
			repoCategoria.save(c);

			c = new Categoria();
			c.setNome("Sadomasso");
			repoCategoria.save(c);

			c = new Categoria();
			c.setNome("Sternuto");
			repoCategoria.save(c);

			System.out.println("\nCategorie Aggiunte\n");
		}
		else
			System.out.println("\nCategorie Caricate\n");

		return null;
	}

	@Bean
	String chechRuoli()
	{
		if(repoRuolo.findAll().isEmpty())
		{
			Ruolo r = new Ruolo("GUEST");
			repoRuolo.save(r);

			r = new Ruolo("ADMIN");
			repoRuolo.save(r);
			
			System.out.println("Ruoli Aggiunti");
		}
		else
			System.out.println("Ruoli Caricati");

		return null;
	}

}
