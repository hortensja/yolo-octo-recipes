package me.krasun.recipes.model;

import static me.krasun.recipes.model.Action.COLD;
import static me.krasun.recipes.model.Action.CUT;
import static me.krasun.recipes.model.Action.HEAT;

public enum CookingAction {
    // heat processing
    ROAST(HEAT),
    GRILL(HEAT),
    SEAR(HEAT),
    BAKE(HEAT),
    BOIL(HEAT),
    BLANCH(HEAT),
    BRAISE(HEAT),
    INFUSE(HEAT),
    POACH(HEAT),
    SIMMER(HEAT),
    STEAM(HEAT),
    STEW(HEAT),
    FRY(HEAT),
    DEEP_FRY(HEAT),
    STIR_FRY(HEAT),
    SMOKE(HEAT),
    MICROWAVE(HEAT),
    //cold processing
    CURE(COLD),
    FREEZE(COLD),

    //cutting
    DICE(CUT),
    GRATE(CUT),
    MINCE(CUT),

    //mixing
    MIX(Action.MIX),
    BLEND(Action.MIX),
    FILL(Action.MIX),
    COVER(Action.MIX),
    KNEAD(Action.MIX)
    ;



    private Action action;

    private String verb;

    CookingAction(Action action) {
        this.action = action;
    }
}
