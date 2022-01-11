package day22_MultiDimensionalArrays;

import java.util.Arrays;

public class Task1Reverse {
    public static void main(String[] args) {

       // 1. Write a program that can reverse a two dimensional array (return new array)

        int[][] array = { {1,2,3}, {4,5,6}};


        int[][] reversed = new int[array.length][array[0].length];

        for (int i = array.length - 1,j=0; i >= 0; i--,j++) {// i finds the index number of 1D arrays from last to 0

            for (int k = array[i].length-1,l=0; k>=0; k--,l++ ){ // k finds the index number of elements from last  to 0

                     reversed[j][l]=array[i][k];


            }
        }
        System.out.println(Arrays.deepToString(reversed));







    }
}
