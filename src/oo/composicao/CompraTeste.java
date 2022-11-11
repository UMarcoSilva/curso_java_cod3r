package oo.composicao;

public class CompraTeste {
	public static void main(String[] args) {
		
		Compra compra1 = new Compra();
		compra1.cliente = "João Pedro";
		compra1.adicionarItem("caneta", 20, 7.45);
		compra1.adicionarItem(new Item("borracha", 12, 3.85));
		compra1.adicionarItem(new Item("caderno", 3, 18.99));
		
		System.out.println(compra1.itens.size());
		System.out.println(compra1.obterValorTotal());
		
		double total = compra1.itens.get(0).compra.itens.get(1).compra.obterValorTotal();
		System.out.println("O total é R$" + total);
	}
}
