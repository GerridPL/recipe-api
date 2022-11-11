package pl.gerrid.recipe.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.gerrid.recipe.dataProvider.interfaces.IngredientDataProviderInterface;
import pl.gerrid.recipe.model.Ingredient;

import java.util.List;

@Service
@RequiredArgsConstructor
public class IngredientService {

    IngredientDataProviderInterface ingredientDataProviderInterface;
    public List<Ingredient> index() {
        return ingredientDataProviderInterface.findAll();
    }
}
