package Esercizio02;

import Esercizio01.Dipartimento;
import Esercizio01.Dipendente;
import Esercizio01.Livello;

public class GestioneDipendenti {

	public static void main(String[] args) {
		
		Dipendente operaio01 = new Dipendente("007", Dipartimento.PRODUZIONE);
		Dipendente operaio02 = new Dipendente("008", Dipartimento.PRODUZIONE);
		Dipendente impiegato01 = new Dipendente("009", Dipartimento.AMMINISTRAZIONE);
		Dipendente dirigente01 = new Dipendente("010", Dipartimento.AMMINISTRAZIONE, 1754.87, 32.54, Livello.DIRIGENTE);
		operaio01.promuovi();
		impiegato01.promuovi();
		// impiegato01.stampaDatiDipendente();
		Dipendente[] dipendenti = new Dipendente[] { operaio01, operaio02, impiegato01, dirigente01 };
		stampaDatiTuttiDipendenti(dipendenti);
		// System.out.println(operaio01.getStipendio());
		double stipendioTotale = stipendioTotale(dipendenti);
		System.out.printf("Lo stipendio totale dei dipendenti è %.2f euro", stipendioTotale);

	}
	
	public static void stampaDatiTuttiDipendenti(Dipendente[] array) {

		for (Dipendente dipendente : array) {
			dipendente.stampaDatiDipendente();

		}
	}

	public static double stipendioTotale(Dipendente[] array) {
		double stipendio = 0;
		for (Dipendente dipendente : array) {
			stipendio += dipendente.getStipendio() + dipendente.getImportoOraStraordinario() * 5;

		}
		return stipendio;
	}

}
