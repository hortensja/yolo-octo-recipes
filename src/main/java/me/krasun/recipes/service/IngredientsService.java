package me.krasun.recipes.service;

import static me.krasun.recipes.util.StreamUtil.toShuffledList;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Service;

import me.krasun.recipes.dao.IngredientDAO;
import me.krasun.recipes.model.Ingredient;
import me.krasun.recipes.model.ListedIngredient;
import me.krasun.recipes.util.ListedIngredientAssembler;

@Service
@EnableMongoRepositories(basePackageClasses = IngredientDAO.class)
public class IngredientsService {

    private IngredientDAO ingredientDAO;

    @Autowired
    public IngredientsService(IngredientDAO ingredientDAO) {
        this.ingredientDAO = ingredientDAO;
    }

    public List<Ingredient> getRandomIngredients(int number) {
        return ingredientDAO.findAll()
                .stream()
                .collect(toShuffledList())
                .subList(0, number);
    }

    public List<ListedIngredient> getListOfIngredients(int number) {
        return getRandomIngredients(number).stream()
                .map(ListedIngredientAssembler::toListedIngredient)
                .collect(Collectors.toList());
    }
}
