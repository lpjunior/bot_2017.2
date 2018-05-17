
package entidade;

public enum Situacao {

	APROVADO("O aluno está de férias"), 
	REPROVADO("Nos vemos na próxima turma"), 
	RECUPERACAO("Nos vemos na terça!");

	private String msg;
	
	Situacao(String msg) {
		this.msg = msg;
	}

	public String getMessage() {
		return msg;
	}
}
