package Replit.ReplitArraysAndAfter;

import java.util.Scanner;

public class CountLetter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(countLetters(in.next()));
    }

    public static String countLetters(String str){

        String result="";

        for (int i = 0; i <str.length() ; i++) {
            char each =str.charAt(i);
            int count=0;

            for (int j = 0; j <str.length() ; j++) {
                char each2=str.charAt(j);

                if (each == each2){
                    count++;
                }

            }
            if (!result.contains(each+"")) {
                result += each + "" + count;

            }
        }

        return  result;


    }
}
