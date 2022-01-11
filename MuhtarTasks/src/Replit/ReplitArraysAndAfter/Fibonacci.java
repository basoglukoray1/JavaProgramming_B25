package Replit.ReplitArraysAndAfter;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = scan.nextInt();
        fib(num);
    }

    public static void fib(int num){// 0,1,1,2,3,5,8,13,21
        //WRITE YOUR CODE HERE

        int n1=1;
        int n2=1;

        int n3=0;

        for (int i = 2; i <num; i++) {
            n3=n1+n2;
            n1=n2;
            n2=n3;

        }

        System.out.println(n3);

    }





















}
