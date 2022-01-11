package day22_MultiDimensionalArray;

import java.util.Arrays;

public class IteratingMutliDimensionalArrays2 {
    public static void main(String[] args) {
        int[][] arr2D = { {1,2,3} , {4,5,6,7}, {8,9,10,11,12}  };

        for (int i = arr2D.length - 1; i >= 0; i--) {// i: inedex number of1Darrays starting from last index to 0
            for (int j = 0; j < arr2D[i].length; j++) { //j: inex number of elementsfrom0 to last index

                System.out.print(arr2D[i][j]+" ");


            }
            System.out.println();
        }














    }
}
