package fundamentos.operadores;

public class Unarios {
	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		a++;
		a--;
		
		++b;
		--b;
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("");
		System.out.println(++a == b--); // o b-- esta vindo depois da comparacao, quando fica depois da letra 
										// significa que "esta com menos pressa"
		System.out.println(b);
		System.out.println(a);
		
		
	}
}
