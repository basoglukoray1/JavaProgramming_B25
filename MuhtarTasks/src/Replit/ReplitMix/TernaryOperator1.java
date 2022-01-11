package Replit.ReplitMix;

import java.util.Scanner;

public class TernaryOperator1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a Number");
        int number= s.nextInt();
        String result=(number>=5)?number+"": "-"+ number+" is less than 5";
        System.out.println(result);
    }
}
