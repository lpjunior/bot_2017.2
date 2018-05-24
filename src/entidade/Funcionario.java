package entidade;

public class Funcionario {

	public String nome;
	
	public static String verifica(Object f) {
		if(f instanceof Professor)
			return "É um objeto de Professor";
		else if(f instanceof Coordenador)
			return "É um objeto de Coordenador";
		else if(f instanceof Secretaria)
			return "É um objeto de Secretaria";
		else if(f instanceof Funcionario)
			return "É um objeto de generico de Funcionário";
		else
			return "Não é uma instancia dos tipos de Funcionário";
	}
}
