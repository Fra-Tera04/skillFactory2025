
import test.*;

public class Avvio {

    public static void main(String args[])
    {
    	Barista b1 = new Barista("marco","Mancini", 19);
    	Barista b2 = new Barista("Sara","Monica", 2);
    	
    	Pizzaiolo p1 = new Pizzaiolo("porcorello","mortarello");
    	Pizzaiolo p2 = new Pizzaiolo("Schiavone","Francesco");
    	
    	Persona c1 = new Persona("Mario","Perugino");
    	Persona c2 = new Persona("Marcello","Sparato");
    	
    	
    	System.out.println(String.format("Il barista %s serve la persona %s con il pizzaiolo %s",b1.nome,c1.getNome(),p1.getNome()));
    	
    	b1.faiCaffe();
    	b1.spillaBirra();
    }
}
