package br.com.sesc.main;

import org.hibernate.Session;

import br.com.sesc.loan.util.HibernateUtil;

public class HibernateUtilTest {
	
	public static void main(String[] args) {
		//Capturar Fabrica de sessoes
		Session sessao = HibernateUtil.getFabricaSessao().openSession();
		sessao.close();
		
	}

}
