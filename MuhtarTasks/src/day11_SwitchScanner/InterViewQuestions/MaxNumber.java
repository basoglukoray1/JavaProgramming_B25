package day11_SwitchScanner.InterViewQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxNumber {
    public static void main(String[] args) {

        ArrayList<Integer> nums=new ArrayList<>(Arrays.asList(1,13,45,678,89));


        System.out.println(maxNumber(nums));

    }

    public static int maxNumber(ArrayList<Integer> numbers){


        int max= numbers.get(0);

        for (Integer each : numbers) {
            if (each > max) {
                max=each;

            }
        }

        return max;


    }




}
