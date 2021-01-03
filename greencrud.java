import java.io.*;
import java.util.*;
/**
 * This program takes the initial size of a green curd population (in prounds) and takes input from a the file greencrud.txt and outputs # of pounds of green crud population to an crudout.txt.
 * 
 * @author Deepali Juneja
 * @version 21 February 2020
 */
public class greencrud{
    public static void main(String[] args){
        try {
            FileInputStream fin = new FileInputStream("greencrud.txt");
            FileOutputStream fout = new FileOutputStream("curdout.txt");
            PrintWriter printW = new PrintWriter(fout);
            Scanner sc = new Scanner(fin);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                String[] list = line.split(" ");
                int begin = Integer.parseInt(list[0]);
                int DAYS = Integer.parseInt(list[1]);
                int n = DAYS/5;
                int x = begin;
                int y = begin;
                int z = 0;
                if (n < 2)
                    z = x;
                for (int i = 2; i<= n; i++){
                    z = x + y;
                    y = z;
                    x = y;
                }
                printW.println(line + " " + z);
            }
            sc.close();
            printW.close();

        }
        catch (Exception e){
            System.out.println("Sorry, cannot find file!");
        }  
    }
}
