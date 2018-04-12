package application;

import entity.Especializacao;
import entity.Professor;

public class TestaProfessor {
	public static void main(String[] args) {

		Professor prof = new Professor();
		Especializacao esp = new Especializacao();
		
		prof.setNome("Luis Paulo");
		prof.setEmail("lpjunior@gmail.com");
		prof.setMatricula("prf001");
		prof.setSalario(1000000.);
		prof.setTurno("Manhã|Noite");
		
		// Definindo a especialização no obj da classe Especialização
		esp.setTitulo("Mestrando Eng. Computação");
		
		// associando a classe professor
		prof.setTitulo(esp);
		
		System.out.println(prof);
	}
}
