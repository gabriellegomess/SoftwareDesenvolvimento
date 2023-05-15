package principal;

//importar tudo java.sql.*; (não vai precisar ficar digitando import um por um
/*import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement; */

import java.sql.*;

public class Programa {
	
	public static void main(String[] args) throws SQLException {
			
		String url = "jdbc:mysql://localhost:3306/exemplojdbc";
		String usuario = "root";
		String senha = "positivo";
			
		//1. Abrir a conexão com o banco de dados
		
		Connection con = DriverManager.getConnection(url, usuario, senha);
		
		//2. Criar o comando e executar a consulta
		
		Statement comando = con.createStatement();
		ResultSet resultado = comando.executeQuery("select * from pessoas");//pegando os dados do banco
		
		//3. Mostrando os dados na tela/Utilizar os dados
		
		while(resultado.next()) {
			int id = resultado.getInt("idPessoa");
			String nome = resultado.getString("nome");
			String cpf = resultado.getString("cpf");
			Double peso = resultado.getDouble("peso");
			
			System.out.println("-------------------");
			System.out.println("ID: "+id);
			System.out.println("Nome: "+nome);
			System.out.println("CPF: "+cpf);
			System.out.println("Peso: "+peso);
		
		}
		
		comando.close();
		con.close();
	}
}
