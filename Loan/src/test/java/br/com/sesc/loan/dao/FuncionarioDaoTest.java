package br.com.sesc.loan.dao;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.sesc.loan.domain.Funcionario;

public class FuncionarioDaoTest {

	@Test
	@Ignore
	public void salvar() {

		Funcionario funcionario = new Funcionario();

		funcionario.setEmail("sebasthian@gmail.com");
		funcionario.setMatricula("10016");

		FuncionarioDao funcionarioDao = new FuncionarioDao();
		funcionarioDao.salvar(funcionario);
	}

	@Test
	@Ignore
	public void listar() {
		FuncionarioDao funcionarioDao = new FuncionarioDao();
		List<Funcionario> resultado = funcionarioDao.listar();

		System.out.println("Total de resultado encontrado: " + resultado.size());
		for (Funcionario funcionario : resultado) {
			System.out.println(
					funcionario.getCodigo() + " - " + funcionario.getMatricula() + " - " + funcionario.getEmail());
		}
	}

	@Test
	@Ignore
	public void buscar() {
		Long codigo = 3L;

		FuncionarioDao funcionarioDao = new FuncionarioDao();
		Funcionario funcionario = funcionarioDao.buscar(codigo);

		
		System.out.println(funcionario.getCodigo() + " - " + funcionario.getMatricula() + " - " + funcionario.getEmail());

	}

	@Test
	@Ignore
	public void excluir() {
		Long codigo = 2L;
		
		FuncionarioDao funcionarioDao = new FuncionarioDao();
		Funcionario funcionario = funcionarioDao.buscar(codigo);
		funcionarioDao.excluir(funcionario);
		
	}
	
	@Test
	@Ignore
	public void editar() {
		//pesquisar
		Long codigo = 1L;
		FuncionarioDao funcionarioDao = new FuncionarioDao();
		Funcionario funcionario = funcionarioDao.buscar(codigo);
		
		funcionario.setEmail("matheus@gmail.com");
		funcionarioDao.editar(funcionario);
		
		
		
	}
}
