package com.iteso.strategy3.SoccerPlayersTest;

import static org.junit.Assert.assertEquals;

import com.iteso.strategy3.SoccerPlayers.Striker;
import org.junit.Test;

/**
 * Created by Paloma on 22/09/2015.
 */
public class StrikerTest {
    @Test
    public void Strikertest(){
        Striker str= new Striker();
        assertEquals("I'm a Striker", str.position());
        assertEquals("I'm medium attacking", str.performAtack());
        assertEquals("I'm medium defending", str.performDefense());
    }
}
