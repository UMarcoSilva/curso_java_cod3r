package fundamentos;

public class DesafioAritmeticos {
	public static void main(String[] args) {
		
		/*int a = 3 * 4 - 10;
		int b = (int) Math.pow(a, 3);
		int c = (int) Math.pow(a, 3);
		
		System.out.println(b);
		System.out.println(c); */
		
		int var1 = (int) Math.pow((6 * (3+2)), 2) / (3*2);
		System.out.println(var1); 
		
		int var2 = (int) Math.pow(((1-5) * (2-7)) / 2,2);
		System.out.println(var2);
		
		int resultado = (int) ((int) Math.pow(var1 - var2, 3) / Math.pow(10, 3));
		
		System.out.println(resultado);
		
		
	}
}
