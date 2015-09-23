package com.iteso.strategy3.behaviors.impl;

import com.iteso.strategy3.behaviors.iDefendingBehavior;

/**
 * Created by Paloma on 22/09/2015.
 */
public class LowDefense implements iDefendingBehavior {
    public String Defend(){
        return "I'm low defending";
    }
}
