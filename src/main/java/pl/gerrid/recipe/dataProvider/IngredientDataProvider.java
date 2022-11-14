package pl.gerrid.recipe.dataProvider;

import io.swagger.annotations.ApiModel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import pl.gerrid.recipe.entity.IngredientEntity;
import pl.gerrid.recipe.model.Ingredient;
import pl.gerrid.recipe.repository.IngredientRepository;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@ApiModel
@Component
public class IngredientDataProvider {

    private final IngredientRepository ingredientRepository;

    public List<Ingredient> findAll () {
        return this.ingredientRepository
                .findAll()
                .stream()
                .map(IngredientEntity::toModel)
                .collect(Collectors.toList());
    }
}
