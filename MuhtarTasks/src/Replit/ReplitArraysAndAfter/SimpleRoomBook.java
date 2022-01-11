package Replit.ReplitArraysAndAfter;

import java.util.Scanner;

public class SimpleRoomBook {
    public static boolean simpleRoomBook(boolean isAvailable,int month, int day, int year){
        // your code here
        boolean booking=false;
        if (year==2018 && isAvailable==true){
            if (month==7 && (day>=1 && day<=8) ){
                booking=false;
            }else{
                booking=true;
            }
        }else{
            booking=false;
        }

    return booking;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(simpleRoomBook(in.nextBoolean(), in.nextInt(), in.nextInt(), in.nextInt()));

    }
}
