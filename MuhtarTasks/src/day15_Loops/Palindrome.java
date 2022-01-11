package day15_Loops;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        System.out.println("Enter your word:");
        String s=new Scanner(System.in).next();
        boolean palindrome=true;
        String reverse="";
        for (int i = s.length()-1; i >=0 ; i--) {
            reverse += s.charAt(i);
            if (s.equals(reverse)){
                palindrome = true;
            }else{
                palindrome=false;
            }
        }


        System.out.println("palindrome = " + palindrome);





    }
}
