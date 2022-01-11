package Replit.ReplitArraysAndAfter;

import java.util.Scanner;

public class Next3Num {
    public static void main(String[] args) {
       Scanner inp = new Scanner(System.in);
        System.out.print("enter number\n");
        int num = inp.nextInt();

        next3(num);
    }

    public static void next3(int num) {
        System.out.println("next 3 are:");
        for (int i = 1; i <= 3; i++) {
            System.out.print((num + i) + " ");
        }
    }











}
