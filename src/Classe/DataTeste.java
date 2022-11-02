package Classe;

public class DataTeste {
	public static void main(String[] args) {
		
		Data d1 = new Data();
		d1.dia = 05;
		d1.mes = 05;
		d1.ano = 2003;
		
		Data d2 = new Data();
		d2.dia = 15;
		d2.mes = 04;
		d2.ano = 2003;
		
		System.out.printf("Data 1: %d/%d/%d", d1.dia, d1.mes, d1.ano );
		System.out.printf("\nData 2: %d/%d/%d", d2.dia, d2.mes, d2.ano );
		
	}
}
