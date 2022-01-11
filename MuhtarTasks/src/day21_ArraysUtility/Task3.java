package day21_ArraysUtility;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {

        /*
        3. Write a program that can print out the common elements from two integer array
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}

          output:
              4 5


          MUST use for each loops
         */

        int[] arr1= {1,2,3,4,5};
        int[] arr2={4,5,6,7,8};



        String common = "";
        for (int each : arr1) {
            for (int i : arr2) {
                if (each == i) {
                    common += i+" ";
                }
            }
        }

        System.out.println(common);














    }
}
