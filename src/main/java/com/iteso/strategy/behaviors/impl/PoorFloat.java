package com.iteso.strategy.behaviors.impl;

import com.iteso.strategy.behaviors.iFloatBehavior;

/**
 * Created by Paloma on 22/09/2015.
 */
public class PoorFloat implements iFloatBehavior {
    public String floating() {
        return "I'm sinking slowly";
    }
}
