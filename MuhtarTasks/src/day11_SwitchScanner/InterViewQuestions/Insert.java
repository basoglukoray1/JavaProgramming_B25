package day11_SwitchScanner.InterViewQuestions;

import java.util.Arrays;
import java.util.Optional;

public class Insert {

    public static int[] insertNumber(int[] arr, int index, int num){
        int[] result=new int[arr.length+1];
        int j=0;
        for (int i = 0; i < arr.length; i++) {
            result[j++]= arr[i];
            if (j==index){
                result[j++]=num;
            }

        }

           // result[result.length-1]= arr[arr.length-1];

        return result;

    }

    public static void main(String[] args) {
        int[] arr1= {10,20,30,40};

        int[] result2=insertNumber(arr1, 2, 100);

        System.out.println(Arrays.toString(result2));

    }


}
