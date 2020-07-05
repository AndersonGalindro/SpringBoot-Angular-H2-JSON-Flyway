package com.crud.aviso;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class aviso {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Integer id;

	@Column(name = "TITULO")
	private String titulo;

	@Column(name = "DESCRICAO")
	private String descricao;
	
	@Column(name = "DATA_DO_EVENTO")
	private LocalDate dataDoEvento;

	public aviso(String titulo, String descricao, LocalDate dataDoEvento) {

		this.titulo = titulo;
		this.descricao = descricao;
		this.dataDoEvento = dataDoEvento;
	}

	public aviso() {
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDate getDataDoEvento() {
		return dataDoEvento;
	}

	public void setDataDePublicacao(LocalDate dataDoEvento) {
		this.dataDoEvento = dataDoEvento;
	}

}
