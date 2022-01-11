package Replit.ReplitArraysAndAfter;

import java.util.Scanner;

public class FindError {
    public static boolean isError(String line) {

            boolean isTrue=false;
            if (line.startsWith("error")){
                isTrue=true;

            }else {
                isTrue=false;
            }

        return isTrue;


    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(isError(in.nextLine()));
    }
}
