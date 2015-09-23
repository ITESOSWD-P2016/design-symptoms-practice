package com.iteso.strategy.balls;

import com.iteso.strategy.Ball;
import com.iteso.strategy.behaviors.impl.CantFloat;
import com.iteso.strategy.behaviors.impl.IrregularBounce;
import com.iteso.strategy.behaviors.impl.NotDeflatable;

/**
 * Created by Paloma on 22/09/2015.
 */
public class HulamaBall extends Ball {
    public HulamaBall(){
        setFloatBehavior(new CantFloat());
        setiDeflateBehavior(new NotDeflatable());
        setBounceBehavior(new IrregularBounce());
        type = "Hulama ball";
    }
}
