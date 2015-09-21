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
public class SoccerBallTest {
    @Test
    public void testSoccerBall() {
        SoccerBall soccerBall = new SoccerBall();
        assertEquals("I'm bouncing normally!", soccerBall.performBounce());
        assertEquals("I'm deflating!", soccerBall.performDeflate());
        assertEquals("I'm inflating!", soccerBall.performInflate());
        assertEquals("Soccer ball is rolling!", soccerBall.roll());
    }
}
