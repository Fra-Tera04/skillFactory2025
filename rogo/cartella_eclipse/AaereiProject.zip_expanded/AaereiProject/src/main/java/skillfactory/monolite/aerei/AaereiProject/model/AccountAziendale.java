package skillfactory.monolite.aerei.AaereiProject.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "accounts_aziendale")
public class AccountAziendale {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(length=30, nullable=false)
	private String nome;
	@Column(length=30, nullable=false)
	private String cognome;
	@Column(length=30, nullable=false)
	private Date dataNascita;
	@Column(length=30, nullable=false, unique = true)
	private String username;
	@Column(length=30, nullable=false, unique = true)
	private String email;
	@Column(length=30, nullable=false)
	private String password;
	
	
	public AccountAziendale() {
		super();
	}
	public AccountAziendale(String nome, String cognome, Date dataNascita, String username, String email,
			String password) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.dataNascita = dataNascita;
		this.username = username;
		this.email = email;
		this.password = password;
	}
	@Override
	public String toString() {
		return "AccountAziendale [id=" + id + ", nome=" + nome + ", cognome=" + cognome + ", dataNascita=" + dataNascita
				+ ", username=" + username + ", email=" + email + ", password=" + password + "]";
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
}
