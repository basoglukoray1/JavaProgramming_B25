package Replit.ReplitMix;

import java.util.Scanner;

public class VehicleRecall {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.println("Enter vehicle's year:");
        int year= s.nextInt();

        switch (year){
            case 1995:
            case 1996:
            case 1997:
            case 1998:
            case 2001:
            case 2002:
            case 2004:
            case 2005:
            case 2006:
                System.out.println("Your vehicle needs to be recalled!");
                break;
            default:
                System.out.println("your vehicle is fine, enjoy!");
        }








    }
}
