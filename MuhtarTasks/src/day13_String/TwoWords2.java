package day13_String;

import java.util.Scanner;

public class TwoWords2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String s1=s.next();
        String s2=s.next();



        if (s2.charAt(0)==s1.charAt(s1.length()-1)){
            System.out.println(s1+""+s2.substring(1));
        }













    }
}
