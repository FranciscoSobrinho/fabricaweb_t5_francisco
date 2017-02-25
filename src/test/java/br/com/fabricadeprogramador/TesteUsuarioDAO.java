package br.com.fabricadeprogramador;

import br.com.fabricadeprogramador.persistencia.entidade.Usuario;
import br.com.fabricadeprogramador.persistencia.jdbc.UsuarioDAO;

public class TesteUsuarioDAO {

	public static void main(String[] args) {
				
		testExcluir();

	}
	
	public static void testExcluir(){
		Usuario usu = new Usuario();
		usu.setId(3);
		//usu.setNome("Fernando da Silva");
		//usu.setLogin("Nanddo");
		//usu.setSenha("7890");
		
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.excluir(usu);
		
		System.out.println("EXCLUIDO COM SUCESSO");
	}
	
	public static void testAlterar(){
		Usuario usu = new Usuario();
		usu.setId(3);
		usu.setNome("Fernando da Silva");
		usu.setLogin("Nanddo");
		usu.setSenha("7890");
		
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.alterar(usu);
		
		System.out.println("ALTERADO COM SUCESSO");
	}
	
	public static void testCadastrar(){
		Usuario usu = new Usuario();		
		usu.setNome("Fernando");
		usu.setLogin("Fer");
		usu.setSenha("789");
			
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.cadastrar(usu);
		
		System.out.println("CADASTRADO COM SUCESSO");  
	}

}
