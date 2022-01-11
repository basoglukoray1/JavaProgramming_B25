package Replit.ReplitArraysAndAfter;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class AverageTemp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] temps = { scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
                scan.nextDouble(), scan.nextDouble(), scan.nextDouble() , scan.nextDouble()  };


        double sum=0;

        for (double each : temps) {
          sum += each;

        }

        double result=sum/ temps.length;
        System.out.println(result);










    }
}
