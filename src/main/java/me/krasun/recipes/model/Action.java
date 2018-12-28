package me.krasun.recipes.model;

import static me.krasun.recipes.model.ActionGroup.COLD;
import static me.krasun.recipes.model.ActionGroup.CUT;
import static me.krasun.recipes.model.ActionGroup.HEAT;

public enum Action {
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
    MIX(ActionGroup.MIX),
    BLEND(ActionGroup.MIX),
    FILL(ActionGroup.MIX),
    COVER(ActionGroup.MIX),
    KNEAD(ActionGroup.MIX)
    ;



    private ActionGroup actionGroup;

    private String verb;

    Action(ActionGroup actionGroup) {
        this.actionGroup = actionGroup;
    }
}
