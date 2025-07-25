package skillafactory.MonoliteSpring.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "utenti")
public class Utente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(length=30, nullable=false)
	private String nome;
	
	@Column(length=30, nullable=false)
	private String cognome;
	
	@Column(length=30, nullable=false, unique = true)
	private String cf;
	
	@Column(nullable=false)
	private Date dataNascita;
	
	@Column(length=30, nullable=false, unique = true)
	private String username;
	
	@Column(length=30, nullable=false, unique = true)
	private String email;
	
	@Column(length=30, nullable=false)
	private String password;
	
	@ManyToOne
	@JoinColumn(name = "id_ruolo", referencedColumnName = "id")
	private Ruolo ruolo;

	
	public Utente() {
		super();
	}

	public Utente(int id, String nome, String cognome, String cf, Date dataNascita, String username, String email,
			String password, Ruolo ruolo) {
		super();
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.cf = cf;
		this.dataNascita = dataNascita;
		this.username = username;
		this.email = email;
		this.password = password;
		this.ruolo = ruolo;
	}

	@Override
	public String toString() {
		return "Utente [id=" + id + ", nome=" + nome + ", cognome=" + cognome + ", cf=" + cf + ", dataNascita="
				+ dataNascita + ", username=" + username + ", email=" + email + ", password=" + password + ", ruolo="
				+ ruolo + "]";
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

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getCf() {
		return cf;
	}

	public Date getDataNascita() {
		return dataNascita;
	}

	public void setDataNascita(Date dataNascita) {
		this.dataNascita = dataNascita;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Ruolo getRuolo() {
		return ruolo;
	}

	public void setRuolo(Ruolo ruolo) {
		this.ruolo = ruolo;
	}

	public void setCf(String cf) {
		this.cf = cf;
	}

}
