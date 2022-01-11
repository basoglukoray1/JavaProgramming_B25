package day25_CustomMethod_Overloading;

import utilities.ArraysUtility;

import java.util.Arrays;

public class TestArraysUtility {
    public static void main(String[] args) {

        int[] arr1={1,2,3,4,5};

        ArraysUtility.printEachElementsElements(arr1);

        System.out.println("________________________________________");

        System.out.println("================================");

        int[] n1={1,2,3,4,5,6};

        int max=ArraysUtility.maxNumber(n1);

        System.out.println(max);
        System.out.println("===================================================");

        int[] a1 ={ 1,2,3,4,5,6,7};

        boolean whatIs=ArraysUtility.contains(a1, 5);

        System.out.println(whatIs);





    }
}
