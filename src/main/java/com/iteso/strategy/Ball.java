package com.iteso.strategy;

import com.iteso.strategy.behaviors.iBounceBehavior;
import com.iteso.strategy.behaviors.iDeflateBehavior;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 8/7/13
 * Time: 6:14 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class Ball {
    protected iBounceBehavior bounceBehavior;
    protected iDeflateBehavior iDeflateBehavior;
    protected String type;

    protected Ball() {
    }

    public String roll() {
        return type + " is rolling!";
    }

    public String performBounce() {
        return bounceBehavior.bounce();
    }

    public String performDeflate() {
        return iDeflateBehavior.deflate();
    }

    public String performInflate() {
        return iDeflateBehavior.inflate();
    }
}
