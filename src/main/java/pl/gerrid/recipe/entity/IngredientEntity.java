package pl.gerrid.recipe.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class IngredientEntity {
    @Id
    private int id;
    private String name;
}
