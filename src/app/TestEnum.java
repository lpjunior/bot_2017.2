package app;

import entidade.Aluno;

public class TestEnum {
	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("José");
		aluno.setNota01(7.3);
		aluno.setNota02(9.0);
		
		System.out.println("Informes do aluno:\n"
						 + "Nome: " + aluno.getNome()
						 + "\nPrimeira nota: " + aluno.getNota01()
						 + "\nPrimeira nota: " + aluno.getNota02()
						 + "\nE sua situação é: " + aluno.situacao());
	}
}
