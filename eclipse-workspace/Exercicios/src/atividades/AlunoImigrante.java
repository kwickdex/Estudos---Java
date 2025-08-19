package atividades;

import atividades.Aluno_Estudo;


public class AlunoImigrante extends Aluno_Estudo {
	
	String cidade;
	
	public AlunoImigrante(String name, int idade, String curso,String cidade) {
		super(name, idade, curso);
		this.cidade = cidade;
		// TODO Auto-generated constructor stub
	}

}
