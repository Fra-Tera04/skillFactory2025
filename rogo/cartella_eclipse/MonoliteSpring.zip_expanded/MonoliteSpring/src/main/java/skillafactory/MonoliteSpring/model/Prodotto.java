package skillafactory.MonoliteSpring.model;

import java.math.BigDecimal;
import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="prodotti")
public class Prodotto {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(length = 30, unique = true, nullable = true)
	private String nome;
	
	@Column
	private Date data;
	
	@Column(precision = 7, scale = 2, nullable = false)
	private BigDecimal prezzo;
	
	@Column
	private int quantita;
	
	@Column
	private String descrizione;

	
	@ManyToOne
	@JoinColumn(name = "id_marca", referencedColumnName = "id")
	private Marca marca;
	
	@ManyToOne
	@JoinColumn(name = "id_categoria", referencedColumnName = "id")
	private Categoria categoria;
	
	
	
	
	public Prodotto() {
		super();
	}


	public Prodotto(int id, String nome, Date data, BigDecimal prezzo, int quantita, String descrizione, Marca marca,
			Categoria categoria) {
		super();
		this.id = id;
		this.nome = nome;
		this.data = data;
		this.prezzo = prezzo;
		this.quantita = quantita;
		this.descrizione = descrizione;
		this.marca = marca;
		this.categoria = categoria;
	}


	@Override
	public String toString() {
		return "Prodotto [id=" + id + ", nome=" + nome + ", data=" + data + ", prezzo=" + prezzo + ", quantita="
				+ quantita + ", descrizione=" + descrizione + ", marca=" + marca + ", categoria=" + categoria + "]";
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public BigDecimal getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(BigDecimal prezzo) {
		this.prezzo = prezzo;
	}

	public int getQuantita() {
		return quantita;
	}

	public void setQuantita(int quantita) {
		this.quantita = quantita;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	
}
