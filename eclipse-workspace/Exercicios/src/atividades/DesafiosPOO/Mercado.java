package atividades.DesafiosPOO;

public class Mercado {
	
	String nome;
	float preco;
	
	public static float porcentagem;
	
	public Mercado(String nome, float preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	public void getMercado() {
		System.out.printf("Nome: %s -> Preço: %.2f \n", nome, preco);
	}
	
	public void getValorComDesconto() {
		System.out.printf("O valor com esse desconto é: %.2f \n", preco - (preco * (porcentagem/100))); 
	}
	
}
