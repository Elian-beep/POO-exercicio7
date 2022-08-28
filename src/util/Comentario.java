package util;

import java.sql.Date;

import entities.Post;

public class Comentario {
	
//	ATRIBUTOS
	private String texto;
	
//	CONSTRUTORES
	public Comentario() {}

	public Comentario(String texto) {
		super();
		this.texto = texto;
	}

//	GETTERS E SETTER
	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
	
}
