package day17_WhileLoop;

import java.util.Scanner;

public class Operators_InterviewQuestion {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        System.out.println("Enter number 1:");
        int n1=s.nextInt();
        System.out.println("Enter number 2:");
        int n2=s.nextInt();

        int multiplication=0;

      /* while (n2>0){
           n2--;

           multiplication += n1;

       }
        System.out.println(multiplication);

        System.out.println("--------------------");*/
        int divide=0;
        while (n1>=n2){
                //10-6
            n1 -= n2;
            divide++;
        }
        System.out.println(divide);






    }
}
