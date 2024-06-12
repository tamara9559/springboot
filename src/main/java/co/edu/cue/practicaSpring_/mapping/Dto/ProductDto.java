package co.edu.cue.practicaSpring_.mapping.Dto;

import co.edu.cue.practicaSpring_.domain.model.Category;

import java.time.LocalDate;

public record ProductDto(Long id, String name, Category category, int price, String sku, LocalDate fechaRegistro) {
}