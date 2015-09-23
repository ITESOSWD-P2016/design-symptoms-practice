package com.iteso.strategy3.SoccerPlayers;

import com.iteso.strategy3.SoccerPlayer;
import com.iteso.strategy3.behaviors.impl.HighDefense;
import com.iteso.strategy3.behaviors.impl.LowAttack;

/**
 * Created by Paloma on 22/09/2015.
 */
public class Defender extends SoccerPlayer {
    public Defender(){
        type = "Defender";
        setDefendingBehavior(new HighDefense());
        setAttackBehavior(new LowAttack());
    }
}
