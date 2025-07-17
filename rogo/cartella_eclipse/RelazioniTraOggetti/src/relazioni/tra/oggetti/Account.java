package relazioni.tra.oggetti;

public class Account {

	
	private int id;
	private String nome;
	private Ruolo ruolo;
	
	public Ruolo getRuolo() {
		return ruolo;
	}
	public void setRuolo(Ruolo ruolo) {
		this.ruolo = ruolo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Account() {
		super();
	}
	public Account(int id, String nome, Ruolo ruolo) {
		super();
		this.id = id;
		this.nome = nome;
		this.ruolo = ruolo;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", nome=" + nome + ", ruolo=" + ruolo.toString() + "]";
	}
	
	
}
