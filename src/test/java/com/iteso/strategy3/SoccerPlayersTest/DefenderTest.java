package com.iteso.strategy3.SoccerPlayersTest;

import static org.junit.Assert.assertEquals;

import com.iteso.strategy3.SoccerPlayers.Defender;
import org.junit.Test;

/**
 * Created by Paloma on 22/09/2015.
 */
public class DefenderTest {
    @Test
    public void defendertest(){
        Defender defender = new Defender();
        assertEquals("I'm low attacking", defender.performAtack());
        assertEquals("I'm high defending", defender.performDefense());
        assertEquals("I'm a Defender", defender.position());
    }
}
