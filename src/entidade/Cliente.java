package entidade;

public class Cliente extends Pessoa {

	private String cpf;
	
	public Cliente() {
		// chamada do construtor sem argumentos da classe pai (superclass)
		super();
	}
	
	public Cliente(String nome, String email, String cpf) {
		// chamada do construtor com argumentos da classe pai (superclass)
		super(nome, email);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "Dados do cliente:\nCPF = " + cpf + "\nNome = " + nome + "\nEmail = " + email;
	}
	
	
}
