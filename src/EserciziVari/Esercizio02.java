//Calcolo della somma dei primi N numeri naturali:
//Scrivi un programma che chieda all'utente di inserire un numero intero N e calcoli la 
//somma dei primi N numeri naturali. Utilizza la formula della somma dei primi N numeri 
//naturali: S = N * (N + 1) / 2.

package EserciziVari;

import java.util.Scanner;

public class Esercizio02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Inserire numero");
		int numero = input.nextInt();
		controllo(numero);

		input.close();
	}

	public static int calcoloNprimi(int num) {
		int s = num * (num + 1) / 2;
		return s;
	}

	public static void controllo(int num) {
		if (num < 0) {
			System.out.println("Inserire un numero positivo!");
		} else {
			int numeri = calcoloNprimi(num);
			System.out.printf("La somma dei primi %d numeri naturali è %d", num, numeri);
		}
	}
}
