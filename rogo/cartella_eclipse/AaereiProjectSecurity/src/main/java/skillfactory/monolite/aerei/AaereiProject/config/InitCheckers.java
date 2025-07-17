package skillfactory.monolite.aerei.AaereiProject.config;

import java.math.BigDecimal;
import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import skillfactory.monolite.aerei.AaereiProject.model.AccountAziendale;
import skillfactory.monolite.aerei.AaereiProject.model.Prenotazione;
import skillfactory.monolite.aerei.AaereiProject.repository.IRepoAccount;
import skillfactory.monolite.aerei.AaereiProject.repository.IRepoPrenotazione;

@Configuration
public class InitCheckers {

	@Autowired
	IRepoAccount repoAA;
	
	@Autowired
	IRepoPrenotazione repoPrenotazione;
	
	@Bean
	String checkAccountAziendale()
	{
		if( repoAA.findAll().isEmpty() )
		{
			AccountAziendale aa = new AccountAziendale("Massimo", "Pacileo", Date.valueOf("1990-12-12"), "MassimoUser", "massima@email.com", "massimaPassword");
			repoAA.save(aa);

			aa = new AccountAziendale("noNome", "Cog-nome", Date.valueOf("1990-11-11"), "username", "e@mail.com", "psw");
			repoAA.save(aa);

			System.out.println("Account Inseriti");
		}
		else
			System.out.println("Account Caricati");

		return null;
	}
	
	@Bean
	String checkPrenotazione()
	{
		if( repoPrenotazione.findAll().isEmpty() )
		{
			Prenotazione p = new Prenotazione("CodeGeas", "Cina", "Napoli", Date.valueOf("2019-12-25"), Date.valueOf("2019-12-24"), "COmpagVIaD", 12, BigDecimal.valueOf(99.74));
			repoPrenotazione.save(p);

			System.out.println("Prenotazione Inserita");
		}
		else
			System.out.println("Prenotazione Caricata");

		return null;
			
	}
}
