package skillafactory.MonoliteSpring.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="ruoli")
public class Ruolo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(length = 30, nullable = false)
	private String nome;
	
	@OneToMany(mappedBy = "ruolo")
	private List<Utente> utenti;

	public Ruolo() {
		super();
	}

	public Ruolo(String ruolo) {
		super();
		this.nome = ruolo;
	}

	
	public Ruolo(int id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
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

	public List<Utente> getUtenti() {
		return utenti;
	}

	public void setUtenti(List<Utente> utenti) {
		this.utenti = utenti;
	}

	@Override
	public String toString() {
		return "Ruolo [id=" + id + ", nome=" + nome + ", utenti=" + utenti + "]";
	}
	
}
