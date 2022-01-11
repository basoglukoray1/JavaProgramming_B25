package day22_MultiDimensionalArrays;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {

        int[][] array = { {1,2,3}, {4,5,6}}; //  { { 4,5,6}, {1,2,3}}
        int[][] reverse=new int[array.length][array[0].length];

        for (int i = array.length-1, j=0; i >= 0; i--,j++) {//  { { 4,5,6}, {1,2,3}}

            for (int k = array[i].length-1 ,z=0; k >= 0; k--,z++) {// { { 6,5,4},{3,2,1}

                    reverse[j][z] = array[i][k];
                //j=//1,2//3 times
            }


        }
        System.out.println(Arrays.deepToString(reverse));



/*
1. Write a program that can reverse a two dimensional array (return new array)
		Ex:
			array = { {1,2,3}, {4,5,6}};


		output:
			reverse = { {6,5,4}, {3,2,1},}; // 6 5 4 3 2 1
 */








    }
}
