package com.iteso.strategy.behaviors.impl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 8/12/13
 * Time: 2:54 PM
 * To change this template use File | Settings | File Templates.
 */
public class IrregularBounceTest {
    @Test
    public void testIrregularBounce() {
        IrregularBounce irregularBounce = new IrregularBounce();
        assertEquals("I'm bouncing irregularly!", irregularBounce.bounce());
    }
}
