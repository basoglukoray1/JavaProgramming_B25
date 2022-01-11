package Replit.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class DeliveryCalc {
    public static int refuel_times(ArrayList<Integer> deliveries,int max_fuel) {
        //int howManyTimes=0;
        int count=0;

        for (Integer each : deliveries) {
            count += each;
        }
        int howManyTimes= count/max_fuel;
        int remainder=count%max_fuel;

        count=howManyTimes+remainder;


        return count;

    }



    // Do not touch below

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int fuel = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextInt());
        }

        System.out.println(refuel_times(list, fuel));

    }
}
