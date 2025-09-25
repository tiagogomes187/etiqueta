package br.dev.tiagogomes.etiqueta.dto;

import br.dev.tiagogomes.etiqueta.entities.Category;

public record CategoryDTO(Long id, String name) {
	
	// Construtor auxiliar para converter da entidade para o DTO
	public CategoryDTO(Category category) {
		this(category.getId(), category.getName());
	}
	
}
