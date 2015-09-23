package com.iteso.strategy2;

import com.iteso.strategy2.lifesavers.LifeSaverCandies;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
/**
 * Created by Paloma on 22/09/2015.
 */
public class LifeSaverCandiesTest {
    @Test
    public void lifesavercandytest(){
        LifeSaverCandies lifesaver = new LifeSaverCandies();
        assertEquals("I'm deflating" , lifesaver.deflating());
        assertEquals("I'm inflating", lifesaver.inflating());
        assertEquals("I'm a Life Saver", lifesaver.display());

    }
}
