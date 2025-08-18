package atividades;

import java.util.Scanner;

public class Aluno_Estudo {
	private String name;
	private int idade;
	private String curso;
	
	int counterSet = 0;
	
	public Aluno_Estudo(String name, int idade, String curso) {
		this.name = name;
		this.idade = idade;
		this.curso = curso;
		
		 /**
	     * Construtor da classe Aluno_Estudo.
	     *
	     * @param name Nome do Aluno
	     * @param idade Idade do aluno
	     * @param curso Curso em que o aluno está matriculado
	     */
	}
	
	public void getAluno() {
		System.out.printf("O nome do aluno: %s \nSua idade é: %d \nSeu curso é: %s", this.name, this.idade, this.curso);
		System.out.printf("O contador de vezes que foi modificado essa varíavel foi %d", counterSet);
	}
	
	public void setAluno() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o nome do Aluno:");
		this.name = scan.nextLine();
		System.out.println("Digite a Idade:");
		this.idade = scan.nextByte();
		scan.nextLine();
		System.out.println("Digite o nome do curso:");
		this.curso = scan.nextLine();
		counterSet++;
	}
	
	public int Idade_de_Conclusão() {
		int idadeDeConclusão = this.idade + 4;
		return idadeDeConclusão;
	}
}
