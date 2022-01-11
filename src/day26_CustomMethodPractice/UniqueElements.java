package day26_CustomMethodPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class UniqueElements {
    public static void main(String[] args) {
        int[] arr={1,1,1,1,2,2,2,23,4,4,4,5,6,6643,5,3,23};
        int[] uniqueResult=uniqueElements(arr);
        System.out.println(Arrays.toString(uniqueResult));


    }
    // returns the uninque element of the array as a new array
    public static int[] uniqueElements(int[] array){
        int[] result={};// {1,2,3,4,4,6,7,8,8}

        for (int each : array) {

            if (ArraysUtility.frequencyOfElement(array, each) ==1 ){

               result = ArraysUtility.addElement(result ,each);
            }


        }
        return  result;
    }

    // returns the uninque element of the array as a new array
    public static double[] uniqueElements(double[] array){
        double[] result={};
        for (double each : array) {

            if (ArraysUtility.frequencyOfElement(array, each) ==1 ){
                result= ArraysUtility.addElement(result ,each);
            }

        }

        return  result;
    }

    // returns the uninque element of the array as a new array
    public static char[] uniqueElements(char[] array) {
        char[] result = {};
        for (char each : array) {

            if (ArraysUtility.frequencyOfElement(array, each) == 1) {
                result = ArraysUtility.addElement(result, each);
            }

        }
        return result;
    }

    // returns the uninque element of the array as a new array
    public static String[] uniqueElements(String[] array) {
        String[] result = {};
        for (String each : array) {

            if (ArraysUtility.frequencyOfElement(array, each) == 1) {
                result = ArraysUtility.addElement(result, each);
            }

        }
        return result;
    }











}