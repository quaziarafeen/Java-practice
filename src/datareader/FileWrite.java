package datareader;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {

    public static void main(String[] args) {
        try {
            File myObj = new File("filename1.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        } try {
            FileWriter myWriter = new FileWriter("filename1.txt");
            myWriter.write(CurrencyToWord.getMoneyIntoWords("10"));
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    }

