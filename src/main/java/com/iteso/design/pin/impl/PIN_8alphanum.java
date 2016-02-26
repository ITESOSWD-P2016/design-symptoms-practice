package com.iteso.design.pin.impl;

import java.util.Scanner;

/**
 * Created by lnvitado on 29/01/2016.
 */
public class PIN_8alphanum {


    public String AskForPin() {
        String pin = null;
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
        System.out.println("Please Type Pin");
        System.out.println(">> ");
        pin = scanner.nextLine();
        return pin;
    }

    public boolean ValidatePin(String PIN) {
        boolean validity=false;

        if (PIN.matches("^(\\w\\w\\w\\w\\w\\w\\w\\w)$")) {
            System.out.println("PIN Correcto: " + PIN);
            validity=true;
        }

        else
            System.out.println("ERROR: PIN Incorrecto: " + PIN);

        return validity;
    }


}
