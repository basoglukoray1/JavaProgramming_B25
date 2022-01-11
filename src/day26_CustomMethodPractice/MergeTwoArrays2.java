package day26_CustomMethodPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class MergeTwoArrays2 {
    public static void main(String[] args) {

    int[] arr1={1,2,3,4,5};
    int[] arr2={3,4,56,6,7};

    int[] arr3=merge(arr1,arr2);

        System.out.println(Arrays.toString(arr3));
    }

    // merges to given to arrays and adds in the new array
    public static int[] merge(int[] arr1, int[] arr2){
        int[] result={};

        for (int each : arr1) {
            result=ArraysUtility.addElement(result,each);
        }
        for (int each : arr2) {
            result=ArraysUtility.addElement(result,each);
        }



    return result;

    }


    // merges to given to arrays and adds in the new array
    public static double[] merge(double[] arr1, double[] arr2){
        double[] result={};

        for (double each : arr1) {
            result=ArraysUtility.addElement(result,each);
        }
        for (double each : arr2) {
            result=ArraysUtility.addElement(result,each);
        }



        return result;

    }


    // merges to given to arrays and adds in the new array
    public static char[] merge(char[] arr1, char[] arr2){
        char[] result={};

        for (char each : arr1) {
            result=ArraysUtility.addElement(result,each);
        }
        for (char each : arr2) {
            result=ArraysUtility.addElement(result,each);
        }



        return result;

    }

    // merges to given to arrays and adds in the new array
    public static String[] merge(String[] arr1, String[] arr2){
        String[] result={};

        for (String each : arr1) {
            result=ArraysUtility.addElement(result,each);
        }
        for (String each : arr2) {
            result=ArraysUtility.addElement(result,each);
        }



        return result;

    }




}
