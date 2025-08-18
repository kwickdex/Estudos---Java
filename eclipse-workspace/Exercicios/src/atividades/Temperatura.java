package atividades;

public class Temperatura {
	public static void main(String[] args) {
		double fahr = 400;
		final double valorSubtrair = 32;
		final double divisao = 5.0/9.0;
		double celsius = (fahr - valorSubtrair) * divisao;
		
		System.out.println(fahr + " fahreinheits são equivalentes à " + celsius + " celsius");
		}
}
