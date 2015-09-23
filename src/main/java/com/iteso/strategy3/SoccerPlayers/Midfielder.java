package com.iteso.strategy3.SoccerPlayers;

import com.iteso.strategy3.SoccerPlayer;
import com.iteso.strategy3.behaviors.impl.MediumAttack;
import com.iteso.strategy3.behaviors.impl.MediumDefense;

/**
 * Created by Paloma on 22/09/2015.
 */
public class Midfielder extends SoccerPlayer {
    public Midfielder(){
        type="Midfielder";
        setAttackBehavior(new MediumAttack());
        setDefendingBehavior(new MediumDefense());
    }
}
