package com.martinsrvinicius.dscatalog.dto;

import java.io.Serializable;

import com.martinsrvinicius.dscatalog.entities.Category;

public class CategoryDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	
	//Constructor
	public CategoryDTO() {
	}

	public CategoryDTO(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public CategoryDTO(Category entity) {
		this.id = entity.getId();
		this.name = entity.getName();
	}

	//Getters and setters
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
