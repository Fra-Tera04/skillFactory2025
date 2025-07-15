package skillfactory.monolite.aerei.AaereiProject.model;

import java.math.BigDecimal;
import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "prenotazioni")
public class Prenotazione {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(length=30, nullable=false, unique = true)
	private String codicePrenotazione;
	
	@Column(length=30, nullable=false)
	private String arrivo;
	@Column(length=30, nullable=false)
	private String partenza;
	
	@Column(nullable=false)
	private Date dataArrivo;
	@Column(nullable=false)
	private Date dataPartenza;
	
	@Column(length=30, nullable=false)
	private String compagnia;
	@Column(nullable=false)
	private int nPasseggeri;
	@Column(scale = 2, precision = 6, nullable=false)
	private BigDecimal prezzo;
	
	public Prenotazione() {
		super();
	}
	public Prenotazione(String codicePrenotazione, String arrivo, String partenza, Date dataArrivo, Date dataPartenza,
			String compagnia, int nPasseggeri, BigDecimal prezzo) {
		super();
		this.codicePrenotazione = codicePrenotazione;
		this.arrivo = arrivo;
		this.partenza = partenza;
		this.dataArrivo = dataArrivo;
		this.dataPartenza = dataPartenza;
		this.compagnia = compagnia;
		this.nPasseggeri = nPasseggeri;
		this.prezzo = prezzo;
	}
	@Override
	public String toString() {
		return "Prenotazione [id=" + id + ", codicePrenotazione=" + codicePrenotazione + ", arrivo=" + arrivo
				+ ", partenza=" + partenza + ", dataArrivo=" + dataArrivo + ", dataPartenza=" + dataPartenza
				+ ", compagnia=" + compagnia + ", nPasseggeri=" + nPasseggeri + ", prezzo=" + prezzo + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCodicePrenotazione() {
		return codicePrenotazione;
	}
	public void setCodicePrenotazione(String codicePrenotazione) {
		this.codicePrenotazione = codicePrenotazione;
	}
	public String getArrivo() {
		return arrivo;
	}
	public void setArrivo(String arrivo) {
		this.arrivo = arrivo;
	}
	public String getPartenza() {
		return partenza;
	}
	public void setPartenza(String partenza) {
		this.partenza = partenza;
	}
	public Date getDataArrivo() {
		return dataArrivo;
	}
	public void setDataArrivo(Date dataArrivo) {
		this.dataArrivo = dataArrivo;
	}
	public Date getDataPartenza() {
		return dataPartenza;
	}
	public void setDataPartenza(Date dataPartenza) {
		this.dataPartenza = dataPartenza;
	}
	public String getCompagnia() {
		return compagnia;
	}
	public void setCompagnia(String compagnia) {
		this.compagnia = compagnia;
	}
	public int getnPasseggeri() {
		return nPasseggeri;
	}
	public void setnPasseggeri(int nPasseggeri) {
		this.nPasseggeri = nPasseggeri;
	}
	public BigDecimal getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(BigDecimal prezzo) {
		this.prezzo = prezzo;
	}
}
