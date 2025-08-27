package com.vini.Vini.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity (name = "PESSOA")
@Table(name = "TB_PESSOA")

public class PessoaModel extends Serializable{

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Id
	private Long id;
	
	private String nome;
	
	public void ModelPessoa() {
	}
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	

	public String getId() {
		return id;
	}
	
	public void setId (Long id) {
		this.id = id;
	}
	
}
