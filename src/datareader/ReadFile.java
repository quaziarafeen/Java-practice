package datareader;


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {

    public static void main(String[] args) {

        FileReader fileReader=null;
        BufferedReader bufferedReader=null;

        String fileName="../LearnJava_WeekdaysEvening_SeleniumDecember2019/src/datareader/Sample.txt";

        try {

        fileReader=new FileReader(fileName);
        bufferedReader=new BufferedReader(fileReader);

        List <Double> data = new ArrayList<>();
        String input="";

//      data=bufferedReader.readLine();

        while ( ( input=bufferedReader.readLine()) != null){

            if(Double.parseDouble(input)>0)
            data.add(Double.parseDouble(input));
            else
                input=bufferedReader.readLine();
                System.out.println(data);
            }

        } catch (NumberFormatException n){
            //e.printStackTrace();
            n.printStackTrace();
            System.out.println("File not Found1");
        } catch (Exception e){
            e.printStackTrace();
            //n.printStackTrace();
            System.out.println("File not Found");}
        finally {

            try {
                fileReader.close();
                bufferedReader.close();

            }catch (Exception e){
                e.printStackTrace();
                System.out.println("File Already closed");
            }



        }


    }







}
