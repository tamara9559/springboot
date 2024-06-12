package co.edu.cue.practicaSpring_.repositories.impl;

import co.edu.cue.practicaSpring_.domain.model.Category;
import co.edu.cue.practicaSpring_.mapping.Dto.CategoryDto;
import co.edu.cue.practicaSpring_.mapping.Dto.ProductDto;
import co.edu.cue.practicaSpring_.repositories.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


@org.springframework.stereotype.Repository
public class CategoryRepositoryImpl implements Repository<CategoryDto> {

    @Override
    public List<ProductDto> list() {
        String query = "FROM User";
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public List<CategoryDto> listar() throws SQLException {
        return null;
    }

    @Override
    public CategoryDto porId(Long id) throws SQLException {
        return null;
    }

    @Override
    public void guardar(CategoryDto categoryDto) throws SQLException {

    }

    @Override
    public void eliminar(Long id) throws SQLException {

    }
}
