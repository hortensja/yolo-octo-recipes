package me.krasun.recipes.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ListedIngredient {

    private String name;

    private FoodGroup foodGroup;

    private CookingUnit unit;

}
