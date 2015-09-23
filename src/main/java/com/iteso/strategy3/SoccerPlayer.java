package com.iteso.strategy3;

import com.iteso.strategy3.behaviors.iAttackingBehavior;
import com.iteso.strategy3.behaviors.iDefendingBehavior;

/**
 * Created by Paloma on 22/09/2015.
 */
public abstract class SoccerPlayer {
    private iAttackingBehavior AttackBehavior;
    private iDefendingBehavior DefendingBehavior;
    protected String type;

    public String position(){
        return "I'm a " + type;
    }

    public String performAtack(){
        return AttackBehavior.Attack();
    }

    public String performDefense(){
        return DefendingBehavior.Defend();
    }

    public iAttackingBehavior getAttackBehavior() {
        return AttackBehavior;
    }

    public void setAttackBehavior(iAttackingBehavior attackBehavior) {
        AttackBehavior = attackBehavior;
    }

    public iDefendingBehavior getDefendingBehavior() {
        return DefendingBehavior;
    }

    public void setDefendingBehavior(iDefendingBehavior defendingBehavior) {
        DefendingBehavior = defendingBehavior;
    }
}
