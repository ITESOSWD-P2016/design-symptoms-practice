package com.iteso.design;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by rvillalobos on 1/26/16.
 */
public class OtherBankCard implements BankCard{


    public String askForCard() {
        Scanner scanner = new Scanner(System.in);
        String VerifiedCardNumber;

        System.out.println("Please Insert Card (The first numbers is your Card Type)");
        System.out.println("----------------------------");
        System.out.println("1) Debit (4 Digit PIN)");
        System.out.println("2) Credit (6 Digit PIN)");
        System.out.println("3) Platinum (8 Alpha-numeric PIN)");
        System.out.print(">> ");
        String CardNumber = scanner.nextLine();

        if (CardNumber.matches("^([123](\\d)+)$")){
            VerifiedCardNumber = CardNumber;
        }
        else
            VerifiedCardNumber = null;

        return VerifiedCardNumber;

    }
}
