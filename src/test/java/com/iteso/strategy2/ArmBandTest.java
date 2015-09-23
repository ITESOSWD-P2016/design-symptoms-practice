package com.iteso.strategy2;

import static org.junit.Assert.assertEquals;

import com.iteso.strategy2.lifesavers.ArmBands;
import org.junit.Test;

/**
 * Created by Paloma on 22/09/2015.
 */
public class ArmBandTest {
    @Test
    public void armbandtest(){
        ArmBands armbnd = new ArmBands();
        assertEquals("I'm deflating", armbnd.deflating());
        assertEquals("I'm inflating", armbnd.inflating());
        assertEquals("I'm a Arm band", armbnd.display());
    }
}
