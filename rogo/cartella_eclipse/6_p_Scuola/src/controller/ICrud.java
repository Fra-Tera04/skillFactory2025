package controller;

import java.util.List;

import model.Persona;

public interface ICrud {


public void inserisci(Persona p);

public List<Persona> leggi();

public Persona leggi(String cf);//faccio l'overload mettendo gli argomenti

public void elimina(String cf);

}
