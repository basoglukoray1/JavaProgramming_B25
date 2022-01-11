package Replit.ReplitArraysAndAfter;

import java.util.Scanner;

public class WaterTax {
    public static double waterTax(double units){
        double bill = 0.0;

        //your code here
        if (units>50){
            bill =units*0.90;

            if(bill >=100 && bill<=150){
                bill += 50;
            }
             if (bill>150){
                 bill +=100;
             }


        }else{
            bill = units*0.60;

        }





        //end your code here

        return bill;
    }//end waterTax

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(waterTax(in.nextDouble()));
    }
}
