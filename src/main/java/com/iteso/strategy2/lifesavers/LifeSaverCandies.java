package com.iteso.strategy2.lifesavers;

import com.iteso.strategy.behaviors.impl.Deflatable;
import com.iteso.strategy2.Lifesaver;

/**
 * Created by Paloma on 22/09/2015.
 */
public class LifeSaverCandies extends Lifesaver {
    public LifeSaverCandies(){
        iDeflateBehavior = new Deflatable();
        type ="Life Saver";
    }
}
