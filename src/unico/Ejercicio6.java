package unico;

import java.util.Scanner;

public class Ejercicio6 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		/*
		 * Escribir todos los múltiplos de 7 menores que 100.
		 */

		@SuppressWarnings("unused")
		Scanner leer = new Scanner(System.in);
		final int MULTIPLO = 7;
		final int TOPE = 100;
		int i;

		for (i = MULTIPLO; i <= TOPE; i++) {
			if (i % MULTIPLO == 0) {
				System.out.println(i);
			}
		}
	}
}
