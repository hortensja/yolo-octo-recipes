package me.krasun.recipes.controller;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import me.krasun.recipes.model.Ingredient;
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
    public List<Ingredient> getRandomIngredients(@RequestParam(value = "number", defaultValue = "1") int number) {
        return ingredientsService.getRandomIngredients(number);
    }
}
