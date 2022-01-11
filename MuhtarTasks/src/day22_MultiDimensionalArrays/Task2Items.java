package day22_MultiDimensionalArrays;

import java.util.Arrays;

public class Task2Items {
    public static void main(String[] args) {

        String[][] items = {
                {"Apple", "Banana", "Grape", "Avocado"},
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
        };


        for (String[] item1D : items) {
            for (String element : item1D) {
                System.out.print(element+" \t");
            }
            System.out.println();
        }
        System.out.println("********************************");

        for (String[] item1D : items) {

            for (int i = item1D.length - 1; i >= 0; i--) {
                System.out.print(item1D[i]+" \t");
            }
            System.out.println();
        }
        System.out.println("*************************");

        for (int i = items.length - 1; i >= 0; i--) {
            for (String element : items[i]) {
                System.out.print(element+"\t ");
            }
            System.out.println();
        }










    }



}
