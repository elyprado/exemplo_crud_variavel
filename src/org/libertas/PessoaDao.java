package org.libertas;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;

public class PessoaDao {
	
	public void inserir(Pessoa p) {
		Conexao con = new Conexao();
		
		try {
			
			String sql = "INSERT INTO pessoa "
					+ "(nome, altura, peso) "
					+ "VALUES (?, ?, ?)";
			PreparedStatement prep = con.getConexao().prepareStatement(sql);
			prep.setString(1, p.getNome());
			prep.setDouble(2, p.getAltura());
			prep.setDouble(3, p.getPeso());
			prep.execute();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		con.desconecta();
	}
	public LinkedList<Pessoa> listar() {
		Conexao con = new Conexao();
		LinkedList<Pessoa> lista = new LinkedList<Pessoa>();
		try {
			String sql = "SELECT * FROM pessoa";
			Statement instrucao = con.getConexao().createStatement();
			ResultSet res = instrucao.executeQuery(sql);
			//percorrer os valores do banco de dados
			while (res.next()) {
				Pessoa p = new Pessoa();
				p.setNome(res.getString("nome"));
				p.setAltura(res.getDouble("altura"));
				p.setPeso(res.getDouble("peso"));
				lista.add(p);
			}
			res.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		con.desconecta();
		
		return lista;
	}
	
}
