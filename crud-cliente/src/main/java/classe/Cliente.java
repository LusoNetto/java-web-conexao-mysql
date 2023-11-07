package classe;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Cliente {
	
	public String codigo;
	public String nome;
	public String genero;
	public String dataNascimento;
	public String cpf;
	public String telefone;
	public String email;
	public String senha;
	public String enderecoResidencial;
	
	public void salvar() throws Exception{
		// Referenciando nossa classe de conexão
		Class.forName("com.mysql.jdbc.Driver"); 
		// Estou criando minha conexao com o banco de dados passando o nome do banco, usuario e senha
		Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/crud-cliente","root","123Fatec");
		// String com o nosso comando sql para inserir no banco de dados
		String sql = "insert into clientes(codigo, nome, genero, dataNascimento, cpf, telefone, email, senha, enderecoResidencial) values(?,?,?,?,?,?,?,?,?)";
		// Sql preparado para conversar com o banco
		PreparedStatement sqlPreparado=conexao.prepareStatement(sql);
		// Setando os valores das interrogações
		sqlPreparado.setString(1,codigo);
		sqlPreparado.setString(2,nome);
		sqlPreparado.setString(3,genero);
		sqlPreparado.setString(4,dataNascimento);
		sqlPreparado.setString(5,cpf);
		sqlPreparado.setString(6,telefone);
		sqlPreparado.setString(7,email);
		sqlPreparado.setString(8,senha);
		sqlPreparado.setString(9,enderecoResidencial);
		// Executando o sql (Salvando o cliente no banco)
		sqlPreparado.execute();
		// fechando o meu sqlPreparado
		sqlPreparado.close();
		// fechando minha conexao com o banco
		conexao.close();
	}

}
