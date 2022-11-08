package classe.Desafio;

public class Jantar {
	public static void main(String[] args) {

		Pessoa p1 = new Pessoa("Marco", 79);
		Pessoa p2 = new Pessoa("Juliane", 56);

		Comida c1 = new Comida("feijão", 0.250);
		Comida c2 = new Comida("sopa", 0.300);

		p1.comer(c1);
		p2.comer(c2);

		System.out.println(p1.apresentar());
		System.out.println(p2.apresentar());

	}
}
