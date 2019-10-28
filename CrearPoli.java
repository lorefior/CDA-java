package polinomio;

import java.util.ArrayList;
import java.util.Scanner;

public class CrearPoli {
	public static void main(String[] args) {
		int cont = 0;
		int c = 0;

		Scanner leer = new Scanner(System.in);
		System.out.println("¿De que grado quiere el polinomio?");
		int g = leer.nextInt();
		ArrayList<Integer> coeficiente = new ArrayList<Integer>();
		for (int i = 0; i < g; i++) {
			System.out.println("ingrese el coeficiente");
			c = leer.nextInt();
			coeficiente.add(c);
			cont++;

		}
		System.out.println(coeficiente);
		for (int j = 0; j < g - 1; j++) {
			System.out.print(c + "x^" + cont + " + ");

		}
	}
}
