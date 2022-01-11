package day15_Loops;

import java.util.Scanner;

public class SumOfFactorial {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
       long input=scan.nextInt();


        int sum=1;

        for (long i=input; i >0 ; i--) {
            sum*=i;
        }
        System.out.println("sum = " + sum);










    }
}
