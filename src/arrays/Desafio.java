package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Desafio {
	public static void main(String[] args) {	
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite quantas notas deseja inserir: ");
		int qtdNotas = entrada.nextInt();
		
		double[] notas = new double[qtdNotas];
		
		for (int i = 0; i < notas.length; i++) {	
			System.out.println("Digite a " + (i+1) + " nota: ");
			notas[i] = entrada.nextDouble();
		}
		
		double total = 0;
		for(double nota: notas) {
			total += nota;
		}
		
		double mediaNotas = total / notas.length;
		System.out.println("Média notas: " + mediaNotas);
		System.out.println(Arrays.toString(notas));
		
		entrada.close();
	}
}
