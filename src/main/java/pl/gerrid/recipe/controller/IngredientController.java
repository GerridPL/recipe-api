package pl.gerrid.recipe.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.gerrid.recipe.model.Ingredient;
import pl.gerrid.recipe.service.IngredientService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class IngredientController {
    private final IngredientService ingredientService;

    @GetMapping("/ingredients")
    public List<Ingredient> getIngredients() {
        return ingredientService.index();
    }

}
