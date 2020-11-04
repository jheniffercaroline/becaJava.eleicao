package br.eleicao.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ZonaEleitoral {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String Id;
	private String Nome;

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

}
