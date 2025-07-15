package skillafactory.MonoliteSpring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import skillafactory.MonoliteSpring.model.Prodotto;

@Repository
public interface IRepoProdotti extends JpaRepository<Prodotto, Integer> {

}
