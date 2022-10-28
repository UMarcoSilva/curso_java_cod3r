package fundamentos;

public class Temperatura {
	
	public static void main(String[] args) {
		//(°f - 32) * 5/9 = °C
		//
		final int ajuste = 32;
		final double multiplicador = 5.0/9.0;
		double f = 60;
		
		double c = (f - ajuste) * multiplicador;
		
		System.out.println(c);
		
	}
}
