package day28_ArrayList;

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {

      /*  2. write a program that can swap the first and last elements of an integer arraylist
        ex:
        list = [1,2,3,4,5];
        output: [5,2,3,4,1]; */

        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        ArrayList<Integer> reverse=new ArrayList<>();
        for (int i = list.size(); i > 0; i--) {
            reverse.add(i);
        }

        System.out.println(reverse);











    }
}
