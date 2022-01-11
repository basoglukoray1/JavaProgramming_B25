package Replit.ReplitArraysAndAfter;

import java.util.Arrays;
import java.util.Scanner;

public class Population {
    public static int[] populate(int[] r) {
        // your codes here:
        int[] result=new int[r.length];

        for (int i = 0; i < r.length; i++) {
            result[i] = i+1;
        }
    return result;
    }


    // Do not change
    public static void main(String[] args) 	{
        int [] i= new int[new Scanner(System.in).nextInt()];
        i = populate(i) ;
        System.out.println(Arrays.toString(i));

    }
}
