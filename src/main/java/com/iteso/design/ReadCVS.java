package com.iteso.design;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/**
 * Created by ChaosInfinityViral on 12/02/16.
 */
public class ReadCVS {

    public int run() {

        String csvFile = "/Users/ChaosInfinityViral/design-symptoms-practice/resources/main/java/com/iteso/cuentahabiente/cuentahabiente.csv";
        BufferedReader br = null;
        String line = "";
        int numba=0;
        String cvsSplitBy = ",";

        try {

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] id = line.split(cvsSplitBy);

                System.out.println("Id [code= " + id[0]
                        +  "]");
                numba=Integer.parseInt(id[0].toString());

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println(numba);
        System.out.println("Done");
        return numba;
    }

}