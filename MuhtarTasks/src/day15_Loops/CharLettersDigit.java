package day15_Loops;

import java.util.Scanner;

public class CharLettersDigit {
    public static void main(String[] args) {
        System.out.println("Enter your input");

        /*String input=new Scanner(System.in).next();

        String letter="";
        String digit="";
        String special="";


        for (int i = 0; i <=input.length()-1 ; i++) {
            if ((input.charAt(i)>='a' && input.charAt(i)<='z') || (input.charAt(i)>='A' && input.charAt(i)<='Z')){
                letter+=input.charAt(i);
            }else if(input.charAt(0)>='0'&&input.charAt(0)<='9'){
                digit+=input.charAt(i);
            }else{
                special+=input.charAt(i);
            }

            System.out.println("special = " + special);
            System.out.println("digit = " + digit);
            System.out.println("letter = " + letter);

        }*/
        System.out.println("Enter a string");
        String str = new Scanner(System.in).next();
        String letters = "";
        String digits = "";
        String specialChars = "";

        // cydeo@@123

        for (int i = 0; i <= str.length()-1 ; i++) {

            if ((str.charAt(i) >= 'a' && str.charAt(i) <= 'z') || (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')){
                letters += str.charAt(i);//c y d e o
            }else if (str.charAt(i) >= '0' && str.charAt(i) <= '9'){
                digits += str.charAt(i);
            }else {
                specialChars += str.charAt(i);
            }

        }
        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specialChars = " + specialChars);















    }
}
