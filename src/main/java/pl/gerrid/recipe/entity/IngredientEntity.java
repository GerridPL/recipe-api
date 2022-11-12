package pl.gerrid.recipe.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "ingredient_entity")
public class IngredientEntity {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;
}
