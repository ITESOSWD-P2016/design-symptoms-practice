package com.iteso.strategy3.BehaviorsTest;

import static org.junit.Assert.assertEquals;

import com.iteso.strategy3.behaviors.impl.LowAttack;
import org.junit.Test;

/**
 * Created by Paloma on 22/09/2015.
 */
public class LowAttackTest {
    @Test
    public void LowAtTest(){
        LowAttack lat = new LowAttack();
        assertEquals("I'm low attacking", lat.Attack());
    }
}
