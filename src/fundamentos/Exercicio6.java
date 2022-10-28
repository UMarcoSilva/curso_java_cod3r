package fundamentos;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		//Criar um programa que resolve equações do segundo grau 
		//(ax2 + bx + c = 0) utilizando a fórmula de Bhaskara. 
		//Use como exemplo a = 1, b = 12 e c = -13. Encontre o delta
		// Δ = b2 – 4ac
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite valor de A: ");
		double a = entrada.nextDouble();
		System.out.println("Digite valor de B: ");
		double b = entrada.nextDouble();	
		System.out.println("Digite valor de C: ");
		double c = entrada.nextDouble();
		
		double delta = Math.pow(b, 2) - 4*a*c;
		
		System.out.printf("Valor Delta: %.2f \nValor A: %.2f \nValor B: %.2f \nValor C: %.2f", delta, a, b, c);
		
		entrada.close();
	}
}
