package day24CustomMethods;

import java.util.Arrays;

public class Task2_Anagram {
    public static void main(String[] args) {
    anagram("abbc","bcba");


    }

    public static void anagram(String str1,String str2){

        char[] ch1=str1.toCharArray();
        char[] ch2= str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

       boolean isAnagram= Arrays.equals(ch1, ch2);

        System.out.println(isAnagram);
    }











}
