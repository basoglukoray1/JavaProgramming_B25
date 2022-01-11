package day17_While_DoWhile;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);

        System.out.println("Enter your first number:");
        int num1= s.nextInt();

        System.out.println("Enter your second number:");
        int num2=s.nextInt();

        System.out.println("Enter a math operator:");
        char ch=s.next().charAt(0); //

        while (!(ch=='+'|| ch=='-')){
            System.err.println("Invalid Operator, Please re-enter");
            ch =s.next().charAt(0);
        }

        System.out.println(    (ch=='+')?num1+num2 : num1-num2);











    }
}
