package model;

public class Moto extends Veicolo {

	private String stileManubrio;
	
	public Moto(String targa, String modello, String marca, String colore, String stileManubrio) {
		super(targa, modello, marca, colore);
		this.setStileManubrio(stileManubrio);
	}

	public String getStileManubrio() {
		return stileManubrio;
	}

	public void setStileManubrio(String stileManubrio) {
		this.stileManubrio = stileManubrio;
	}

	
	
}
