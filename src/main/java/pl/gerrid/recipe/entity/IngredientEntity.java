package pl.gerrid.recipe.entity;

import lombok.Getter;
import lombok.Setter;
import pl.gerrid.recipe.model.Ingredient;

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

    public Ingredient toModel(){
        return new Ingredient(id, name);
    }
}
