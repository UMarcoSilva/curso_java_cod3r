package fundamentos;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		//Criar um programa que leia um valor e 
		//apresente os resultados ao quadrado e ao cubo do valor.
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite um valor: ");
		double valor = entrada.nextDouble();
		
		double quadrado = Math.pow(valor, 2);
		double cubo = Math.pow(valor,3);
		
		System.out.printf("Valor: %.2f valor ao quadrado: %.2f valor ao cubo: %.2f", valor, quadrado, cubo);
		
		entrada.close();
	}
}
