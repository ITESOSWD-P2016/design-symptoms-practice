package com.iteso.strategy.balls;

import com.iteso.strategy.Ball;
import com.iteso.strategy.behaviors.impl.NormalBounce;
import com.iteso.strategy.behaviors.impl.NormalFloating;
import com.iteso.strategy.behaviors.impl.NotDeflatable;

/**
 * Created by Paloma on 22/09/2015.
 */
public class PingPongBall extends Ball {
    public PingPongBall(){
        setBounceBehavior(new NormalBounce());
        setFloatBehavior(new NormalFloating());
        setiDeflateBehavior(new NotDeflatable());
        type ="Ping pong ball";
    }
}
