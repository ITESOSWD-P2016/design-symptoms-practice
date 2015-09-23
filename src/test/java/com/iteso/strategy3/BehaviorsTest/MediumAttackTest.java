package com.iteso.strategy3.BehaviorsTest;

import com.iteso.strategy3.behaviors.impl.MediumAttack;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Paloma on 22/09/2015.
 */
public class MediumAttackTest {
    @Test
    public void matest(){
        MediumAttack ma = new MediumAttack();
        assertEquals("I'm medium attacking", ma.Attack());
    }
}
