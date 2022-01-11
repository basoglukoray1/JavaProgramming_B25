package day21_ForEachLoop;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        String str="Java";

        for ( char each    : str.toCharArray()) {
            System.out.print(each);
        }


        System.out.println("================================");

        String email="WoodenSpoon@cydeo.com";

        String[] arr=email.split("@");

        System.out.println(Arrays.toString(arr));

        String s="Today is nice day. Today is Monday. Today we learn Java.";

        String[] sentences = s.split("\\. ");

        System.out.println(Arrays.toString(sentences));







    }
}
