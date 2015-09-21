package com.iteso.strategy.behaviors.impl;

import com.iteso.strategy.behaviors.iDeflateBehavior;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 8/7/13
 * Time: 6:32 PM
 * To change this template use File | Settings | File Templates.
 */
public class NotDeflatable implements iDeflateBehavior {
    public String deflate() {
        return "I can't deflate!";
    }

    public String inflate() {
        return "I can't inflate!";
    }
}
