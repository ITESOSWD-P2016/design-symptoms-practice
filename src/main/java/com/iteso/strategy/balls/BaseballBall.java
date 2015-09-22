package com.iteso.strategy.balls;

import com.iteso.strategy.Ball;
import com.iteso.strategy.behaviors.impl.CantFloat;
import com.iteso.strategy.behaviors.impl.IrregularBounce;
import com.iteso.strategy.behaviors.impl.NotDeflatable;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 8/7/13
 * Time: 6:44 PM
 * To change this template use File | Settings | File Templates.
 */
public class BaseballBall extends Ball {
    public BaseballBall() {
        setBounceBehavior(new IrregularBounce());
        setiDeflateBehavior(new NotDeflatable());
        setFloatBehavior(new CantFloat());
        type = "Baseball ball";
    }
}
