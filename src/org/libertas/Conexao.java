package org.libertas;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
	private Connection conexao;
	
	public Conexao() {
		try {
			Class.forName("org.mariadb.jdbc.Driver").newInstance();
			String url = "jdbc:mariadb://localhost:3366/libertas";
			conexao = DriverManager.getConnection(url, "ely", "123");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void desconecta() {
		try {
			conexao.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	public Connection getConexao() {
		return conexao;
	}

	public void setConexao(Connection conexao) {
		this.conexao = conexao;
	}
	
}
