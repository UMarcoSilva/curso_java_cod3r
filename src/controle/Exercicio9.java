package controle;

import java.util.Scanner;

public class Exercicio9 {
	public static void main(String[] args) {
		
		//Crie um programa que recebe 10 valores
		//e ao final imprima o maior número.
		
		Scanner entrada = new Scanner(System.in);
		
		int valor;
		int maiorValor = 0;

		for (int i = 1; i <= 10; i++) {
			System.out.println("Digite o " + i + "° valor: ");
			valor = entrada.nextInt();

			if(valor > maiorValor) {
				maiorValor = valor;
			}
		}
		System.out.println(maiorValor +" é o maior valor");
		entrada.close();
	}
}
