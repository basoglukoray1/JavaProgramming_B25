package day27_WrapperClasses.day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WarmUpTasks_InterviewQuestion {
    public static void main(String[] args) {

        /*
        1. write a program that can swap the first and last elements of an ArrayList of Integers
         */


        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));

        Collections.swap(list, 0, list.size()-1);

        System.out.println(list);

        System.out.println("==================================================");

        /*
        2. Write a program that can move all the zeros to the last indexes of ArrayList

                    Ex:
                        list: {1,0,2,0,3,0,4,0}

                    output:
                        [1, 2, 3, 4, 0, 0, 0, 0]
         */

        ArrayList<Integer> list2=new ArrayList<>(Arrays.asList(1,2,0,4,5,0,7,8,0));

        int size=list2.size();

        list2.removeAll(Arrays.asList(0));
        System.out.println(list2);

        int newSize= list2.size();

        int totalNumberOfZeros=size -newSize;

        for (int i = 0; i < totalNumberOfZeros; i++) {
            list2.add(0);
        }

        System.out.println(list2);

        System.out.println("===================================================");

       /*
       3. Write a program that can extract the special characters, digits and letters from a string and stores them into separate ArrayLists of Characters
                Ex:
                    str = "ABCD123$%#@&456EFG!"

                output:
                    list1: {1, 2, 3, 4, 5, 6}
                    list2: {A, B, C, D, E, F, G}
                    list3: {$, %, #, @, &, !}
        */

        System.out.println("===================================================");

        String str="ABCD123#$%#$%45EFG!";

        ArrayList<Character> ch1=new ArrayList<>();

        for (int i = 0; i< str.length() ; i++) {// Autoboxing
            ch1.add(str.charAt(i));
        }

        ArrayList<Character> letters=new ArrayList<>(ch1);

        letters.removeIf(p -> !(Character.isLetter(p))); //Lambda
        System.out.println(letters);


        ArrayList<Character> digits=new ArrayList<>(ch1);

        digits.removeIf(p -> !(Character.isDigit(p) ) );

        System.out.println(digits);

        ArrayList<Character> special= new ArrayList<>(ch1);

        special.removeIf(p -> Character.isLetterOrDigit(p));
        System.out.println(special);


    }
}
