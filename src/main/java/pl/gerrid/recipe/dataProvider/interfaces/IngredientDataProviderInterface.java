package pl.gerrid.recipe.dataProvider.interfaces;

import pl.gerrid.recipe.model.Ingredient;

import java.util.List;

public interface IngredientDataProviderInterface {
    List<Ingredient> findAll();
}
