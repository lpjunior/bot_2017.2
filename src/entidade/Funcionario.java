package entidade;

public class Funcionario {

	public String nome;
	
	public static String verifica(Object f) {
		if(f instanceof Professor)
			return "� um objeto de Professor";
		else if(f instanceof Coordenador)
			return "� um objeto de Coordenador";
		else if(f instanceof Secretaria)
			return "� um objeto de Secretaria";
		else if(f instanceof Funcionario)
			return "� um objeto de generico de Funcion�rio";
		else
			return "N�o � uma instancia dos tipos de Funcion�rio";
	}
}
