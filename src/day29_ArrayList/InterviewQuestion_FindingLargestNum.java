package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class InterviewQuestion_FindingLargestNum {
    public static void main(String[] args) {

/*
1. write a program that can return the nth largest number from an arraylist

            arraylist = {1,2,3,4,5,6,7, 7 ,8, 8}
            n = 5

            output:
                4
 */
        ArrayList<Integer> nums=new ArrayList<>();
        nums.addAll(Arrays.asList(1,2,4,3,13,6,9,8));

       ArrayList<Integer> result=new ArrayList<>(); // 13 , 9 , 8 , 6, 4, 3, 2, 1
      /*  int n=2;
       for (int i = 1; i <n ; i++) {
            nums.removeIf(p -> Collections.max(nums) == p);

        }

        int max= Collections.max(nums);

        System.out.println(max);*/

        int n=3;

        int max=Collections.max(nums);

        for (int i = 0; i < nums.size(); i++) {
            if ( i >max){
                max=i;
                if (i==max){

        }

        }
        }

        result.add(max);

        System.out.println(result);  // result = [13]









    }
}
