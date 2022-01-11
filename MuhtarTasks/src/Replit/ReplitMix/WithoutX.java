package Replit.ReplitMix;



import java.util.Scanner;

public class WithoutX {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODES


        String first=word.charAt(0)+"";
        String last=word.charAt(word.length()-1)+"";
        String wo=word.substring(1, word.length()-1);
        if (first.equalsIgnoreCase("x")&&last.equalsIgnoreCase("x")){
            System.out.println(wo);

        }else{
            System.out.println(word);
        }







    }
}
