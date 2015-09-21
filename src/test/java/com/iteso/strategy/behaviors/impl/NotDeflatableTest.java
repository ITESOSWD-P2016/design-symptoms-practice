package com.iteso.strategy.behaviors.impl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 8/12/13
 * Time: 12:55 PM
 * To change this template use File | Settings | File Templates.
 */
public class NotDeflatableTest {
    @Test
    public void testDeflatableDeflate() {
        NotDeflatable notdeflatable = new NotDeflatable();
        assertEquals("I can't deflate!", notdeflatable.deflate());

    }

    @Test
    public void testDeflatableInflate() {
        NotDeflatable notdeflatable = new NotDeflatable();
        assertEquals("I can't inflate!", notdeflatable.inflate());

    }
}
