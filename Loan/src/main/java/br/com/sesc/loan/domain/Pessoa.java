package br.com.sesc.loan.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@SuppressWarnings("serial")
@Entity
public class Pessoa extends GenericDomain {
	
	@Column(length = 14, nullable = false)
	private String cpf;
	
	@Column(nullable = false)
	private Long cartao;
	
	@Column(length = 50, nullable = false)
	private String nome;
	
	@Column(length = 14, nullable = false)
	private String celular;
	
	@Column(length = 100, nullable = false)
	private String email;
	

}
