package com.iteso.design.bankcard.impl;


import com.iteso.design.bankcard.iBankCard;

import java.util.Scanner;

public class MyBankCard implements iBankCard {



    public String askForCard(){

            Scanner scanner = new Scanner(System.in);
            String VerifiedCardNumber;

                System.out.println("Please Insert Card (The first numbers is your Card Type)");
                System.out.println("----------------------------");
                System.out.println("1) Debit (4 Digit iPIN)");
                System.out.println("2) Credit (6 Digit iPIN)");
                System.out.println("3) Platinum (8 Alpha-numeric iPIN)");
                System.out.print(">> ");
                String CardNumber = scanner.nextLine();

                if (CardNumber.matches("^([123](\\d)*)$")){
                    VerifiedCardNumber = CardNumber;
                }
                else
                    VerifiedCardNumber = null;

        return VerifiedCardNumber;
    }
}
