package entidade;

import entidade.interfaces.ILogin;

public class Professor extends Funcionario implements ILogin {

	private String senha = "123qwe.";
	
	@Override
	public boolean logar(String password) {
		if(senha.equals(password))
			return true;
		return false;
	}

}
