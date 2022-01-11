package Replit.ReplitArraysAndAfter;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Anagram {
    public static boolean isAnagram(String word1, String word2) {
        word1.toLowerCase();
        word2.toLowerCase();

        char[] ch1= word1.toCharArray();
        char[] ch2=word2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        boolean isAnagram=false;

            if (Arrays.equals(ch1,ch2)){
                isAnagram=true;
            }


        return isAnagram;

    }

    // Do not touch below


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(isAnagram(in.nextLine(), in.nextLine()));



    }
}
