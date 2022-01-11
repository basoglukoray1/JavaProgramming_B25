package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfMethods {
    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,87,89,9,0,0));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,87,89,9,0,0));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,87,89,9,0,0));

        System.out.println(list);

       /* for (int i = 0; i < list.size(); i++) {
                if (list.get(i)%2 != 0){
                    list.remove(i);
                }
        }*/
        System.out.println(list);

        list.removeIf( p -> p < 5 );//Lambda Expression

        System.out.println(list);

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");

        ArrayList<Integer> list2=new ArrayList<>();

        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,90,0));

        list2.removeIf(p -> p%2==0);

        System.out.println(list2);














    }
}
