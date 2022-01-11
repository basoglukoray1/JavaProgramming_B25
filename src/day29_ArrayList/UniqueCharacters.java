package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueCharacters {
    public static void main(String[] args) {


        String str= "aaabcccccdeeeeef";

        str.split("");

        ArrayList<String> list=new ArrayList<>(Arrays.asList(str.split("")));


        System.out.println(list);

        String uninque="";


        for (String each : list) {
            int frequency= Collections.frequency(list,each);
            if (frequency==1){
            uninque += each+" ";
        }}

        System.out.println(uninque);










    }
}
