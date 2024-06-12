package co.edu.cue.practicaSpring_.mapping.mapper;

import co.edu.cue.practicaSpring_.domain.model.Category;
import co.edu.cue.practicaSpring_.mapping.Dto.CategoryDto;

public class CategoryMapper mapFrom(Category categoria){
public static CategoryDto mapFrom(Category categoria){
    return new CategoryDto(categoria.getId(),categoria.getName());
}
