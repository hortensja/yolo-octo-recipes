package me.krasun.recipes.dao;

import me.krasun.recipes.model.Ingredient;

public interface IngredientDAO extends BaseDAO<Ingredient, String> {

    Ingredient findByName(String name);
}
