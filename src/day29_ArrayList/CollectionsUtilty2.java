package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtilty2 {
    public static void main(String[] args) {

        ArrayList<Integer> list3=new ArrayList<>();
        list3.addAll(Arrays.asList(10,9,8,70,60,50,430,70,10));

        Collections.replaceAll(list3, 10,2000000);
        System.out.println(list3);

        System.out.println("+===================================================");

        int frequency=Collections.frequency(list3, 70);

        System.out.println(frequency);
        System.out.println("===============================");

        ArrayList<String> words=new ArrayList<>();
        words.addAll(Arrays.asList("Java","Java","Python","Python","Ruby","C#"));

           int countJava= Collections.frequency(words,"Java");
           int countPython=Collections.frequency(words,"Python");

            System.out.println("countJava = " + countJava);
            System.out.println("countPython = " + countPython);













    }
}
