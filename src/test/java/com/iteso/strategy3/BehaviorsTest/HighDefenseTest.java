package com.iteso.strategy3.BehaviorsTest;

import com.iteso.strategy3.behaviors.impl.HighDefense;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Paloma on 22/09/2015.
 */
public class HighDefenseTest {
    @Test
    public void hdtest(){
        HighDefense hdt = new HighDefense();
        assertEquals("I'm high defending", hdt.Defend());
    }
}
