package Replit.ReplitArraysAndAfter;

import java.util.Scanner;

public class MergeString {
    public static String mergeStrings(String one, String two) {
        String result = "";
        for (int i = 0; i < one.length() || i < two.length(); i++) {
            if (i < one.length()) {
                result += one.charAt(i);
            }
            if (i < two.length()) {
                result += two.charAt(i);
            }


        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(mergeStrings(in.next(), in.next()));
    }
}
