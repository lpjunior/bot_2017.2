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
		prof.setTurno("Manh�|Noite");
		
		// Definindo a especializa��o no obj da classe Especializa��o
		esp.setTitulo("Mestrando Eng. Computa��o");
		
		// associando a classe professor
		prof.setTitulo(esp);
		
		System.out.println(prof);
	}
}
