package com.iteso.strategy.balls;

import com.iteso.strategy.Ball;
import com.iteso.strategy.behaviors.impl.IrregularBounce;
import com.iteso.strategy.behaviors.impl.NormalBounce;
import com.iteso.strategy.behaviors.impl.NotDeflatable;
import com.iteso.strategy.behaviors.impl.PoorFloat;

/**
 * Created by Paloma on 22/09/2015.
 */
public class QuidditchBall extends Ball {
    public QuidditchBall(){
        setFloatBehavior(new PoorFloat());
        setBounceBehavior(new NormalBounce());
        setiDeflateBehavior(new NotDeflatable());
        type = "Quidditch ball";
    }
}
