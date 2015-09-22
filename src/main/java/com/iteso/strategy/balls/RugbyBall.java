package com.iteso.strategy.balls;

import com.iteso.strategy.Ball;
import com.iteso.strategy.behaviors.impl.Deflatable;
import com.iteso.strategy.behaviors.impl.IrregularBounce;
import com.iteso.strategy.behaviors.impl.NormalFloating;

/**
 * Created by Paloma on 22/09/2015.
 */
public class RugbyBall extends Ball {
    public RugbyBall(){
        setBounceBehavior(new IrregularBounce());
        setiDeflateBehavior(new Deflatable());
        setFloatBehavior(new NormalFloating());
        type ="Rugby ball";
    }
}
