package me.krasun.recipes.model;

import java.util.Objects;

public enum MeasuringUnit {
    PCS("piece", "pieces"),
    ML("ml", "ml"),
    G("g", "g"),
    TSP("teaspoon", "teaspoons"),
    TBSP("tablespoon", "tablespoons"),
    CUP("cup", "cups"),
    PINCH("pinch", "pinches");

    private String singularName;

    private String pluralName;

    MeasuringUnit(String singularName, String pluralName) {
        this.singularName = singularName;
        this.pluralName = pluralName;
    }

    public String getProperName(double qty){
        return Objects.equals(1.0, qty) ? singularName : pluralName;
    }
}
