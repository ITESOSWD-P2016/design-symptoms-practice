package com.iteso.strategy.behaviors.impl;

import com.iteso.strategy.behaviors.iBounceBehavior;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 8/7/13
 * Time: 6:23 PM
 * To change this template use File | Settings | File Templates.
 */
public class NormalBounce implements iBounceBehavior {

    public String bounce() {
        return "I'm bouncing normally!";
    }
}
