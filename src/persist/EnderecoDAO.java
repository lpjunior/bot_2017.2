package persist;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import entity.Endereco;

// C.R.U.D - Endere�o
public class EnderecoDAO extends DAO {

	private Connection conn;
	
	public EnderecoDAO() {
		try {
			conn = abrirConexao();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Erro ao abrir a conexao: " + e.getMessage());
		}
	}

	// Create
	// M�todo respons�vel por salvar(gravar) o endere�o
	public void save(Endereco e) throws SQLException {
		// ele prepara contexto de instru��o SQL para ser enviado para o SGBD
		PreparedStatement stmt = null;
		
		try {
			stmt = conn.prepareStatement("insert into endereco values (null, ?, ?, ?, ?, ?)");
			
			stmt.setString(1, e.getLogradouro());
			stmt.setString(2, e.getBairro());
			stmt.setString(3, e.getCidade());
			stmt.setString(4, e.getCep());
			stmt.setInt(5, e.getPessoa().getId());
			
			// retorna "0" caso ocorra uma falha
			int flag = stmt.executeUpdate();
			
			if(flag == 0)
				throw new SQLException("Erro ao gravar no banco");
		} finally {
			if(stmt != null)
				stmt.close();
			
			if(conn != null)
				conn.close();
		}
	}
}
