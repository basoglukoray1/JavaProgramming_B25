package day24CustomMethods;

public class Task4_Palindrome {
    public static void main(String[] args) {
    palindrome("LeVel");


    }


    public static void palindrome(String word){

        String result="";
        String reverse="";
        for (int i = 0; i < word.length() ; i++) {

            result+=word.charAt(i);
        }
        for (int j = word.length()-1; j >=0 ; j--) {
            reverse+=word.charAt(j);
        }
     boolean whatIs=result.equalsIgnoreCase(reverse);


        System.out.println(whatIs);
    }







}
