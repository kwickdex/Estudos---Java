package atividades.DesafiosPOO;

public class Mercado {
	
	String nome;
	float preco;
	
	public Mercado(String nome, float preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	public static float aumentoDesconto(float valorInteiro) {
		return (valorInteiro/100);
	}
	
	public void getMercado() {
		System.out.printf("Nome: %s -> Preço: %.2f \n", nome, preco);
	}
	
	public void getValorComDesconto(float porcentagemValor) {
		System.out.printf("O valor com esse desconto é: %.2f", preco * aumentoDesconto(porcentagemValor)); 
	}
	
}
