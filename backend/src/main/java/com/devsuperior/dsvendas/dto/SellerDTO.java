package com.devsuperior.dsvendas.dto;

import java.io.Serializable;

import com.devsuperior.dsvendas.entities.Seller;

// Classe auxiliar que manipula os dados sem precisar envolver o banco, contém os mesmos dados da entidade
// Serializable: garante que osdados possam se transformar em bytes, indo para arquivos, tráfego e afins

public class SellerDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	
	public SellerDTO() {
		
	}

	public SellerDTO(Long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	// Para facilitar a cópia dos dados de uma entidade para um DTO
	public SellerDTO(Seller entity) {
		this.id = entity.getId();
		this.name = entity.getName();;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
