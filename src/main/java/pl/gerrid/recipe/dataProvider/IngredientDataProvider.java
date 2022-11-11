package pl.gerrid.recipe.dataProvider;

import lombok.RequiredArgsConstructor;
import pl.gerrid.recipe.dataProvider.interfaces.IngredientDataProviderInterface;
import pl.gerrid.recipe.entity.IngredientEntity;
import pl.gerrid.recipe.model.Ingredient;
import pl.gerrid.recipe.repository.IngredientRepository;

import java.util.List;

@RequiredArgsConstructor
public class IngredientDataProvider implements IngredientDataProviderInterface {

    IngredientRepository ingredientRepository;

    public List<Ingredient> findAll() {
        return ingredientRepository.findAll().stream().map(IngredientEntity::toModel).toList();
    }
}
