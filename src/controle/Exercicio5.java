package controle;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		// Refatorar o exercício 04, utilizando a estrutura switch.

		Scanner entrada = new Scanner(System.in);

		int numero;
		int contadorDeDivisores = 0;

		System.out.println("Digite um número: ");
		numero = entrada.nextInt();

		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				contadorDeDivisores++;
			}
		}

		switch (contadorDeDivisores) {
		case 0:
			System.out.println("Número primo");
			break;
		default:
			System.out.println("Número não primo");
		}

		entrada.close();
	}
}
