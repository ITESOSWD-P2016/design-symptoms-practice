package com.iteso.strategy3.BehaviorsTest;

import static org.junit.Assert.assertEquals;

import com.iteso.strategy3.behaviors.impl.MediumDefense;
import org.junit.Test;

/**
 * Created by Paloma on 22/09/2015.
 */
public class MediumDefenseTest {
    @Test
    public void medtest(){
        MediumDefense mdt = new MediumDefense();
        assertEquals("I'm medium defending", mdt.Defend());
    }
}
