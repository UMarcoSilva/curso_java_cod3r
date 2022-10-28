package fundamentos;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		// Criar um programa que leia o valor da base e 
		//da altura de um triângulo e calcule a área.
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite o valor da base do triângulo: ");
		double base = entrada.nextDouble();
		
		System.out.println("Digite o valor da altura do triângulo: ");
		double altura = entrada.nextDouble();
		
		double area = (base * altura) / 2;
		
		System.out.printf("Dados triângulo -  Base: %.2f / Altura: %.2f / Área: %.2f",
				base, altura, area);
		
		entrada.close();
	}
}
