package Replit.ReplitArraysAndAfter;

import java.util.Scanner;

public class At3rd {
    public static String at3(String target,String word){

        String first= target.substring(0,3);
        String last=target.substring(3);
        String modified=first+word+last;
        //String last= target.substring(modified.length()-1);

        //modified= first+word+last;

        return modified;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(at3(in.next(), in.next()));
    }
}
