package com.iteso.strategy3.behaviors.impl;

import com.iteso.strategy3.behaviors.iAttackingBehavior;

/**
 * Created by Paloma on 22/09/2015.
 */
public class MediumAttack implements iAttackingBehavior {
    public String Attack(){
        return "I'm medium attacking";
    }
}
