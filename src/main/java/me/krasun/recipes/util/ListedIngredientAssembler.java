package me.krasun.recipes.util;

import me.krasun.recipes.model.CookingUnit;
import me.krasun.recipes.model.FoodGroup;
import me.krasun.recipes.model.FoodGroupName;
import me.krasun.recipes.model.Ingredient;
import me.krasun.recipes.model.ListedIngredient;

public class ListedIngredientAssembler {

    public static ListedIngredient toListedIngredient(Ingredient ingredient) {
        ListedIngredient listedIngredient = new ListedIngredient();
        listedIngredient.setName(ingredient.getName());
        FoodGroupName group = FoodGroupName.findGroup(ingredient.getGroup());
        listedIngredient.setFoodGroup(new FoodGroup(group));
        CookingUnit unit = new CookingUnit().randomize();
        listedIngredient.setUnit(unit);
        return listedIngredient;
    }

}
