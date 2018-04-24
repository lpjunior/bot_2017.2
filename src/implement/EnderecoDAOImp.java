package implement;

import java.sql.SQLException;

import entity.Endereco;
import persist.EnderecoDAO;

public class EnderecoDAOImp {

	private EnderecoDAO dao;
	
	public EnderecoDAOImp() {
		dao = new EnderecoDAO();
	}
	
	public boolean gravar(Endereco e) {
		try {
			dao.save(e);
			return true;
		} catch (SQLException ex) {
			ex.printStackTrace();
			System.out.println(ex.getMessage());
		}
		return false;
	}
}
