package gestione.classe.anonima;

public interface IFigura2D {

	public double calcolaArea();
	public default double calcolaPerimetro() { return 0;};
}
