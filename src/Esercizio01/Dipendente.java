package Esercizio01;


public class Dipendente {
	private static double stipendioBase = 1000;
	private static String matricola;
	private static double stipendio;
	private static double importoOrarioStraordinario;
	private static Livello livello;
	private static Dipartimento dipartimento;


	public Dipendente(String _matricola, Dipartimento _dipartimento) {
		this.matricola = _matricola;
		this.dipartimento = _dipartimento;
		this.stipendio = stipendioBase;
		this.importoOrarioStraordinario = 30;
		this.livello = Livello.OPERAIO;
	}


	public Dipendente(String _matricola, Dipartimento _dipartimento, double _stipendio,
			double _importoOrarioStraordinario,
			Livello _livello) {
		this.matricola = _matricola;
		this.dipartimento = _dipartimento;
		this.stipendio = _stipendio;
		this.importoOrarioStraordinario = _importoOrarioStraordinario;
		this.livello = _livello;
	}


	public void stampaDatiDipendente() {
		System.out.printf(
				"Matricola: %s\nDipartimento: %s\nStipendio: %.2f\nImporto Orario Straordinario: %.2f\nLivello: %s\n\n\n",
				matricola, dipartimento, stipendio, importoOrarioStraordinario, livello);
	}

	public Livello promuovi() {
		switch (this.livello) {

		case OPERAIO:
			this.livello = Livello.IMPIEGATO;
			this.stipendio = this.stipendioBase * 1.2;
			break;

		case IMPIEGATO:
			this.livello = Livello.QUADRO;
			this.stipendio = this.stipendio * 1.5;
			break;

		case QUADRO:
			this.livello = Livello.DIRIGENTE;
			this.stipendio = this.stipendio * 2;
			break;

		case DIRIGENTE:
			System.out.println("Impossibile promuovere il Dipendente Matricola " + this.matricola);
			break;
		}
		return this.livello;
	}

	public static double calcolaPaga(Dipendente dipendente) {
		return dipendente.stipendio;
	}

	public static double calcolaPaga(Dipendente dipendente, int ore) {
		return (dipendente.stipendio + dipendente.importoOrarioStraordinario * ore);
	}

	public void getMatricola() {
		System.out.println("Matricola: " + this.matricola);
	}

	public double getStipendio() {
//		System.out.println("Stipendio: " + this.stipendio);
		return this.stipendio;
	}

	public double getImportoOraStraordinario() {
		// System.out.println("Importo Ora Straordinario: " +
		// this.importoOrarioStraordinario);
		return this.importoOrarioStraordinario;
	}

	public void getLivello() {
		System.out.println("Livello: " + this.livello);
	}

	public void getDipartimento() {
		System.out.println("Dipartimento: " + this.dipartimento);
	}

	public void setDipartimento(Dipartimento nuovoDipartimento) {
		this.dipartimento = nuovoDipartimento;
	}

	public void setImportoOrarioStraordinario(double nuovoImportoOrario) {
		this.importoOrarioStraordinario = nuovoImportoOrario;
	}
}

