package skillfactory.monolite.aerei.AaereiProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import skillfactory.monolite.aerei.AaereiProject.model.Prenotazione;

@Repository
public interface IRepoPrenotazione extends JpaRepository<Prenotazione, Integer> {

	void deleteByCodicePrenotazione(String codicePrenotazione);

}
