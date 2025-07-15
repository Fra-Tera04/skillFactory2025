package skillafactory.MonoliteSpring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import skillafactory.MonoliteSpring.model.Marca;

@Repository
public interface IRepoMarche extends JpaRepository<Marca, Integer> {

	
	//public Marca findById(int id);
	
		
	
}
