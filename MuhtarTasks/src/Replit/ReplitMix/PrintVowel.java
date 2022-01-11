package Replit.ReplitMix;

import java.util.Scanner;

public class PrintVowel {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String word = inp.nextLine();
        //write your code below
        String result="";
        for (int i = 0; i <word.length() ; i++) {

            if (word.contains("a") || word.contains("e") || word.contains("i")||word.contains("o") ||word.contains("u"))   {

            if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u'){
                result += word.charAt(i)+"";
            }}
        }
        System.out.println(result);
    }
}
