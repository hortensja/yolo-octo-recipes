package me.krasun.recipes.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import lombok.Data;
import me.krasun.recipes.util.Randomizable;

@Data
public class CookingUnit implements Randomizable<CookingUnit> {

    private MeasuringUnit measuringUnit;

    private Double qty;

    @Override
    public String toString(){
        return String.format("%f %s", qty, measuringUnit.getProperName(qty));
    }

    @Override
    public CookingUnit randomize() {
        List<MeasuringUnit> units = Arrays.asList(MeasuringUnit.values());
        Collections.shuffle(units);
        this.measuringUnit = units.get(0);
        Random random = new Random();
        this.qty = (1 + 0.25 * random.nextGaussian()) * measuringUnit.getReasonableAmount();
        return this;
    }
}
