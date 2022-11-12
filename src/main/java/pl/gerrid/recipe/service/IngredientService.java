package pl.gerrid.recipe.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.gerrid.recipe.entity.IngredientEntity;
import pl.gerrid.recipe.repository.IngredientRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class IngredientService {

    private final IngredientRepository ingredientRepository;
    public List<IngredientEntity> index() {
        return ingredientRepository.findAll();
    }
}
