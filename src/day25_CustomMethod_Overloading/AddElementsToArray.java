package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class AddElementsToArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
       int[] result= addInteger(arr,5);

       double[] arr2={2.5,2.4,2.42,2.67};
       double[] result2=addDouble(arr2, 2.5);

       char[] arr3={'a','b','c'};
       char[] result3=addchar(arr3,'c');

       String[] arr4={"Koray","Nattaya","SInan"};
       String[] result4=addString(arr4,"Suleyman");

        System.out.println(Arrays.toString(result3));
        System.out.println(Arrays.toString(result4));
        System.out.println(Arrays.toString(result2));
        System.out.println(Arrays.toString(result));
    }


    public static int[] addInteger(int[] nums, int num){

        int[] newArray=new int[nums.length+1];
                                    //5
        int i=0; // 0 1 2 3 4
        for (int each : nums) {     // int[] arr={1,2,3,4};  int num = 5
            newArray[i]=each;
            i++;
        }                   // { 1, 2, 3, 4 ,0}
        newArray[i]=num;        //{ 1, 2 ,3 ,4 5} // adding the given element to the last index of new array

        return newArray;

    }

    public static double[] addDouble(double[] array, double element){

        double[] newArr2=new double[array.length+1];

        int i=0;
        for (double each : array) {
            newArr2[i++]=each;
        }

            newArr2[i]=element;

 return newArr2;

    }

    public static char[] addchar(char[] array, char element){

        char[] newArr2=new char[array.length+1];

        int i=0;
        for (char each : array) {
            newArr2[i++]=each;
        }

        newArr2[i]=element;

        return newArr2;

    }
    
    public static String[] addString(String[] array, String element){

        String[] newArr2=new String[array.length+1];

        int i=0;
        for (String each : array) {
            newArr2[i++]=each;
        }

        newArr2[i]=element;

        return newArr2;

    }


}
