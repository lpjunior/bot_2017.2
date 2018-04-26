package persist;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import entity.Especializacao;

public class EspecializacaoDAO extends DAO {

	private Connection conn;
	
	public EspecializacaoDAO() {
		try {
			conn = abrirConexao();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void gravar(Especializacao e) throws SQLException {
		PreparedStatement stmt = null;
		
		try {
			stmt = conn.prepareStatement("insert into especializacao values (null, ?, ?)");
			stmt.setString(1, e.getTitulo());
			stmt.setInt(2, e.getProfessor().getId());
			
			int flag = stmt.executeUpdate();
			
			if(flag == 0)
				throw new SQLException("Erro ao gravar a especialização");
			
		} finally {
			if(stmt != null)
				stmt.close();
			if(conn != null)
				conn.close();
		}
	}
}
