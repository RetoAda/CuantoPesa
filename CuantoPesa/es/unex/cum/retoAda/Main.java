package es.unex.cum.retoAda;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in); //Objeto scanner para introducir datos
		int numero = 0;
		Boolean correcto = false;
		ArrayList <Integer> lista  = new ArrayList <Integer> ();
		Main M = new Main();
		/*
		 * En primer lugar, se introducen el número de contadores.
		 * Además, se controla que únicamente se pueda introducir un número entero.
		 */
		do {
			try {
				numero = sc.nextInt();
				correcto = true;
			}catch (InputMismatchException ex) {
				System.out.println("Error");
				numero = 0;
				sc = new Scanner(System.in); //Se reinicia el escaner porque peta
			}
		}while (correcto == false);

		correcto = false;
		for (int i = 0; i < numero; i++) {
			do {
				try {
					int n = sc.nextInt();
					lista.add(n);
					correcto = true;
				}catch (InputMismatchException ex) {
					System.out.println("Error");
					numero = 0;
					sc = new Scanner(System.in); //Se reinicia el escaner porque peta
				}
			}while (correcto == false);
		}
		M.calcularPeso(lista);
		sc.close();
	}

	public void calcularPeso (ArrayList <Integer> lista) {
		Iterator it = lista.iterator();
		while (it.hasNext()) {
			int numero = (int) it.next();
			String num = String.valueOf(numero);

			int peso = 0;
			for (int i=0; i<num.length(); i++) {
				peso = peso + Integer.parseInt(String.valueOf(num.charAt(i)));
			}
			System.out.println(peso);
		}
	}

}
