package entidade;

import entidade.interfaces.ILogin;

public class Aluno implements ILogin {

	private String senha = "1qazxsw2";
	
	@Override
	public boolean logar(String password) {

		if(senha.equals(password))
			return true;
		return false;
	}

}
