package day21_ArraysUtility;

import java.util.Arrays;

public class BreaskfastTask {
    public static void main(String[] args) {

/*1. Write a program that can reverse a sentence
            Ex:
                sentence = "Today is a good day to learn Java";

            output:
                Java learn to day good a is Today
*/

        String sentence="Today is a good day to learn Java";

        String[] words=sentence.split(" ");

        String reverse="";
        for (int i = words.length - 1; i >= 0; i--) {
            reverse +=words[i]+" ";
        }


        System.out.println(reverse);








    }
}
