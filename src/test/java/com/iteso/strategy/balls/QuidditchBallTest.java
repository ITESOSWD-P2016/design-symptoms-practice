package com.iteso.strategy.balls;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
/**
 * Created by Paloma on 22/09/2015.
 */
public class QuidditchBallTest {
    @Test
    public void QuidditchBallTest(){
        QuidditchBall quidditchBallTest = new QuidditchBall();
        assertEquals("I'm sinking slowly", quidditchBallTest.performFloat());
        assertEquals("I'm bouncing normally!", quidditchBallTest.performBounce());
      //  assertEquals("I'm");
    }
}
