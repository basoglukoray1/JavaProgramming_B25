package day15_ForLoop;

import java.util.Scanner;

public class SumOfMultipleNumbers {
    public static void main(String[] args) {

        double sum=0;


        for (int i = 1; i <101 ; i++) {
            sum +=i;

        }

        System.out.println(sum);


        System.out.println("------------------------------------");

        int total=0;

        Scanner x=new Scanner(System.in);

        for (int r = 0; r <6 ; r++) {
            System.out.println("Enter a number: ");
            total += x.nextInt();


        }














    }
}
