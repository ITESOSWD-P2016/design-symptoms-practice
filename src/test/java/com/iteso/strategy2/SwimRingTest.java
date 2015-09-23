package com.iteso.strategy2;

import com.iteso.strategy2.lifesavers.SwimRing;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
/**
 * Created by Paloma on 22/09/2015.
 */
public class SwimRingTest {
    @Test
    public void swimringtest(){
        SwimRing swimring = new SwimRing();
        assertEquals("I'm inflating", swimring.inflating());
        assertEquals("I'm deflating", swimring.deflating());
        assertEquals("I'm a Swim ring", swimring.display());
    }
}
