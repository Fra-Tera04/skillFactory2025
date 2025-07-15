package skillafactory.MonoliteSpring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import skillafactory.MonoliteSpring.model.Utente;

@Repository
public interface IRepoUtente extends JpaRepository<Utente, Integer> {

}
