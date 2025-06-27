package view;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import model.Persona;

public interface IGestioneIO {



public LocalDate leggiData(String messaggio);

public String leggiStringa(String messaggio);

public int leggiIntero(String messaggio);

public double leggiDecimale(String messaggio);

public void formPersona(Persona p);

public void schedaPersona(Persona p);

public void visualizzaPersone(List<Persona> persone);

public void menu();

}
