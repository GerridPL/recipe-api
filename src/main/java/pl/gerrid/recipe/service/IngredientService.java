package pl.gerrid.recipe.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.gerrid.recipe.dataProvider.IngredientDataProvider;
import pl.gerrid.recipe.model.Ingredient;

import java.util.List;

@Service
@RequiredArgsConstructor
public class IngredientService {

    private final IngredientDataProvider ingredientDataProvider;
    public List<Ingredient> index() {
        return ingredientDataProvider.findAll();
    }
}
