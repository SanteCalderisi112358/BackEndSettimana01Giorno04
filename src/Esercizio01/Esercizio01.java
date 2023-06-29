package Esercizio01;

public class Esercizio01 {

	public static void main(String[] args) {
		Dipendente lavoratore1 = new Dipendente("007", Dipartimento.AMMINISTRAZIONE);
		Dipendente lavoratore2 = new Dipendente("666", Dipartimento.VENDITE);
		Dipendente lavoratore3 = new Dipendente("657", Dipartimento.PRODUZIONE, 1543.54, 7.54, Livello.OPERAIO);
		Dipendente lavoratore4 = new Dipendente("999", Dipartimento.AMMINISTRAZIONE, 1748.84, 8.54, Livello.OPERAIO);
		Dipendente lavoratore5 = new Dipendente("659", Dipartimento.AMMINISTRAZIONE, 2354.63, 10.43, Livello.DIRIGENTE);
		lavoratore1.stampaDatiDipendente();
//		lavoratore2.stampaDatiDipendente();
//		lavoratore3.stampaDatiDipendente();
//		lavoratore4.stampaDatiDipendente();
//		lavoratore1.getMatricola();
//		lavoratore1.getDipartimento();
//		lavoratore4.getLivello();
		lavoratore1.getImportoOraStraordinario();
		lavoratore1.setImportoOrarioStraordinario(35.00);
		lavoratore1.getImportoOraStraordinario();
		lavoratore5.promuovi();
		lavoratore5.stampaDatiDipendente();
	}

}
