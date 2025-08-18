package atividades;

import java.util.Scanner;

public class DesafioConversão {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a sua primeira nota: ");
		String nota1_string = scan.nextLine();
		
		System.out.println("Digite a sua segunda nota: ");
		String nota2_string = scan.nextLine();
		
		System.out.println("Digite a sua terceira: ");
		String nota3_string = scan.nextLine();
		
		double nota1_double = Double.parseDouble(nota1_string.replace(",", "."));
		double nota2_double = Double.parseDouble(nota2_string.replace(",", "."));
		double nota3_double = Double.parseDouble(nota3_string.replace(",", "."));
		
		double valorMedia = ((nota1_double + nota2_double + nota3_double)/3);
		
		System.out.printf("O valor de sua média é %.2f \n", valorMedia );
		
		if (valorMedia >= 6) {
			System.out.println("Parabéns! Você passou de ano!");
		} else {
			System.out.println("Infelizmente você reprovou!");
		}
		
		
		
		scan.close();
	}
}
