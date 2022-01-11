package day29_ArrayList;

import utilities.ArraysUtility;
import utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class RemoveIfPractice {
    public static void main(String[] args) {


        ArrayList<String> list3= new ArrayList<>(Arrays.asList("Java","Python","JavaScript","C#","C++","Java","Java"));

        list3.removeIf(each -> each.startsWith("J"));

        System.out.println(list3);

        System.out.println("===============================================");

        ArrayList<String> names=new ArrayList<>();

        names.addAll(Arrays.asList("Anna","Racecar","Level", "eye","Java","python"));

        names.removeIf(each -> StringUtility.isPalindrome(each));
        System.out.println(names);











    }
}
