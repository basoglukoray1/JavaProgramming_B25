package day21_ForEachLoop;

import java.lang.reflect.Array;
import java.util.Arrays;

public class InterviewQuestionMergeTwoArrays {
    public static void main(String[] args) {
       /* 1. write a program that can merge two arrays of integers
        Ex:
        arr1 = {1,2,3,4}
        arr2 = {5,6}

        output
                arr3 = {1,2,3,4,5,6}*/


        String[] group1={"Togrul","Nattaya","Nazir"};
        String[] group2={"Gorkhmaz","Ernie"};


        String[] students=new String[group1.length+group2.length];


        int i=0;
        for (String each : group1) {// Ali, Layan, Aysenur
                students[i++]=each;
        }

        for (String each : group2) {
               students[i++]= each;
        }

        System.out.println(Arrays.toString(students));



    }
}
