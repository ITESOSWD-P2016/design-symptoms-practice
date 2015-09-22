package com.iteso.strategy2.lifesavers;

import com.iteso.strategy.behaviors.iDeflateBehavior;
import com.iteso.strategy.behaviors.impl.NotDeflatable;
import com.iteso.strategy2.Lifesaver;

/**
 * Created by Paloma on 22/09/2015.
 */
public class WaterTubes extends Lifesaver {
    public WaterTubes(){
        iDeflateBehavior = new NotDeflatable();
        type = "Water Tubes";
    }


}
