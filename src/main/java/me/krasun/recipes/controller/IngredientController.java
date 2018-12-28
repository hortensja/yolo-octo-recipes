package me.krasun.recipes.controller;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import me.krasun.recipes.model.ListedIngredient;
import me.krasun.recipes.service.IngredientsService;

@RestController
@RequestMapping("/ingredients")
public class IngredientController {

    private IngredientsService ingredientsService;

    @Autowired
    public IngredientController(IngredientsService ingredientsService) {
        this.ingredientsService = ingredientsService;
    }

    @RequestMapping(method = GET)
    public String index() {
        return "Greetings from Spring Boot Ingredients!";
    }

    @RequestMapping(method = GET, value = "/random")
    public String getRandomIngredients(@RequestParam(value = "number", defaultValue = "1") int number) {
        List<ListedIngredient> ingredients = ingredientsService.getListOfIngredients(number);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ingredients.size(); i++) {
            ListedIngredient ingredient = ingredients.get(i);
            String s = String.format("%d. %s %s\n", i + 1, ingredient.getUnit(), ingredient.getName());
            sb.append(s);

        }
        return sb.toString();
    }
}
