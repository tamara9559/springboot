package co.edu.cue.practicaSpring_.repositories;

import co.edu.cue.practicaSpring_.mapping.Dto.ProductDto;

import java.sql.SQLException;
import java.util.List;

public interface Repository <T>{
    List<ProductDto> list() throws SQLException;

    List<T> listar()throws SQLException;
    T porId(Long id) throws SQLException;
    void guardar(T t) throws SQLException;
    void eliminar(Long id) throws SQLException;

}
