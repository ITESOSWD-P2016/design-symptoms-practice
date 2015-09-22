package com.iteso.strategy.balls;

import com.iteso.strategy.Ball;
import com.iteso.strategy.behaviors.impl.Deflatable;
import com.iteso.strategy.behaviors.impl.IrregularBounce;
import com.iteso.strategy.behaviors.impl.NormalFloating;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 8/7/13
 * Time: 6:46 PM
 * To change this template use File | Settings | File Templates.
 */
public class AmericanFootballBall extends Ball {
    public AmericanFootballBall() {
        setBounceBehavior(new IrregularBounce());
        setiDeflateBehavior(new Deflatable());
        setFloatBehavior(new NormalFloating());
        type = "American Football ball";
    }

}
