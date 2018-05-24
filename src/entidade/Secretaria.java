package entidade;

import entidade.interfaces.ILogin;

public class Secretaria extends Funcionario implements ILogin {

	private String senha = "1q2w3e4r";
	
	@Override
	public boolean logar(String password) {
		if(senha.equals(password))
			return true;
		return false;
	}

}
