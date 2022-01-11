package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueElements {
    public static void main(String[] args) {


        ArrayList<Integer> list1=new ArrayList<>();
        list1.addAll(Arrays.asList(1,2,1,2,3,3,3,4,4,4,5,5,5,6,6,7,7,8,8,8,9,10,11));

        ArrayList<Integer> unique=new ArrayList<>();

        for (Integer each : list1) {
            int frequency=Collections.frequency(list1, each);
            if (frequency==1){
                unique.add(each);
            }
        }
        System.out.println(unique);
        System.out.println("=============================================");

        //Second Solution

        ArrayList<Integer> list2=new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,1,2,3,3,3,4,4,4,5,5,5,6,6,7,7,8,8,8,9,10,11));

        ArrayList<Integer> unique2=new ArrayList<>(list2); // add all the elements of list2


        unique2.removeIf(each -> Collections.frequency(list2,each)>1);

        System.out.println(unique2);











    }
}
