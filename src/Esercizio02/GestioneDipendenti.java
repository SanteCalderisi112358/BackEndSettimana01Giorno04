package Esercizio02;

import Esercizio01.Dipartimento;
import Esercizio01.Dipendente;

public class GestioneDipendenti {

	public static void main(String[] args) {
		
		Dipendente operaio01 = new Dipendente("007", Dipartimento.PRODUZIONE);
		Dipendente operaio02 = new Dipendente("008", Dipartimento.PRODUZIONE);
		Dipendente impiegato01 = new Dipendente("009", Dipartimento.AMMINISTRAZIONE);
		Dipendente dirigente01 = new Dipendente("010", Dipartimento.VENDITE);
		operaio01.promuovi();
		impiegato01.promuovi();
		impiegato01.stampaDatiDipendente();
		Dipendente[] dipendenti = new Dipendente[] { operaio01, operaio02, impiegato01, dirigente01 };
		// stampaDatiDipendenti(dipendenti);
		System.out.println(operaio01.getStipendio());
		double stipendioTotale = stampaStipendioDipendenti(dipendenti);
		System.out.printf("Lo stipendio totale dei dipendenti è %.2f euro", stipendioTotale);

	}
	
	public static void stampaDatiDipendenti(Dipendente[] array) {

		for (Dipendente dipendente : array) {
			dipendente.stampaDatiDipendente();

		}
	}

	public static double stampaStipendioDipendenti(Dipendente[] array) {
		double stipendio = 0;
		for (Dipendente dipendente : array) {
			stipendio += dipendente.getStipendio();

		}
		return stipendio;
	}

}
