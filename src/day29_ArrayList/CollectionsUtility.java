package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {
    public static void main(String[] args) {

        //SORT METHOD
        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(10,9,8,7,6,5,43,2,1));


        Collections.sort(list);

        System.out.println(list);
        System.out.println("==================================================");

        //REVERSE METHOD

        ArrayList<Character> list2=new ArrayList<>();

        list2.addAll(Arrays.asList('a','b','c','d','f','e'));

        Collections.reverse(list2 );
        System.out.println(list2);
        System.out.println("==============================");

        //SWAP METHOD
        ArrayList<Integer> list3=new ArrayList<>();
        list3.addAll(Arrays.asList(10,9,8,70,60,50,430,20,10));

        Collections.swap(list3,1,5);

        System.out.println(list3);

        int max=Collections.max(list3);
        int min=Collections.min(list3);

        System.out.println(max);
        System.out.println(min);
















    }
}
