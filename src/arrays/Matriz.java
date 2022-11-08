package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Quantos aluno? ");
		int qtdAlunos = entrada.nextInt();
		
		System.out.println("Quantas notas? ");
		int qtdNotas = entrada.nextInt();
		
		double[][] notasTurma = new double [qtdAlunos][qtdNotas];
		
		double total = 0;
		for (int i = 0; i < notasTurma.length; i++) {
			for (int j = 0; j < notasTurma[i].length; j++) {
				
				System.out.printf("informe a nota %d do aluno %d: ", (i+1), (j+1));
				notasTurma[i][j] = entrada.nextDouble();
				total += notasTurma[i][j];
				
			}
		}
		

		double media = total / (qtdAlunos * qtdNotas);
		System.out.println("Média da turma é " + media);
		
		
		for(double[] notasDoAluno: notasTurma) {
			System.out.println(Arrays.toString(notasDoAluno));		
		}
		
		entrada.close();
	}
}
