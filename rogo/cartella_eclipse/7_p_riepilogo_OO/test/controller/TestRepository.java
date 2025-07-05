package controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.Persona;
import repository.IRepository;
import repository.RepositoryMySql;

class TestRepository {

	@Test
	void test() {
		fail("Not yet implemented");
	}

	
	@Test
	void test1()
	{
		IRepository repo = new RepositoryMySql();
		
		Persona p = new Persona("poiu", "mara", null, null, null, null);
		
		assertFalse(repo.insersci(p));
	}
	
}
