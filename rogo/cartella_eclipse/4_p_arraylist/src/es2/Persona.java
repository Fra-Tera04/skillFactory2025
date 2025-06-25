package es2;

public class Persona {

	private String nome;
	private String cognome;
	private String citta;
	private String cf;
	private int eta;
	
	
	public Persona() {
		this("as"+Math.random()*1000,"ng"+Math.random()*1000,"tr"+Math.random()*1000,
				"gfd"+Math.random()*1000,1+(int)Math.random()*50);
	}
	
	public Persona(String nome, String cognome, String citta, String cf, int eta) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.citta = citta;
		this.cf = cf;
		this.eta = eta;
	}

	
	@Override
	public String toString() {
		return "Persona = [ cf=" + cf + " nome=" + nome + ", cognome=" + cognome + ", citta=" + citta + ", eta=" + eta
				+ "]";
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
	public String getCitta() {
		return citta;
	}
	public void setCitta(String citta) {
		this.citta = citta;
	}
	public String getCf() {
		return cf;
	}
	public void setCf(String cf) {
		this.cf = cf;
	}
	public int getEta() {
		return eta;
	}
	public void setEta(int eta) {
		this.eta = eta;
	}
	
}
