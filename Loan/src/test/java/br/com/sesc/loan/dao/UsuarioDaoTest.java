package br.com.sesc.loan.dao;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.sesc.loan.domain.Funcionario;
import br.com.sesc.loan.domain.Usuario;

public class UsuarioDaoTest {

	@Test
	@Ignore
	public void salvar() {

		FuncionarioDao funcionarioDao = new FuncionarioDao();
		Funcionario funcionario = funcionarioDao.buscar(3L);

		Usuario usuario = new Usuario();
		usuario.setSenha("654321");
		usuario.setAtivo(false);
		usuario.setTipo('U');
		usuario.setFuncionario(funcionario);

		UsuarioDao usuarioDao = new UsuarioDao();
		usuarioDao.salvar(usuario);

	}

	@Test
	@Ignore
	public void Listar() {
		UsuarioDao usuarioDao = new UsuarioDao();
		List<Usuario> resultado = usuarioDao.listar();

		System.out.println("Total de resultado encontrado: " + resultado.size());
		for (Usuario usuario : resultado) {
			System.out.println("Codigo do Usuario: " + usuario.getCodigo());
			System.out.println("Senha do Usuario: " + usuario.getSenha());
			System.out.println("Tipo do Usuario: " + usuario.getTipo());
			System.out.println("Usuario está ativo: " + usuario.getAtivo());
			System.out.println("----------------USUARIO-------------------- ");
			System.out.println(" : " + usuario.getFuncionario().getCodigo());
			System.out.println(" : " + usuario.getFuncionario().getMatricula());
			System.out.println(" : " + usuario.getFuncionario().getEmail());

		}
	}

	@Test
	@Ignore
	public void buscar() {

		Long codigo = 2L;

		UsuarioDao usuarioDao = new UsuarioDao();
		Usuario usuario = usuarioDao.buscar(codigo);

		System.out.println("Codigo do Usuario: " + usuario.getCodigo());
		System.out.println("Senha do Usuario: " + usuario.getSenha());
		System.out.println("Tipo do Usuario: " + usuario.getTipo());
		System.out.println("Usuario está ativo: " + usuario.getAtivo());
		System.out.println("----------------USUARIO-------------------- ");
		System.out.println(" : " + usuario.getFuncionario().getCodigo());
		System.out.println(" : " + usuario.getFuncionario().getMatricula());
		System.out.println(" : " + usuario.getFuncionario().getEmail());

	}
	@Test
	public void excluir() {
		
		Long codigo = 1L;

		UsuarioDao usuarioDao = new UsuarioDao();
		Usuario usuario = usuarioDao.buscar(codigo);
		
		usuarioDao.excluir(usuario);

		System.out.println("------USUARIO REMOVIDA----------------- ");
		System.out.println("Codigo do Usuario: " + usuario.getCodigo());
		System.out.println("Tipo do Usuario: " + usuario.getTipo());
		System.out.println("Usuario está ativo: " + usuario.getAtivo());
		System.out.println("------FUNCIONARIO--------------------- ");
		System.out.println(" : " + usuario.getFuncionario().getCodigo());
		System.out.println(" : " + usuario.getFuncionario().getMatricula());	
		
	}
	
	@Test
	public void editar() {
		//SELECIONANDO CODIGOS
		Long codigoUsuario = 2L;
		Long codigoFuncionario = 1L;
		
		//FUNCIONARIO
		FuncionarioDao funcionarioDao = new FuncionarioDao();
		Funcionario funcionario = funcionarioDao.buscar(codigoFuncionario);
		
		System.out.println("------FUNCIONARIO--------------------- ");
		System.out.println(" : " + funcionario.getCodigo());
		System.out.println(" : " + funcionario.getMatricula());
			
		UsuarioDao usuarioDao = new UsuarioDao();
		Usuario usuario = usuarioDao.buscar(codigoUsuario);
		
		System.out.println("------USUARIO A SER EDITADO----------------- ");
		System.out.println("Codigo do Usuario: " + usuario.getCodigo());
		System.out.println("Tipo do Usuario: " + usuario.getTipo());
		System.out.println("Usuario está ativo: " + usuario.getAtivo());
		//EITANDO OS DADOS
		usuario.setAtivo(true);
		usuario.setSenha("121212");
		usuario.setFuncionario(funcionario);
		
		usuarioDao.editar(usuario);
		System.out.println("------USUARIO A SER EDITADO----------------- ");
		System.out.println("Codigo do Usuario: " + usuario.getCodigo());
		System.out.println("Tipo do Usuario: " + usuario.getTipo());
		System.out.println("Usuario está ativo: " + usuario.getAtivo());
		
		
		
	}
}
