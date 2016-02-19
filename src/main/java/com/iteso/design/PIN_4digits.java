package com.iteso.design;

import java.util.Scanner;

/**
 * Created by lnvitado on 29/01/2016.
 */
public class PIN_4digits implements PIN {



    public String AskForPin() {
        String pin = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Type Pin");
        System.out.println(">> ");
        pin = scanner.nextLine();
        return pin;
    }

    public boolean ValidatePin(String PIN) {
        boolean validity=false;

                if (PIN.matches("^(\\d\\d\\d\\d)$")) {
                    System.out.println("PIN Correcto: " + PIN);
                    validity=true;
                }

                else
                    System.out.println("ERROR: PIN Incorrecto: " + PIN);

        return validity;
    }

}
