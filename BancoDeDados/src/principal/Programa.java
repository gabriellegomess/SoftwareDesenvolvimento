package principal;

//importar tudo java.sql.*; (não vai precisar ficar digitando import um por um
/*import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement; */

import java.sql.*;

public class Programa {
	
	//se qualquer função tem uma exceção ela deve ser chamada na hora de usar
	//mas caso vc n queira usar toda vez isso para não ficar feio usa o try catch
	public static void main(String[] args) {
		
		Pessoa salvar = new Pessoa("Mary", "4563456", 85);
		Pessoa atualizar = new Pessoa(6, "Janne", "87575", 57);
		
		SalvarPessoas(salvar);
		ListarPessoas();
		AltualizarPessoas(atualizar);
		DeletarPessoas(5);
		
}
	
	
//tratando os erros de exceções	(try catch)	
	
	
	public static void ListarPessoas() {
		
		try {
		
		//url de conexão
		String url = "jdbc:mysql://localhost:3306/exemplojdbc";
		//usuario do banco de dados
		String usuario = "root";
		//senha do banco de dados
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
		
		//tratando as exception
		} catch (Exception erro) {
			System.out.println("Algo deu errado!");
			System.out.println(erro);
		}
	} 
	
	
	public static void SalvarPessoas(Pessoa pessoa) {

		
		try {
		
		//url de conexão
		String url = "jdbc:mysql://localhost:3306/exemplojdbc";
		//usuario do banco de dados
		String usuario = "root";
		//senha do banco de dados
		String senha = "positivo";
		
		
		String sql = "INSERT INTO `pessoas`(`nome`,`cpf`,`peso`)VALUES(?,?,?)";
			
		
		//1. Abrir a conexão com o banco de dados
		
		Connection con = DriverManager.getConnection(url, usuario, senha);
		
		
		
		//2. Criar o comando e executar a consulta
		
		PreparedStatement comando = con.prepareStatement(sql);
		comando.setString(1, pessoa.getNome());
		comando.setString(2, pessoa.getCpf());
		comando.setDouble(3, pessoa.getPeso());
		
		comando.executeUpdate();		
		comando.close();
		con.close();
		
		
		System.out.println("Deu tudo certo!");
		
		
		//tratando as exception caso tenha
		} catch (Exception erro) {
			System.out.println("Algo deu errado!");
			System.out.println(erro);
		}
	} 
	
	
	public static void AltualizarPessoas(Pessoa pessoa) {
		
		try {
		
		//url de conexão
		String url = "jdbc:mysql://localhost:3306/exemplojdbc";
		//usuario do banco de dados
		String usuario = "root";
		//senha do banco de dados
		String senha = "positivo";
		
		
		String sql = "UPDATE pessoas SET `nome` = ?, `cpf` = ?, `peso` = ? WHERE `idPessoa` = ?;";
			
		
		//1. Abrir a conexão com o banco de dados
		
		Connection con = DriverManager.getConnection(url, usuario, senha);
		
		
		
		//2. Criar o comando e executar a consulta
		
		PreparedStatement comando = con.prepareStatement(sql);
		comando.setString(1, pessoa.getNome());
		comando.setString(2, pessoa.getCpf());
		comando.setDouble(3, pessoa.getPeso());
		
		comando.setInt(4, pessoa.getIdPessoa());
		
		comando.executeUpdate();		
		comando.close();
		con.close();
		
		
		System.out.println("Deu tudo certo!");
		
		
		//tratando as exception caso tenha
		} catch (Exception erro) {
			System.out.println("Algo deu errado!");
			System.out.println(erro);
		}
	}
	
	
	public static void DeletarPessoas(int idPessoa) {
		
		try {
		
		//url de conexão
		String url = "jdbc:mysql://localhost:3306/exemplojdbc";
		//usuario do banco de dados
		String usuario = "root";
		//senha do banco de dados
		String senha = "positivo";
		
		
		String sql = "DELETE FROM pessoas WHERE `idPessoa` = ?;";
			
		
		//1. Abrir a conexão com o banco de dados
		
		Connection con = DriverManager.getConnection(url, usuario, senha);
		
		
		
		//2. Criar o comando e executar a consulta
		
		PreparedStatement comando = con.prepareStatement(sql);
		
		comando.setInt(1, idPessoa);
		
		comando.executeUpdate();		
		comando.close();
		con.close();
		
		
		System.out.println("Deu tudo certo!");
		
		
		//tratando as exception caso tenha
		} catch (Exception erro) {
			System.out.println("Algo deu errado!");
			System.out.println(erro);
		}
		
		
		
	}
	
}