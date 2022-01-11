package Replit.ReplitArraysAndAfter;

import java.util.Scanner;

public class Method_Overloading {
    // Write your code here

    public static int findMax(int[] ints){
        int max=Integer.MIN_VALUE;
        for (int each : ints) {
            if (each>max){
                max=each;
            }
        }
        return max;

    }
    public static double findMax(double[] ints){
        double max=Double.MAX_VALUE;
        for (double each : ints) {
            if (each>max){
                max=each;
            }
        }
        return max;

    }












// DO NOT TOUCH THE MAIN METHOD

    public static void main(String [] args) {

        Scanner in = new Scanner(System.in);
        boolean runInt = in.nextBoolean();
        int size = in.nextInt();

        if(runInt) {
            int [] arr = new int[size];
            for(int i=0; i < arr.length; i++) {
                arr[i] = in.nextInt();
            }
            System.out.println(findMax(arr));
        } else {
            double [] arr = new double[size];
            for(int i=0; i < arr.length; i++) {
                arr[i] = in.nextInt();
            }
            System.out.println(findMax(arr));
        }

    }
}
