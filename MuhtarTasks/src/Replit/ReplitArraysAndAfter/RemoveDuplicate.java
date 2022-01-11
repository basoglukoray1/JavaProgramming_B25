package Replit.ReplitArraysAndAfter;

import java.util.Scanner;

public class RemoveDuplicate { public static void main(String[] args) {
   Scanner in = new Scanner(System.in);
    System.out.println(uniqueChars(in.next()));
}

    public static String uniqueChars(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if (!result.contains(each + "")) {
                result += each;
            }

        }
        return result;
    }
    }
