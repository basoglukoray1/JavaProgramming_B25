package day01_JavaIntro;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        // 1 1 2 3 5 8 13 21 34        index 6==> 8  index 7 ===> 13
        int n=1, m=1, temp=0;

        for (int i = 2; i <2 ; i++) {
           temp=n+m;
           n=m;
           m=temp;
        }

        System.out.println(temp);

        int number = 8;

        int num1=0;
        int num2=1;
        int result=0;

        System.out.println(num1); // 0
        System.out.println(num2); // 1

        for(int i=2;i<number;i++){
            result=num1+num2; // 0+1=1, result=2, result=2+3=5, result=8, result=13
            System.out.println(result);
            num1=num2; //num1=1, num1=1, num1=2, num1=3, num1=5
            num2=result; //num2=1, num2=2, num2=3, num2=5, num2 = 8
        }


        // 0, 1, 0+1=1 , 1+1=2, 1+2=3, 2+3=5, 3+5=8, 5+8=13





/* Create a program that will give you the Fibonacci numbers up to the x value.
                           Fibonacci is a sequence of number starting from 0, 1 where the following numbers are the sum of the previous 2 numbers
                           Note: Fibonacci numbers are read as index values, so the 0th Fibonacci is 0, 1st value is 1, 2nd value is 1, etc
                          Ex:
                             Input:
                               8
                             Output:
                               0, 1, 1, 2, 3, 5, 8, 13
                         */








    }
}
