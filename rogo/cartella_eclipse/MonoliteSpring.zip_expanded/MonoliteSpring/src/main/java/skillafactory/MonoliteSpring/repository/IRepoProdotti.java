package skillafactory.MonoliteSpring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import skillafactory.MonoliteSpring.model.Prodotto;

public interface IRepoProdotti extends JpaRepository<Prodotto, Integer> {

}
