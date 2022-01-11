package day21_ForEachLoop;

import java.util.Arrays;

public class ForEachLoopIntro {
    public static void main(String[] args) {

        int[] numbers={10,20,30,40,50,60,70};

        int each=0;
        for (int i = 0; i < numbers.length ; i++) {
            each = numbers[i];
        }


        System.out.println(each);

        System.out.println("================================");

        for (int eachNo : numbers) {
            System.out.print(eachNo+" ");
        }






    }
}
