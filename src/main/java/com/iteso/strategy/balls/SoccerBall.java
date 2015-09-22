package com.iteso.strategy.balls;

import com.iteso.strategy.Ball;
import com.iteso.strategy.behaviors.impl.Deflatable;
import com.iteso.strategy.behaviors.impl.NormalBounce;
import com.iteso.strategy.behaviors.impl.NormalFloating;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 8/7/13
 * Time: 6:39 PM
 * To change this template use File | Settings | File Templates.
 */
public class SoccerBall extends Ball {
    public SoccerBall() {
        setBounceBehavior(new NormalBounce());
        setiDeflateBehavior(new Deflatable());
        setFloatBehavior(new NormalFloating());
        type = "Soccer ball";
    }
}
