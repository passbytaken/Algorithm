package me.ele.napos.Utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by jakoo on 30/10/2017.
 */
public class CSVReader {

    public static void main(String[] args) {
        String csvFile = "/Users/jakoo/Desktop/country.csv"; //CSV文件路径
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";


        try {
            br = new BufferedReader(new FileReader(csvFile));

            while ((line = br.readLine()) != null){
                String[] country = line.split(cvsSplitBy);
                System.out.println("Country [code= " + country[4] + " , name=" + country[5] + "]");
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

    }
}
