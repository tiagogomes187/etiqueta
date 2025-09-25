package br.dev.tiagogomes.etiqueta.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Category implements Serializable {
	
	@Serial
	private static final long serialVersionUID = 1L;
	
	@Id
	private Long id;
	private String name;
	
	public Category () {
	}
	
	public Category (Long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public Long getId () {
		return id;
	}
	
	public void setId (Long id) {
		this.id = id;
	}
	
	public String getName () {
		return name;
	}
	
	public void setName (String name) {
		this.name = name;
	}
	
	@Override
	public boolean equals (Object o) {
		if (!(o instanceof Category category)) return false;
		return Objects.equals (getId (), category.getId ()) && Objects.equals (getName (), category.getName ());
	}
	
	@Override
	public int hashCode () {
		return Objects.hash (getId (), getName ());
	}
}
