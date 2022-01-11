package Replit.ReplitArraysAndAfter;

import java.util.Scanner;

public class GetNum {
    public static String extractNum(String s) {

        String result="";
        for (int i = 0; i <s.length() ; i++) {
            char each=s.charAt(i);

            if (each>='0' && each<='9'){
                result += each;
            }
        }

        return result;


    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(extractNum(in.next()));
    }
}
