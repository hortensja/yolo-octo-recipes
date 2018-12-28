package me.krasun.recipes.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import me.krasun.recipes.util.Randomizable;

@AllArgsConstructor
@Getter
@Setter
public class CookingAction implements Randomizable<CookingAction> {

    private Action action;

    private TimeUnit timeUnit;

    private double length;

    @Override
    public CookingAction randomize() {
        return null;
    }
}
