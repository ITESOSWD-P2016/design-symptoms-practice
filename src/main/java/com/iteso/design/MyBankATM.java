package com.iteso.design;



import com.iteso.design.bankcard.impl.MyBankCard;
import com.iteso.design.bankcard.impl.OtherBankCard;
import com.iteso.design.pin.impl.PIN_4digits;
import com.iteso.design.pin.impl.PIN_6digits;
import com.iteso.design.pin.impl.PIN_8alphanum;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 1/25/16
 * Time: 6:14 PM
 * To change this template use File | Settings | File Templates.
 */
public class MyBankATM {
    String Number=null;
    String Pin=null;
    String Type=null;

    public MyBankATM() {

    }
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        int BankName = 1;

        MyBankATM myATM = new MyBankATM();

        boolean valid=false;

        System.out.println("Select your Bank");
        System.out.println("----------------------------");
        System.out.println("1) MaiBank");
        System.out.println("2) OtterBank");
        System.out.print(">> ");
        BankName = scanner.nextInt();

        if(BankName == 1)
        {
            MyBankCard myCard = new MyBankCard();
            myATM.Number = myCard.askForCard();
        }
        else  if (BankName==2)
        {
            OtherBankCard myCard = new OtherBankCard();
            myATM.Number = myCard.askForCard();
        }

        //ATM Should Request Card

        if (myATM.Number.startsWith("1")) {
            myATM.Type = "1";
            PIN_4digits myPin = new PIN_4digits();
            myATM.Pin = myPin.AskForPin();
            valid = myPin.ValidatePin(myATM.Pin);
        }
        else if (myATM.Number.startsWith("2")) {
            myATM.Type = "2";
            PIN_6digits myPin = new PIN_6digits();
            myATM.Pin = myPin.AskForPin();
            valid = myPin.ValidatePin(myATM.Pin);
        }

        else if (myATM.Number.startsWith("3")) {
            myATM.Type = "3";
            PIN_8alphanum myPin = new PIN_8alphanum();
            myATM.Pin = myPin.AskForPin();
            valid = myPin.ValidatePin(myATM.Pin);
        }

        if (valid)
            System.out.println("Thanks for typing a valid pin");
        else
            System.out.println("Sorry, that is an invalid pin");




    }



}
