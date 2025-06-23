package model;

public class Persona {

	private String nome;
	private String congome;
	private String cf;
	public String getCf() {
		return cf;
	}
	public void setCf(String cf) {
		this.cf = cf;
	}
	private float stipendio;
	
	
	public Persona(String cf, String nome, String congome, float stipendio) {
		super();
		this.cf = cf;
		this.nome = nome;
		this.congome = congome;
		this.stipendio = stipendio;
	}
	@Override
	public String toString() {
		return "Persona [nome=" + nome + ", congome=" + congome + ", cf=" + cf + ", stipendio=" + stipendio + "]";
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCongome() {
		return congome;
	}
	public void setCongome(String congome) {
		this.congome = congome;
	}
	public float getStipendio() {
		return stipendio;
	}
	public void setStipendio(float stipendio) {
		this.stipendio = stipendio;
	}
}
