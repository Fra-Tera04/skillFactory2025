package skillfactory.monolite.aerei.AaereiProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import skillfactory.monolite.aerei.AaereiProject.model.AccountAziendale;

@Repository
public interface IRepoAccount extends JpaRepository<AccountAziendale, Integer> {

	void deleteByEmail(String email);

}
