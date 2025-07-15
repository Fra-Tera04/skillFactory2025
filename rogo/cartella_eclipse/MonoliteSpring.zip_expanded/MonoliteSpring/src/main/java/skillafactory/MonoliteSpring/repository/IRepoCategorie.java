package skillafactory.MonoliteSpring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import skillafactory.MonoliteSpring.model.Categoria;

@Repository
public interface IRepoCategorie extends JpaRepository<Categoria, Integer> {

	public Categoria findById(int id);
	
}
