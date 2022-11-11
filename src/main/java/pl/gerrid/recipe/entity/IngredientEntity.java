package pl.gerrid.recipe.entity;

import lombok.Getter;
import lombok.Setter;
import pl.gerrid.recipe.model.Ingredient;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class IngredientEntity {
    @Id
    private int id;
    private String name;

    public Ingredient toModel() {
        return new Ingredient(this.id, this.name);
    }
}
