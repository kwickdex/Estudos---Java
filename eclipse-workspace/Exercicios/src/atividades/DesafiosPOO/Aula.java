package atividades.DesafiosPOO;

import atividades.DesafiosPOO.*;

public class Aula {
	public static void main(String[] args) {
		Data novaData = new Data(19, 8, 2025);
		novaData.ImprimirData();
		
		Mercado cachorro_quente = new Mercado("Cachorro Quente", 10.50f);
		Mercado pao_de_queijo = new Mercado("Pão de Queijo", 3.5f);
		
		Mercado.porcentagem = 60;
		
		cachorro_quente.getValorComDesconto();
		pao_de_queijo.getValorComDesconto();
		
	}
}
