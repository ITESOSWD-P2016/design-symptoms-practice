package com.iteso.strategy.behaviors.impl;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 8/12/13
 * Time: 11:51 AM
 * To change this template use File | Settings | File Templates.
 */
public class DeflatableTest {
    @Test
    public void testDeflatableDeflate() {
        Deflatable deflatable = new Deflatable();
        assertEquals("I'm deflating!",deflatable.deflate());

    }

    @Test
    public void testDeflatableInflate() {
        Deflatable deflatable = new Deflatable();
        assertEquals("I'm inflating!",deflatable.inflate());

    }
}
