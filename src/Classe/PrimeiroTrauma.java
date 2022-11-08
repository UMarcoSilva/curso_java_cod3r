package classe;

public class PrimeiroTrauma {
	
	int a = 3; // não pode mexer aqui
	static int b = 4;
	
	public static void main(String[] args) {
		// pode mexer aqui
		PrimeiroTrauma p = new PrimeiroTrauma();
		System.out.println(p.a); // pode mexer aqui
		//pode mexer aqui

		System.out.println(b);
	}
}
