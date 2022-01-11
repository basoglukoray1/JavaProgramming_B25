package Replit.ReplitArraysAndAfter;

import java.util.Scanner;

public class LongestString {
    public static String bigger(String a ,String b){

        String bigger="";

        if (a.length()>b.length()){
            bigger+=a;
        }else{
            bigger += b;
        }


        return bigger;


    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(bigger(in.next(), in.next()));
    }
}
