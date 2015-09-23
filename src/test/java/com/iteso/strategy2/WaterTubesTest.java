package com.iteso.strategy2;

import static org.junit.Assert.assertEquals;

import com.iteso.strategy2.lifesavers.WaterTubes;
import org.junit.Test;

/**
 * Created by Paloma on 22/09/2015.
 */
public class WaterTubesTest {
    @Test
    public void waterttest(){
        WaterTubes watertube = new WaterTubes();
        assertEquals("I can't deflate!", watertube.iDeflateBehavior.deflate());
        assertEquals("I can't inflate!", watertube.iDeflateBehavior.inflate());
        assertEquals("I'm a Water Tube", watertube.display());
    }
}
