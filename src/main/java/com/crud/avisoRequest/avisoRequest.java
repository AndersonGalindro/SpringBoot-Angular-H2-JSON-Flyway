package com.crud.avisoRequest;

import java.time.LocalDate;

import com.crud.aviso.aviso;

public class avisoRequest {

	private String titulo;
	private String descricao;
	private LocalDate dataDoEvento;

	private avisoRequest() {
		// TODO Auto-generated method stub
	}

	public aviso avisoResponse() {
		return new aviso(titulo, descricao,dataDoEvento);
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

	public LocalDate getDataDoEvento() {
		return dataDoEvento;
	}

	public void setDataDoEvento(LocalDate dataDoEvento) {
		this.dataDoEvento = dataDoEvento;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	

}
