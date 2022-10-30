package controle;

import java.util.Scanner;

public class exercicio7 {
	public static void main(String[] args) {
		/*Criar um programa que enquanto estiver
		 *recebendo números positivos, imprime
		 *no console a soma dos números inseridos,
		 *caso receba um número negativo,
		 *encerre o programa. Tente utilizar
		 *a estrutura do while.
		 */
		
		Scanner entrada = new Scanner(System.in);

		double numero = 10;
		double soma = 0;
		
		while (numero > -1) {
			System.out.println("Digite um número positivo para soma,"
					+ " um negativo para encerrar o programa");
			numero = entrada.nextDouble();
			if(numero >= 0) {
				soma += numero;
			} else {
				break;
			}
		}
		
		System.out.println(soma);
		entrada.close();
	}
}
