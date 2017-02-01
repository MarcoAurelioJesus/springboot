package com.marco.springboot.springboot;

public class Curso {
	 
	  /**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the duracao
	 */
	public String getDuracao() {
		return duracao;
	}

	/**
	 * @param duracao the duracao to set
	 */
	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}

	private Integer id;
	  private String nome;
	  private String duracao;
	  
	  public Curso(Integer id, String nome, String duracao) {
	    this.id = id;
	    this.nome = nome;
	    this.duracao = duracao;
	  }
	  
	  // getters e setters omitidos
	 
	}