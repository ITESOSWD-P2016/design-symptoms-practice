package com.iteso.strategy.balls;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Created by Paloma on 22/09/2015.
 */
public class PingPongBallTest {
    @Test
    public void pingpongtest(){
        PingPongBall pingpongball = new PingPongBall();
        assertEquals("I'm floating normally",pingpongball.performFloat());
        assertEquals("I can't inflate!", pingpongball.performInflate());
        assertEquals("I can't deflate!", pingpongball.performDeflate());
        assertEquals("Ping pong ball is rolling!", pingpongball.roll());
        assertEquals("I'm bouncing normally!", pingpongball.performBounce());
    }
}
