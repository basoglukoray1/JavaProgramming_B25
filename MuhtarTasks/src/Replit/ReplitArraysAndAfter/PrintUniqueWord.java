package Replit.ReplitArraysAndAfter;

import java.util.Scanner;

public class PrintUniqueWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        String[] words = new String[size];
        for(int i=0; i < size; i++){
            words[i] = scan.next();
        }
        printUniqueWords(words);
    }

    public static void printUniqueWords(String[] words){
        //WRITE YOUR CODE HERE
        for (String each : words) {
            int frequency=0;
            for (String each2 : words) {
                if (each.equals(each2)){
                    frequency++;
                }
            }

            if (frequency==1){
                System.out.println(each);
            }


        }

    }
}
