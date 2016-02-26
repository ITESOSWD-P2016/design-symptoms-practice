package com.iteso.design.Pin;

/**
 * Created by ChaosInfinityViral on 26/02/16.
 */
public interface iPin {
    /**
     * Created by lnvitado on 29/01/2016.
     */
    interface PIN {

        String AskForPin();
        boolean ValidatePin(String pin);

    }
}
