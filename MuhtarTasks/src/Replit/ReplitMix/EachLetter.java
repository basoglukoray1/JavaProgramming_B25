package Replit.ReplitMix;



import java.util.Scanner;

public class EachLetter {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String word = inp.nextLine();
        //write your code below
        String each = "";
        for (int i = 0; i < word.length(); i++) {
            each += word.charAt(i) + "\n";

        }
        System.out.println(each);
    }
}