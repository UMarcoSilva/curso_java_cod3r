package classe;

public class DataTeste {
	public static void main(String[] args) {
		
		Data d1 = new Data();
		d1.imprimirDataFormatada();
		d1.ano = 2021;
		
		Data d2 = new Data(15, 04, 2003);
		
		String dataFormatada1 = d1.obterDataFormatada();
		
		System.out.println(dataFormatada1);
		System.out.println(d2.obterDataFormatada());	
		
		d1.imprimirDataFormatada();
		d2.imprimirDataFormatada();
	}
}
