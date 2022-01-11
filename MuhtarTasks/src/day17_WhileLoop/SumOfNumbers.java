package day17_WhileLoop;



import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);


        int num1=0;
        int sum=0;
       while(num1 >= 0){


           System.out.println("Enter a number:");
          num1= s.nextInt();// 1 2 3

           if(num1<0){
               break;
           }

           sum += num1;

       }

        System.out.println("sum = " + sum);










    }
}
