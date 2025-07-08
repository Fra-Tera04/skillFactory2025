package progettiSpring.miaDemo.miademo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import progettiSpring.miaDemo.miademo.model.Utente;

@Repository
public interface IRepoUtente extends JpaRepository<Utente, Integer>{

	/*
	 * T save(T t) 	| quaesto metodo serve sia per l'insert che per l'update.
	 * T deleteById(int id)| 
	 * T findById(int id)
	 * List<T> findAll()
	 * 
	 * */
}
