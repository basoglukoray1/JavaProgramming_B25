package Replit.ReplitArraysAndAfter;

import java.util.Scanner;

public class Hamlet {
    public static boolean hamletQuote(boolean toBe,boolean notToBe) {
        // your code here
        boolean orLogic = false;
        if (toBe == false && notToBe == false) {
            orLogic = false;
        } else {
            orLogic = true;
        }
        return orLogic;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(hamletQuote(in.nextBoolean(), in.nextBoolean()));
    }
}
