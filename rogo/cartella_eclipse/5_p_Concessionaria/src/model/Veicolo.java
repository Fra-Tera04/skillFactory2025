package model;

public abstract class Veicolo {
	private int id;
	private String targa;
	private String modello;
	private String marca;
	private String colore;
	
	public Veicolo(String targa, String modello, String marca, String colore) {
		super();
		this.targa = targa;
		this.modello = modello;
		this.marca = marca;
		this.colore = colore;
	}
	
	public void avvio() 
	{
		
	}
	public void stop() {}
	public void run() {}
	public void spegni() {}
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTarga() {
		return targa;
	}
	public void setTarga(String targa) {
		this.targa = targa;
	}
	public String getModello() {
		return modello;
	}
	public void setModello(String modello) {
		this.modello = modello;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getColore() {
		return colore;
	}
	public void setColore(String colore) {
		this.colore = colore;
	}
	
}
