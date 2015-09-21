package com.iteso.strategy.behaviors.impl;

import com.iteso.strategy.behaviors.iBounceBehavior;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 8/7/13
 * Time: 6:29 PM
 * To change this template use File | Settings | File Templates.
 */
public class Crash implements iBounceBehavior {
    public String bounce() {
        return "I crashed!! I can't bounce";
    }
}
