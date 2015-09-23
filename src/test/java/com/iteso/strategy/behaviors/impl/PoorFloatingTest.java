package com.iteso.strategy.behaviors.impl;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Created by Paloma on 22/09/2015.
 */
public class PoorFloatingTest {
    @Test
    public void poorftest(){
        PoorFloat poor = new PoorFloat();
        assertEquals("I'm sinking slowly", poor.floating());
    }
}
