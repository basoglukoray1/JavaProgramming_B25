package Replit.ReplitArraysAndAfter;

import java.util.Scanner;

public class LimitString{
        public static String limit(String text, int maxLength){
            // your code

            String modified= text.substring(0, maxLength);


        return modified;

        }

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println(limit(in.nextLine(), in.nextInt()));
        }

}
