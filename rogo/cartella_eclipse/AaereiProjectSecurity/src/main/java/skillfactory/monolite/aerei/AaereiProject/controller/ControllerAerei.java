package skillfactory.monolite.aerei.AaereiProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import skillfactory.monolite.aerei.AaereiProject.AaereiProjectApplication;
import skillfactory.monolite.aerei.AaereiProject.model.AccountAziendale;
import skillfactory.monolite.aerei.AaereiProject.model.Prenotazione;
import skillfactory.monolite.aerei.AaereiProject.repository.IRepoAccount;
import skillfactory.monolite.aerei.AaereiProject.repository.IRepoPrenotazione;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
public class ControllerAerei {

	@Autowired
	IRepoAccount repoAA;

	@Autowired
	IRepoPrenotazione repoP;

	
	@GetMapping("/myLogout")
	public String myLogout() {
		AaereiProjectApplication.restart();
		return "/home";
	}

	////////////// AccountAziendali ----------

	@PostMapping("/saveAccount")
	public String postSaveAccount(AccountAziendale aa) {

		repoAA.save(aa);
		return "/home";
	}
	@GetMapping("/readAllAccountAzinedali")
	public String getAccountAziendali(Model m) {

		m.addAttribute("accounts", repoAA.findAll());
		return "/tabellaAccountAzinedali";
	}
	@GetMapping("/deleteAccountAziendale")
	public String deleteAccountAziendaleByID(@RequestParam String email) {		

		repoAA.deleteByEmail(email);		
		return "readAllAccountAzinedali";
	}

	////////////// Prenotazioni --------------

	@PostMapping("/savePrenotazioneVolo")
	public String postSavePrenotazioneVolo(Prenotazione volo) {
		repoP.save(volo);		
		return "/home";
	}
	@GetMapping("/readAllPrenotazioniVoli")
	public String getPrenotazioniVoli(Model m) {

		m.addAttribute("prenotazioni", repoP.findAll());
		return "/tabellaPrenotazioni";
	}
	@GetMapping("/deletePrenotazione")
	public String deletePrenotazioneByID(@RequestParam String codicePrenotazione) {		
		repoP.deleteByCodicePrenotazione(codicePrenotazione);
		return "readAllPrenotazioniVoli";
	}
}
