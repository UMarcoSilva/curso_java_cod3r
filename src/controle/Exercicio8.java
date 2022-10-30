package controle;

import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		// Criar um programa que receba uma palavra
		// e imprime no console letra por letra.

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite uma palavra: ");
		String texto = entrada.nextLine();

		char letras[] = texto.toCharArray();

		for (int i = 0; i < texto.length(); i++) {
			System.out.println(letras[i]);
		}
		entrada.close();
	}
}
