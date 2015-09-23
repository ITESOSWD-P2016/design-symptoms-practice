package com.iteso.strategy3.BehaviorsTest;

import com.iteso.strategy3.behaviors.impl.HighAttack;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Paloma on 22/09/2015.
 */
public class HighAttackTest {
    @Test
    public void HighTest(){
        HighAttack hat = new HighAttack();
        assertEquals("I'm high attacking", hat.Attack());

    }
}
