package day27_WrapperClasses.day30_CustomClass;


import utilities.ArraysUtility;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {

        int[] arr1={1,23,4,5,6};

        int[] result2=swap(arr1, 1,3);
        System.out.println(Arrays.toString(result2));


    }


    public static int[] swap(int[] array, int i, int j){

     int[] result=new int[array.length];

        result=array;

        int temp=result[i];

        result[i]= result[j];

        result[j]=temp;

        return result;

      /*  int[] result=new int[array.length];
        result=array;
        for (int m = 0; m < array.length; m++) {
            //result = ArraysUtility.addElement(array, m);
            result[i] = array[i];
        }

        for (int g = 0; g < array.length-1; g++) {
            result[j]=array[i];

        }
        result[i]=array[j];
        return result;*/


    }






}
