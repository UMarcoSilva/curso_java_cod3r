package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
				
		System.out.println("Digite o primeiro salário R$: ");
		String valor1 = entrada.nextLine().replace(",", ".");
		
		System.out.println("Digite o segundo salário R$: ");
		String valor2 = entrada.nextLine().replace(",", ".");
		
		System.out.println("Digite o terceiro salário R$: ");
		String valor3 = entrada.nextLine().replace(",", ".");
		
		double salario1 = Double.parseDouble(valor1);
		double salario2 = Double.parseDouble(valor2);
		double salario3 = Double.parseDouble(valor3);
		
		
		double mediaSalario = (salario1 + salario2 + salario3) / 3;
		
		System.out.println("Média salários: " + mediaSalario);
		
		entrada.close();
	}

}
