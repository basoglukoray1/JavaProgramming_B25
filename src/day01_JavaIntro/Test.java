package day01_JavaIntro;

import day24_CustomMethod_Returm.ReturnMethodIntro;
import day24_CustomMethod_Returm.ReturnMethodPractice4;

public class Test {
    public static void main(String[] args) {
        String str="aaaaaaaaabbbbbbbbbbbbbbbbbbcccccccccccc";

        str=ReturnMethodPractice4.removeDuplicates(str);

        System.out.println(str);

        String name="Java Programming";

        name=ReturnMethodIntro.reverse(name);

        System.out.println(name);



    }

}
