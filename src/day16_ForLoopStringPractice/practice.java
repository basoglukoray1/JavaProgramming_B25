package day16_ForLoopStringPractice;

import java.util.Scanner;

public class practice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your favorite movie: ");
        String str = scan.nextLine();

        // V for Vendetta
        // 01234567890123

        String modify= str.substring(0,5);
        String reverse = "";
        for (int i = modify.length()-1; i >=0 ; i--) {
            reverse += str.charAt(i);
        }

        System.out.println(modify);
        System.out.println(reverse);

        ;
















    }
}
