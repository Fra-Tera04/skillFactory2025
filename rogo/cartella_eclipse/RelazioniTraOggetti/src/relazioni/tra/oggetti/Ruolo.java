package relazioni.tra.oggetti;

import java.util.List;

public class Ruolo {

	private int id;
	private String nome;
	private List<Account> accounts;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public Ruolo() {
		super();
	}
	public Ruolo(int id, String nome, List<Account> accounts) {
		super();
		this.id = id;
		this.nome = nome;
		this.accounts = accounts;
	}
	@Override
	public String toString() {
		return "Ruolo [id=" + id + ", nome=" + nome + "]";
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Account> getAccounts() {
		return accounts;
	}
	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}
	
}
