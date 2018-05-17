package entidade;

public class Aluno {

	private String nome;
	private double nota01;
	private double nota02;
	
	public Aluno() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getNota01() {
		return nota01;
	}

	public void setNota01(double nota01) {
		this.nota01 = nota01;
	}

	public double getNota02() {
		return nota02;
	}

	public void setNota02(double nota02) {
		this.nota02 = nota02;
	}
	
	// vai retornar a situação do aluno(aprovado, recuperação ou reprovado) a partir da média dele
	public String situacao() {
		double media = (nota01 + nota02) / 2;
		if(media >= 6)
			return Situacao.APROVADO.getMessage();
		else if((media > 4) && (media < 6))
			return Situacao.RECUPERACAO.getMessage();
		else
			return Situacao.REPROVADO.getMessage();
	}
	
	public enum exemplo {
		
	}
	
	private enum exemplo2 {
		
	}
}
