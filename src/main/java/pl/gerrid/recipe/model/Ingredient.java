package pl.gerrid.recipe.model;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Ingredient {
    private int id;
    private String name;

    public Ingredient(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
