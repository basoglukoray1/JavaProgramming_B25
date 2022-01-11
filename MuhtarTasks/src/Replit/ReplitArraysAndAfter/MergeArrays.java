package Replit.ReplitArraysAndAfter;

import java.util.Arrays;


public class MergeArrays {
    public static int[] mergR(int[] a,int[] b) {
        int[] result = new int[a.length+b.length];
        int i=0;
        for (int each:a){
            result[i++] = each;
        }
        for (int each:b){
            result[i++] = each;
        }
        return result;

    }





    public static void main(String[] args) {

        int[] arr1={1,2,3};
        int[] arr2={4,5,6};



        System.out.println(Arrays.toString(mergR(arr1,arr2)));
    }
}
