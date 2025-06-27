package model;

public class Auto extends Veicolo {

	private int numeroPorte;

	public Auto()
	{
		super(null, null, null, null);
		this.setNumeroPorte(-1);
	}
	
	public Auto(String targa, String modello, String marca, String colore, int numeroPorte) {
		super(targa, modello, marca, colore);
		this.setNumeroPorte(numeroPorte);
	}

	public int getNumeroPorte() {
		return numeroPorte;
	}

	public void setNumeroPorte(int numeroPorte) {
		this.numeroPorte = numeroPorte;
	}
	
}
