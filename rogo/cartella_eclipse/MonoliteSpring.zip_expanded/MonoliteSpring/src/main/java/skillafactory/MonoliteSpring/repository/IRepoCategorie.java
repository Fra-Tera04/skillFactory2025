package skillafactory.MonoliteSpring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import skillafactory.MonoliteSpring.model.Categoria;

public interface IRepoCategorie extends JpaRepository<Categoria, Integer> {

	public Categoria findById(int id);
	
}
