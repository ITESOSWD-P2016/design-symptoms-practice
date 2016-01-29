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

        String myPin= myAtm.askForPin();

        myAtm.validatePin(myPin);


    }

    private void validatePin(String myPin) {
        System.out.println("Thanks for typing a valid pin");
        System.out.println(myPin);
    }

    private String askForPin() {
        String PIN = null;

        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        if (myCard != null){

            System.out.println("Please Select Card Type");
            System.out.println("-------------------------------");
            System.out.println("Type 1 (4 Dígitos Positivos)");
            System.out.println("Type 2 (6 Dígitos Positivos)");
            System.out.println("Type 3 (8 Chars Alfanumerícos)");
            System.out.println(">> ");
            int opc = scanner.nextInt();

            System.out.println("Please Type Pin");
            System.out.println(">> ");
            PIN = scanner2.nextLine();

            switch (opc){
                case 1:
                    if (PIN.matches("^(\\d\\d\\d\\d)$"))
                        System.out.println("PIN Correcto: " + PIN);
                    else
                        System.out.println("ERROR: PIN Incorrecto: " + PIN);
                break;

                case 2:
                    if (PIN.matches("^(\\d\\d\\d\\d\\d\\d)$"))
                        System.out.println("PIN Correcto: " + PIN);
                    else
                        System.out.println("ERROR: PIN Incorrecto: " + PIN);
                    break;

                case 3:
                    if (PIN.matches("^(\\w\\w\\w\\w\\w\\w\\w\\w)$"))
                        System.out.println("PIN Correcto: " + PIN);
                    else
                        System.out.println("ERROR: PIN Incorrecto: " + PIN);
                    break;
                default:
                    System.out.println("ERROR: Opción Incorrecta");
            }

        }
        return PIN;

    }

    private void askForCard() throws IOException {

        Scanner scanner = new Scanner(System.in);

        if (myCard == null){
            System.out.println("Please Insert Card");
            System.out.println(">> ");
            int CardNumber = scanner.nextInt();
            if (CardNumber >= 1){
                myCard = new MyBankCard();
            }


        }

    }


}
