package progettiSpring.miaDemo.miademo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import progettiSpring.miaDemo.miademo.model.Account;

@Repository
public interface IRepoAccount extends JpaRepository<Account, Integer> {

	
}
