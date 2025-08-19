package atividades;

import atividades.Aluno_Estudo;
import atividades.AlunoImigrante;

public class CriaçãoDeAluno {
	public static void main(String[] args) {
		Aluno_Estudo enzo = new Aluno_Estudo("Enzo", 19, "Sistemas de Informação");
		enzo.getAluno();
		System.out.println("\nEnzo irá terminar o curso com " + enzo.Idade_de_Conclusão() + " anos.");
		AlunoImigrante marcos = new AlunoImigrante("Marcos", 20, "Moda", "Goianira");
	}
}
