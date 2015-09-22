package com.iteso.strategy.balls;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Paloma on 22/09/2015.
 */
public class RugbyBallTest {
    @Test
    public void testRugbyBall() {
        RugbyBall rugbyballtest = new RugbyBall();
        assertEquals("I'm bouncing irregularly!", rugbyballtest.performBounce());
        assertEquals("I'm deflating!", rugbyballtest.performDeflate());
        assertEquals("I'm inflating!", rugbyballtest.performInflate());
        assertEquals("Rugby ball is rolling!", rugbyballtest.roll());
    }
}
