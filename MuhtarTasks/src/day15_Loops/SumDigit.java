package day15_Loops;

import java.util.Scanner;

public class SumDigit {
    public static void main(String[] args) {

        System.out.println("Enter your input:");
        String s=new Scanner(System.in).next();


        int sum=0;

        for (int i = 0; i <s.length() ; i++) {
            if (s.charAt(i)>='0' && s.charAt(i)<='9'){
                sum += s.charAt(i)-48;
            }
        }
        System.out.println("sum = " + sum);








    }
}
