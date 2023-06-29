package Esercizio01;


public class Dipendente {
	private static double stipendioBase = 1000;
	private String matricola;
	private double stipendio;
	private double importoOrarioStraordinario;
	private Livello livello;
	private Dipartimento dipartimento;

//	Definire due costruttori: 
//		- uno che accetti solo la matricola e Dipartimento ed imposti i seguenti valori
//			- stipendio = stipendioBase
//			- importoOrarioStraordinario = 30
//			- Livello = OPERAIO
	public Dipendente(String _matricola, Dipartimento _dipartimento) {
		this.matricola = _matricola;
		this.dipartimento = _dipartimento;
		this.stipendio = stipendioBase;
		this.importoOrarioStraordinario = 30;
		this.livello = Livello.OPERAIO;
	}

//	- Uno che accetti tutti i parametri
	public Dipendente(String _matricola, Dipartimento _dipartimento, double _stipendio,
			double _importoOrarioStraordinario,
			Livello _livello) {
		this.matricola = _matricola;
		this.dipartimento = _dipartimento;
		this.stipendio = _stipendio;
		this.importoOrarioStraordinario = _importoOrarioStraordinario;
		this.livello = _livello;
	}

//	Definire i seguenti metodi
//	- stampaDatiDipendente - Stampa i dati del dipendente
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
//	Definire i seguenti metodi statici:
//		- calcolaPaga - accetta un'istanza di dipendente e ne ritorna lo stipendio mensile
//		- calcolaPaga - accetta un'istanza di dipendente ed un parametro intero con le ore 
//	di straordinario e ritorna lo stipendio mensile comprensivo di straordinario

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

	public void getImportoOraStraordinario() {
		System.out.println("Importo Ora Straordinario: " + this.importoOrarioStraordinario);
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

