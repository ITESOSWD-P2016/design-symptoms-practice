package com.iteso.strategy2;

import static org.junit.Assert.assertEquals;
import com.iteso.strategy2.lifesavers.LifeVosts;
import org.junit.Test;

/**
 * Created by Paloma on 22/09/2015.
 */
public class LifeVostsTest {
    @Test
    public void lifevoststest(){
        LifeVosts lifevost = new LifeVosts();
        assertEquals("I'm a LifeVosts", lifevost.display());
        assertEquals("I can't inflate!", lifevost.iDeflateBehavior.inflate());
        assertEquals("I can't deflate!", lifevost.iDeflateBehavior.deflate());
    }
}
