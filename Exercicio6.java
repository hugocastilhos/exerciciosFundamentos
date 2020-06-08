package fundamentos;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Equa��o: ax� + bx + c = 0");
		System.out.println("Use como exemplo a = 1, b = 12 e c = -13 \nEncontre o delta.");
		
		System.out.println("\nDigite o valor de a: ");
		int a = scanner.nextInt();

		System.out.println("\nDigite o valor de b: ");
		int b = scanner.nextInt();

		System.out.println("\nDigite o valor de c: ");
		int c = scanner.nextInt();

		int delta = (b * b) - (4 * a * c); // F�rmula de Bhaskara.

		System.out.printf("\nSua equa��o �: %dx� + %dx + %d = 0", a, b, c);
		
		System.out.println("\nO delta �: " + delta);

		double x1 = (-b + Math.sqrt(delta)) / (2 * a);

		System.out.printf("O x1 da equa��o �: %.2f", x1);

		double x2 = (-b - Math.sqrt(delta)) / (2 * a);

		System.out.printf("\nO x2 da equa��o �: %.2f" ,x2);
		
		scanner.close();
	}

}