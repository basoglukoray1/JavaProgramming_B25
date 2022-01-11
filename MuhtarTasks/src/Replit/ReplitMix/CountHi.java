package Replit.ReplitMix;

import java.util.Locale;
import java.util.Scanner;

public class CountHi {
    public static void main(String[] args) {

       Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
                    str=str.toLowerCase();
                    int count=0;
        for (int i = 0; i <str.length()-2 ; i++) {
           str= str.substring(i,i+2);
            if (str.contains("hi")){
                count++;
            }
        }
        System.out.println(count);




    }
}
