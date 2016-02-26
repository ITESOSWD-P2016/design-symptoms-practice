package com.iteso.design.bankCard.impl;

import java.util.Scanner;

import com.iteso.design.bankCard.iBankCard;

public class MyBankCard implements iBankCard {



    public String askForCard(){

            @SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
            String VerifiedCardNumber;

                System.out.println("Please Insert Card (The first numbers is your Card Type)");
                System.out.println("----------------------------");
                System.out.println("1) Debit (4 Digit PIN)");
                System.out.println("2) Credit (6 Digit PIN)");
                System.out.println("3) Platinum (8 Alpha-numeric PIN)");
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
