package atividades.DesafiosPOO;

public class Data {
	
	private int dia;
	private int mes;
	private int ano;
	
	
	public Data(int dia, int mes, int ano) {
		this.dia= dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	
	
	public void ImprimirData() {
		System.out.printf("A data guardada neste objeto é: %s \n", formatarData());
	}
	
	private String formatarData() {
		return String.format("%d/%d/%d", dia, mes, ano);
	}
}
