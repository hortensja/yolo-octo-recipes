package me.krasun.recipes.model;

import java.util.Objects;

public enum MeasuringUnit {
    PCS("piece", "pieces", 4),
    ML("ml", "ml", 250),
    G("g", "g", 250),
    KG("kg", "kg", 1),
    TSP("teaspoon", "teaspoons", 4),
    TBSP("tablespoon", "tablespoons", 4),
    CUP("cup", "cups", 3),
    PINCH("pinch", "pinches", 2);

    private String singularName;

    private String pluralName;

    private double reasonableAmount;

    MeasuringUnit(String singularName, String pluralName, double reasonableAmount) {
        this.singularName = singularName;
        this.pluralName = pluralName;
        this.reasonableAmount = reasonableAmount;
    }

    public String getProperName(double qty){
        return Objects.equals(1.0, qty) ? singularName : pluralName;
    }

    public double getReasonableAmount() {
        return reasonableAmount;
    }
}
