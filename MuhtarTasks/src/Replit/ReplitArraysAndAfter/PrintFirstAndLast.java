package Replit.ReplitArraysAndAfter;

import java.util.Arrays;
import java.util.Scanner;

public class PrintFirstAndLast {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine()};

        String result="";
        for (String each : words) {
            result=each.charAt(0)+". "+each.charAt(each.indexOf(" ")+1);
            System.out.println(result);
        }












    }
}
