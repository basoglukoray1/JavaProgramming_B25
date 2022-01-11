package Replit.ReplitMix;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.println("Enter cents:");
        int amount= s.nextInt();
        int quarter=amount/25;
        int dimes=amount%quarter%10;
        int nickels=(amount%quarter)%dimes%5;
        int pennies=amount%quarter%dimes%1;
        if(amount>=0&&amount<=100){
            System.out.println("Your change is "+ quarter+" quarters, "+dimes+" dimes, "+ nickels+ " nickels, and "+pennies+" pennies");
        }else{
            System.out.println("Invalid cents amount");
        }
    }
}
