package controle;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		//Criar um programa que receba um número 
		//e verifique se ele está entre 0 e 10 e é par;
		
		Scanner entrada = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite o número: ");
		numero = entrada.nextInt();
		
		if(numero % 2 == 1) {
			System.out.println("Número ímpar");
		} else {
			System.out.println("Número par");
		}
		
		for (int i = 0; i <= 10; i++) {
			if(numero == i) {
				System.out.println("Número está entre 0 e 10");
			}else {
				System.out.println("Número não está entre 0 e 10");
				break;
			}
			
		}
		
		
		entrada.close();
	}
}
