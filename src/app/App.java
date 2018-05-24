package app;

import entidade.Aluno;
import entidade.Coordenador;
import entidade.Funcionario;
import entidade.Professor;
import entidade.Secretaria;

public class App {

	public static void main(String[] args) {
		
		// Instancia simples de um objeto
		Funcionario f = new Funcionario();
		
		// Polimorfismo
		Funcionario luis = new Professor();
		Funcionario anna = new Coordenador();
		Funcionario paula = new Secretaria();
		
		// Trabalhando com os objetos
		f.nome = "João";
		luis.nome = "Luis";
		anna.nome = "Anna";
		paula.nome = "Paula";
		
		
		/*
		anna.unidade = "Botafogo";
		anna.professores();
		*/
		
		Coordenador  ricardo = new Coordenador();
		ricardo.unidade = "Niterói";
		ricardo.professores();
		
		// Teste de instancia
		System.out.println(Funcionario.verifica(ricardo));
		System.out.println(Funcionario.verifica(anna));
		System.out.println(Funcionario.verifica(luis));
		System.out.println(Funcionario.verifica(paula));
		System.out.println(Funcionario.verifica(f));
		
		// Testando o obj de aluno
		Aluno rose = new Aluno();
		System.out.println(Funcionario.verifica(rose));
		
		// casting
		((Coordenador)anna).unidade = "Botafogo";
		System.out.println(((Coordenador)anna).professores());
		
		// Interface
		String senha = "123q.we.";
		
		if(((Professor)luis).logar(senha)){
			System.out.println("Login efetuado com sucesso!");
		} else {
			System.err.println("Falha ao efetuar o login.\nFavor verificar sua senha!");
		}
	}
}