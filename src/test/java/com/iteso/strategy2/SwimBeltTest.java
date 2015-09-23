package com.iteso.strategy2;

import static org.junit.Assert.assertEquals;
import com.iteso.strategy2.lifesavers.SwimBelts;
import org.junit.Test;

/**
 * Created by Paloma on 22/09/2015.
 */
public class SwimBeltTest {
    @Test
    public void swimbelttest(){
        SwimBelts swimbelt = new SwimBelts();
        assertEquals("I'm deflating", swimbelt.deflating());
        assertEquals("I'm inflating", swimbelt.inflating());
        assertEquals("I'm a Swim Belts", swimbelt.display());
    }
}
