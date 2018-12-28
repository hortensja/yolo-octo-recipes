package me.krasun.recipes.model;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public enum FoodGroupName {
    DAIRY_EGG("Dairy and Egg Products"),
    SPICE("Spices and Herbs"),
    FAT("Fats and Oils"),
    POULTRY("Poultry Products"),
    PROCESSED_MEAT("Sausages and Luncheon Meats"),
    FRUIT("Fruits and Fruit Juices"),
    PORK("Pork Products"),
    VEGETABLE("Vegetables and Vegetable Products"),
    NUT("Nut and Seed Products"),
    BEEF("Beef Products"),
    DRINK("Beverages"),
    FISH_SEAFOOD("Finfish and Shellfish Products"),
    LEGUME("Legumes and Legume Products"),
    OTHER_MEAT("Lamb, Veal, and Game Products"),
    BAKED("Baked Products"),
    SWEET("Sweets"),
    SNACK("Snacks"),
    GRAIN("Cereal Grains and Pasta"),
    SOUP_SAUCE("Soups, Sauces, and Gravies"),
    BABY("Baby Foods"), CEREAL("Breakfast Cereals"), OTHER("");

    private static final Map<String, FoodGroupName> lookupMap;

    static {
        lookupMap = Arrays.stream(FoodGroupName.values())
                .collect(Collectors.toMap(o -> o.name, Function.identity()));
    }

    private String name;

    FoodGroupName(String name) {
        this.name = name;
    }

    public static FoodGroupName findGroup(String name) {
        FoodGroupName foodGroupName = lookupMap.get(name);
        return foodGroupName!= null? foodGroupName : OTHER;
    }
}
