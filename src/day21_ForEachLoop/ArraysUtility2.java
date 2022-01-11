package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility2 {
    public static void main(String[] args) {
        //******************* copyOf() METHODDDDD*****************

        String[] students={"Elif","Sinem","Gunay","Cihad","David","James","Aaron","Daniel"};

        String[] earlyBirds= Arrays.copyOf(students,3);

        System.out.println(Arrays.toString(earlyBirds));

        int[] numbers={1,2,3,4,5,6,7,8,9,10};

        int[] first5=Arrays.copyOf(numbers,5);

        System.out.println(Arrays.toString(first5));
        System.out.println("------------------------------");
        //****************** copOfRange METHODDDDDDDDDDD***************

        char[] ch1={'A','B','C','D','E','F','G','H','I'};
        char[] ch2=Arrays.copyOfRange(ch1, 2,6);
        System.out.println(Arrays.toString(ch2));

        System.out.println("---------------------");

        int[] scores={10,20,30,40,50,60,70,80,90,100};
        int[] score2=Arrays.copyOfRange(scores, 3 ,7+1);
        System.out.println(Arrays.toString(score2));








    }
}
