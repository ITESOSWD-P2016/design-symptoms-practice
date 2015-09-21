package com.iteso.strategy.balls;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 8/12/13
 * Time: 3:20 PM
 * To change this template use File | Settings | File Templates.
 */
public class BaseballBallTest {
    @Test
    public void testBaseballBall() {
        BaseballBall baseballBall = new BaseballBall();
        assertEquals("I'm bouncing irregularly!", baseballBall.performBounce());
        assertEquals("I can't deflate!", baseballBall.performDeflate());
        assertEquals("I can't inflate!", baseballBall.performInflate());
        assertEquals("Baseball ball is rolling!", baseballBall.roll());
    }
}
