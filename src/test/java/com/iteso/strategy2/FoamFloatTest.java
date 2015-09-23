package com.iteso.strategy2;

import static org.junit.Assert.assertEquals;

import com.iteso.strategy2.lifesavers.FoamFloats;
import org.junit.Test;

/**
 * Created by Paloma on 22/09/2015.
 */
public class FoamFloatTest {
    @Test
    public void foamfloattest(){
        FoamFloats foamfloat = new FoamFloats();
        assertEquals("I can't deflate!", foamfloat.iDeflateBehavior.deflate());
        assertEquals("I can't inflate!", foamfloat.iDeflateBehavior.inflate());
        assertEquals("I'm a Foam Float", foamfloat.display());
    }
}
