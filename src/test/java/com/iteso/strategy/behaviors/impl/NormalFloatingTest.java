package com.iteso.strategy.behaviors.impl;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Created by Paloma on 22/09/2015.
 */
public class NormalFloatingTest {
    @Test
    public void normalfloatingtest(){
        NormalFloating normal = new NormalFloating();
        assertEquals("I'm floating normally", normal.floating());
    }
}
