package com.iteso.design;



import java.io.IOException;
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
        MyBankCard myCard = new MyBankCard();
        MyBankATM myATM = new MyBankATM();

        boolean valid=false;
        //ATM Should Request Card

            myATM.Number = myCard.askForCard();



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
