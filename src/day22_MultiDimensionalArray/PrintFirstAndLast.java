package day22_MultiDimensionalArray;

import java.util.Arrays;
import java.util.Scanner;

public class PrintFirstAndLast {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine()};

        String elements = "";
        for (String each : words) {
            elements += each.substring(0,1)+""+each.substring(each.length()-1)+"\n";

        }

        System.out.println(elements);




    }}