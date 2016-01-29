package com.iteso.design;



import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 1/25/16
 * Time: 6:14 PM
 * To change this template use File | Settings | File Templates.
 */
public class MyBankATM {
    MyBankCard myCard = null;

    public MyBankATM() {
    }
    public static void main(String args[]){
        MyBankATM myAtm = new MyBankATM();


        //ATM Should Request Card
        try {
            myAtm.askForCard();
        } catch (IOException e) {
            e.printStackTrace();
        }

        int myPin[]= myAtm.askForPin();

        myAtm.validatePin(myPin);


    }

    private void validatePin(int[] myPin) {
        System.out.println("Thanks for typing a valid pin");
        System.out.println(myPin);
    }

    private int[] askForPin() {
        int[] pin = new int[4];
        if (myCard != null){
            System.out.println("Please Type Pin");

            try {
                int j;
                for(j = 0; j<4 ; j++){
                    pin[j] = System.in.read();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return pin;

    }

    private void askForCard() throws IOException {

        if (myCard == null){
            System.out.println("Please Insert Card");
            int read = System.in.read();
            if (read >= 1){
                myCard = new MyBankCard();
            }
        }

    }


}
