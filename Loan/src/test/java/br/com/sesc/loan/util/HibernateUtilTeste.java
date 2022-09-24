package br.com.sesc.loan.util;

import org.hibernate.Session;
import org.junit.Test;

public class HibernateUtilTeste {
	
	@Test
	public void conectar() {
		Session sessao = HibernateUtil.getFabricaSessao().openSession();
		sessao.close();
		HibernateUtil.getFabricaSessao().close();
	}

}
