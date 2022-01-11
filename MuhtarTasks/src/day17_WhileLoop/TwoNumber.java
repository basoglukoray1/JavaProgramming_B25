package day17_WhileLoop;

import java.util.Scanner;

public class TwoNumber {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        System.out.println("Enter number 1");
        int num1= s.nextInt();
        System.out.println("Enter number 2");
        int num2=s.nextInt();
        System.out.println("Enter a operator:");
        char ch=s.next().charAt(0);



        while( !(ch=='+' || ch=='-' ||ch=='/' || ch=='*' ) ){
            System.err.println("Invalid operator Please re enter ");
            ch = s.next().charAt(0);

            if (ch=='+' || ch=='-' || ch=='/' || ch=='*' ){
                if(ch== '+'){
                    System.out.println(num1+num2);
                }else if(ch== '-'){
                    System.out.println(num1-num2);
                }
            }


            }



        }
}

