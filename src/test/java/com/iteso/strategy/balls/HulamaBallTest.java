package com.iteso.strategy.balls;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Created by Paloma on 22/09/2015.
 */
public class HulamaBallTest {
    @Test
    public void HulamaBallTest(){
        HulamaBall hulamaball = new HulamaBall();
        assertEquals("I can't float :(",hulamaball.performFloat());
        assertEquals("I can't inflate!", hulamaball.performInflate());
        assertEquals("I can't deflate!", hulamaball.performDeflate());
        assertEquals("Hulama ball is rolling!", hulamaball.roll());
        assertEquals("I'm bouncing irregularly!", hulamaball.performBounce());
    }



}
