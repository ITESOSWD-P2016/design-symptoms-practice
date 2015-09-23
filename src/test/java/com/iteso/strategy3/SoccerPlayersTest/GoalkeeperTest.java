package com.iteso.strategy3.SoccerPlayersTest;

import com.iteso.strategy3.SoccerPlayers.Goalkeeper;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Paloma on 22/09/2015.
 */
public class GoalkeeperTest {
    @Test
    public void goalkeepertest(){
        Goalkeeper goal = new Goalkeeper();
        assertEquals("I'm a Goalkeeper", goal.position());
        assertEquals("I'm medium attacking", goal.performAtack());
        assertEquals("I'm medium defending", goal.performDefense());
    }
}
