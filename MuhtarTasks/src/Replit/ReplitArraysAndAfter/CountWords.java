package Replit.ReplitArraysAndAfter;

import java.util.Scanner;

public class CountWords {
    public static int wordCount(String words) {
        // your code
        String[] result=words.split(" ");
        int count=0;
        for (String each : result) {
            count++;
        }


        return count;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(wordCount(in.nextLine()));
    }
}
