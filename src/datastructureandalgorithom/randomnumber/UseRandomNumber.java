package datastructureandalgorithom.randomnumber;

import java.util.Random;

public class UseRandomNumber {


    public static void main(String[] args) {

        int [] studentID=new int[20];
        Random random= new Random(1);
        for (int i=0;i<20;i++){
            studentID[i]=random.nextInt(20);


        }

        for (int i=0;i<studentID.length;i++){
            System.out.println(studentID[i]);


        }








    }



}
