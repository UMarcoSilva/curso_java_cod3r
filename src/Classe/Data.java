package classe;

public class Data {

	int dia;
	int mes;
	int ano;

	// variavel local deve ser instanciada
	
	Data() {
		// dia = 1;
		// mes = 1;
		// ano = 1970;
		//this(1, 1, 1970); // chamando outro construtor
		
		// objetos -> padrao null
		//int a;
		//a = 0;
		//System.out.println(a);
	}

	Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	String obterDataFormatada() {
		final String formato = "%d/%d/%d"; // variavel local, definir variavel dentro do metodo
		return String.format(formato, this.dia, mes, ano);
	}

	void imprimirDataFormatada() {
		System.out.println(this.obterDataFormatada());
	} // esse tipo de metodo nao funciona em desktop, web, celular e etc
		// melhor usar apenas o metodo de cima
}
