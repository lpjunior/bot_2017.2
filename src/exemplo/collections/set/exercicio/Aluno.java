package exemplo.collections.set.exercicio;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Aluno {

	Set<Disciplina> disciplinas;

	public Set<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(Set<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public static void main(String[] args) {
		Set<Disciplina> materiasLuiz = new HashSet<>();
		// Set<Disciplina> materias2 = new TreeSet<>();
		// Set<Disciplina> materias3 = new LinkedHashSet<>();

		Set<Disciplina> materiasRose = new HashSet<>();
		
		Disciplina disciplina1 = new Disciplina("Java");
		Disciplina disciplina2 = new Disciplina("Banco de Dados");
		Disciplina disciplina3 = new Disciplina("PHP");
		Disciplina disciplina4 = new Disciplina("Cisco CCNA");
		materiasLuiz.addAll(Arrays.asList(disciplina1, disciplina2, disciplina3, disciplina4));
		
		Disciplina disciplina5 = new Disciplina("PHP");
		Disciplina disciplina6 = new Disciplina("Cisco CCNA");
		materiasRose.addAll(Arrays.asList(disciplina3, disciplina4));

		// System.out.println(materiasLuiz);
		
		Aluno luiz = new Aluno();
		luiz.setDisciplinas(materiasLuiz);
		
		Aluno rose = new Aluno();
		rose.setDisciplinas(materiasRose);
		
		if(luiz.disciplinas.containsAll(rose.disciplinas))
			System.out.println("Ambos tem matérias incomum.");
		else
			System.out.println("Ambos não tem matérias incomum.");
	}
}
