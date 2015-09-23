package com.iteso.strategy3.SoccerPlayersTest;

import static org.junit.Assert.assertEquals;

import com.iteso.strategy3.SoccerPlayers.Midfielder;
import org.junit.Test;

/**
 * Created by Paloma on 22/09/2015.
 */
public class MidfielderTest {
    @Test
    public void midfielder(){
        Midfielder mid = new Midfielder();
        assertEquals("I'm a Midfielder", mid.position());
        assertEquals("I'm medium attacking", mid.performAtack());
        assertEquals("I'm medium defending", mid.performDefense());
    }
}
