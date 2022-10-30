package controle;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		//Criar um programa que receba um número
		//e diga se ele é um número primo.
		
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

		if (contadorDeDivisores == 0) {
			System.out.println("Número primo");
		} else {
			System.out.println("Número não primo");
		}

		entrada.close();
	}
}
