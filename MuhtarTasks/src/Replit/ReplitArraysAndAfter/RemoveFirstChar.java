package Replit.ReplitArraysAndAfter;

import java.util.Scanner;

public class RemoveFirstChar {
    public static String removeFirst(String target) {

        String result=target.substring(1);


    return  result;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(removeFirst(in.next()));
    }
}
