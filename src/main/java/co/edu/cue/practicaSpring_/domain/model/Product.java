package co.edu.cue.practicaSpring_.domain.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Category category;
    private int price;
    private String sku;
    private LocalDate fechaRegistro;
    public Product(Long id, String name, String tipo, int price) {
        this.id = id;
        this.name = name;
        Category category = new Category();
        category.setName(tipo);
        this.category = category;
        this.price = price;
    }
}

