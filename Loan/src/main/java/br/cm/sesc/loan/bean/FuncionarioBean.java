package br.cm.sesc.loan.bean;

import javax.faces.bean.ManagedBean;

import org.omnifaces.util.Messages;

@ManagedBean
public class FuncionarioBean {
	/*
	 * MENSAGEM DE ERRO public void salvar() { String texto = "Campos em branco";
	 * FacesMessage mensagem = new
	 * FacesMessage(FacesMessage.SEVERITY_ERROR,texto,texto);
	 * 
	 * FacesContext contexto = FacesContext.getCurrentInstance();
	 * contexto.addMessage(null, mensagem);
	 * 
	 * }
	 */
	public void salvar() {
		Messages.addGlobalError("Campos em Brancos");
	}
}
