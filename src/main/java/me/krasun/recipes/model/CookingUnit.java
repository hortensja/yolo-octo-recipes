package me.krasun.recipes.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class CookingUnit {

    private MeasuringUnit measuringUnit;

    private Double qty;

    @Override
    public String toString(){
        return String.format("%f %s", qty, measuringUnit.getProperName(qty));
    }
}
