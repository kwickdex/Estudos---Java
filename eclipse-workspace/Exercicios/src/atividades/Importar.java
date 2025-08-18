package atividades;

import java.util.Date;
import java.util.Scanner;

public class Importar {
	public static void main(String[] args) {
		Date d = new Date();
		
		System.out.println(d);
		
		Scanner x = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = (x.nextLine()).toUpperCase();
		System.out.println("Digite sua idade: ");
		int idade = x.nextInt();
		System.out.printf("Seu nome é %s e sua idade é %d!!", nome, idade );
		
		x.close();
	}
}
