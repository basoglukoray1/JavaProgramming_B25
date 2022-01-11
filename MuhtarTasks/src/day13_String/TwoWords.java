package day13_String;

import java.util.Scanner;

public class TwoWords {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        String input=s.next();
        String input2=s.next();

        String z1=input.substring(1);
        String z2=input2.substring(1);

        System.out.println(z1+z2);

        s.close();






    }
}
