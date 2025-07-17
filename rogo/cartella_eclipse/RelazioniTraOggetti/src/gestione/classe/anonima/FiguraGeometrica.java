package gestione.classe.anonima;

public abstract class FiguraGeometrica {

	private int id;
	private double latoGen;

	public FiguraGeometrica() {
		super();
	}
	public FiguraGeometrica(int id, double latoGen) {
		super();
		this.id = id;
		this.latoGen = latoGen;
	}
	
	
	public abstract double calcolaArea();
	public abstract double calcolaPerimetro();
	
	
	@Override
	public String toString() {
		return "FiguraGeometrica [id=" + id + ", latoGen=" + latoGen + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getLatoGen() {
		return latoGen;
	}
	public void setLatoGen(double latoGen) {
		this.latoGen = latoGen;
	}
	
}
