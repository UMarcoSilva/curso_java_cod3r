package fundamentos;

import javax.swing.JOptionPane;

public class DesafioCalculadora {
	public static void main(String[] args) {
		// Ler numero 1
		// Ler numero 2
		// Qual operação: +, -, *, /, %.
		
		String numero1 = JOptionPane.showInputDialog("Digite o primeiro número: ");
		String numero2 = JOptionPane.showInputDialog("Digite o segundo número: ");
		double valor1 = Double.parseDouble(numero1);
		double valor2 = Double.parseDouble(numero2);
				
		String operacao = JOptionPane.showInputDialog("Escolha a operação: +, -, *, /, %.");
		
		//Lógica
		double resultado = 0;
		resultado = "+".equals(operacao) ? valor1 + valor2 : resultado;
		resultado = "-".equals(operacao) ? valor1 - valor2 : resultado;
		resultado = "*".equals(operacao) ? valor1 * valor2 : resultado;
		resultado = "/".equals(operacao) ? valor1 / valor2 : resultado;
		resultado = "%".equals(operacao) ? valor1 % valor2 : resultado;
		
		System.out.printf("%.2f %.2s %.2f = %.2f", valor1, operacao, valor2, resultado);
		
		
		
		
		
	}
}
