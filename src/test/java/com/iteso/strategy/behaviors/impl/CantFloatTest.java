package com.iteso.strategy.behaviors.impl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
/**
 * Created by Paloma on 22/09/2015.
 */
public class CantFloatTest {
    @Test
    public void cantfloattest(){
        CantFloat cantfloat = new CantFloat();
        assertEquals("I can't float :(", cantfloat.floating());
    }
}
