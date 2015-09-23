package com.iteso.strategy2;

import com.iteso.strategy2.lifesavers.SwimSeat;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
/**
 * Created by Paloma on 22/09/2015.
 */
public class SwimSeatTest {
    @Test
    public void swimseat(){
        SwimSeat swimseat = new SwimSeat();
        assertEquals("I'm a Swim seat", swimseat.display());
        assertEquals("I can't deflate!", swimseat.iDeflateBehavior.deflate());
        assertEquals("I can't inflate!", swimseat.iDeflateBehavior.inflate());
    }
}
