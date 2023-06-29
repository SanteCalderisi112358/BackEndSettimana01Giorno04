//Calcolo del fattoriale di un numero:
//Scrivi un programma che chieda all'utente di inserire un numero intero positivo e 
//calcoli il suo fattoriale. Utilizza la formula del fattoriale: F = 1 * 2 * 3 * ... * N.

package EserciziVari;

import java.util.Scanner;

public class Esercizio01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Inserire numero");
		int numero = input.nextInt();
		controllo(numero);
		input.close();
	}
	
	public static int fattoriale(int num) {
		int f = 1;
		for (int i = 1; i <= num; i++) {
			f = f * i;

		}
		return f;
	}

	public static void controllo(int num) {
		if (num < 0) {
			System.out.println("Inserire un numero positivo!");
		} else {
			int numeri = fattoriale(num);
			System.out.printf("%d! = %d", num, numeri);
		}
	}

}
