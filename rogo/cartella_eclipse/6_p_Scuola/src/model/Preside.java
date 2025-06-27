package model;

import java.time.LocalDate;

public class Preside extends Docente {

	private LocalDate dataInizioIncarico;
	private LocalDate dataFineIncarico;
	private double bugetGestito;

	 /**
     * Approva il piano didattico annuale di un dipartimento o dell'intera scuola.
     * Questo metodo simula l'approvazione di un piano didattico.
     *
     * @param nomePiano Il nome o l'identificativo del piano didattico da approvare.
     * @return true se l'approvazione ha avuto successo, false altrimenti.
     */
    public boolean approvaPianoDidattico(String nomePiano) {
        // System.out.println(getNome() + " " + getCognome() + " (Preside) ha approvato il piano didattico: " + nomePiano);
        // Logica di approvazione reale (es. aggiornamento DB, notifica)
        return true;
    }
}
