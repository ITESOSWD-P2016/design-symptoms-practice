package com.iteso.design;

/**
 * Created by ChaosInfinityViral on 12/02/16.
 */

import org.apache.commons.lang.RandomStringUtils;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;



public class WriteCVS {


    //Delimiter used in CSV file
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";

    static String  word = null;
    static int num= 0;
    public static void main(String[] args) {
        String cvsFile = "/Users/ChaosInfinityViral/design-symptoms-practice/resources/main/java/com/iteso/cuentahabiente/cuentahabiente.csv";

        WriteCVS obj = new WriteCVS();
        obj.writeCsvFile(cvsFile);

    }


    //ID, Nombre, Numero de Cuenta, NIP actual, NIP anterior, NIP esta activo "1" o inactivo "0"
    public static void writeCsvFile(String fileName) {




        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(fileName);
            Scanner scanner = new Scanner(System.in);



            //Write a new student object list to the CSV file
                ReadCVS obj = new ReadCVS();
                num= obj.run();
                word = Integer.toString(num);
                fileWriter.append(word);
                //fileWriter.append();
                System.out.println("Type your name");
                word = scanner.nextLine();
                fileWriter.append(word);
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(RandomStringUtils.randomNumeric(12));
                fileWriter.append(COMMA_DELIMITER);
                System.out.println("Type your NEW NIP");
                word = scanner.nextLine();
                fileWriter.append(word);
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(word);
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append("1");
                fileWriter.append(NEW_LINE_SEPARATOR);




            System.out.println("CSV file was created successfully !!!");

        } catch (Exception e) {
            System.out.println("Error in CsvFileWriter !!!");
            e.printStackTrace();
        } finally {

            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("Error while flushing/closing fileWriter !!!");
                e.printStackTrace();
            }

        }
    }
}