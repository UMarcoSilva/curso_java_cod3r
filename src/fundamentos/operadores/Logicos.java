package fundamentos.operadores;

public class Logicos {
	public static void main(String[] args) {
		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;
		
		System.out.println(condicao1 && !condicao2);
		System.out.println(condicao1 || condicao2);
		System.out.println(condicao1 ^ condicao2);
		System.out.println(!!condicao1);
		System.out.println(!condicao2);
		
		System.out.println("tabela verdade E(AND)");
		System.out.println(true && true);
		System.out.println(true && false);
		//System.out.println(false && true); dead line
		//System.out.println(false && false); dead line
		
		//Dead line é quando ja le falso e nota-se que nao adianta ler o true, linha "inutil"
		
		System.out.println("\nTabela verdade OU(OR)");
		//System.out.println(true || true); dead line
		//System.out.println(true || false); dead line
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println("\ntabela verdade E (XOR)");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		
		System.out.println("\ntabela verdade ! NOT");
		System.out.println(!true);
		System.out.println(!false);

		
		
	}
}
