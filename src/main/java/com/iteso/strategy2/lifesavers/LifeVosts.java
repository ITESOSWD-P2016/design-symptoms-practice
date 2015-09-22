package com.iteso.strategy2.lifesavers;

import com.iteso.strategy.behaviors.impl.NotDeflatable;
import com.iteso.strategy2.Lifesaver;

/**
 * Created by Paloma on 22/09/2015.
 */
public class LifeVosts extends Lifesaver {
    public LifeVosts(){
        iDeflateBehavior = new NotDeflatable();
        type = "LifeVosts";
    }
}
