package day16_Loops;


import java.util.Scanner;

public class FrequencyOfChar {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scan.nextLine();
        System.out.println("Enter a character");
        String ch = scan.next();
        int count = 0;

        for (int i = 0; i <= word.length() - 1; i++) {
            char checkChaOneByOne = word.charAt(i);
            if (word.contains(ch)) {
                int howManyTargetedCharWordContains = word.indexOf(ch);
                if (howManyTargetedCharWordContains > 1) {
                    count++;
                }

            }

        }
        System.out.println(count);


    }

}