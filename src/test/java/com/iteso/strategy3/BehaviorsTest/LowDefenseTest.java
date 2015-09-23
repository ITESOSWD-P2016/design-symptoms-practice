package com.iteso.strategy3.BehaviorsTest;

import com.iteso.strategy3.behaviors.impl.LowDefense;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Paloma on 22/09/2015.
 */
public class LowDefenseTest {
    @Test
    public void ldtest(){
        LowDefense ldt = new LowDefense();
        assertEquals("I'm low defending", ldt.Defend());
    }
}
