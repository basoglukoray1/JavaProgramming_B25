package day01_JavaIntro;

import java.util.ArrayList;
import java.util.function.BinaryOperator;

public class IsAnagramWithoutSort {
    public static void main(String[] args) {

    }

    static boolean isAnagram(String str, String str1) {
        // str=listen  str1=silent

        //
        boolean isAnagram = false;
        // convert the two strign in a array list
        ArrayList<Character> list1 = new ArrayList<>();  //{s, i, l}
        ArrayList<Character> list2 = new ArrayList<>();

        if (str.length() != str1.length())
            return false;

        for (int i = 0; i < str.length(); i++) {
            list1.add(str.charAt(i));
            list2.add(str1.charAt(i));
        }

        if (list1.containsAll(list2)) {
            return true;
        }
        // we will use containsALl to determin if all memeber ahre in both arrays.
        // return the result}
        return isAnagram;
    }
}
