package Konular._Exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class IOExceptionExample {

    // private static String filepath = "C:\\Users\\kdogan\\Desktop\\TestFiles\\testFile.txt";
    private static String filepath = "src/test/resources/testFile.txt";

    public static void main(String[] args) {
        BufferedReader br = null;
        String line;
        try {
            br = new BufferedReader(new FileReader(filepath));
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("An IOException was caught :" + e.getMessage());
            System.out.println("An IOException was caught :" + e.getMessage());
        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}