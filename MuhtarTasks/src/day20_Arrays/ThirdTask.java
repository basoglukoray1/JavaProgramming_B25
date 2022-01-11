package day20_Arrays;

import java.util.Arrays;

public class ThirdTask {
    public static void main(String[] args) {

        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};

        int index=0;
        boolean contain=true;
        String eachitems="";
        for (int i = 0; i < items.length; i++) {
            if (items[i].equals("Glove")){
                System.out.println("The first index of Glove is: "+ i);
            }
            }

        boolean hasIpad=false;
        for (int i = 0; i < items.length; i++) {
            if (items[i].equals("iPad")){
                hasIpad=true;
            }
            System.out.println("hasIpad = " + hasIpad);
        }











    }
}
