package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods2 {
    public static void main(String[] args) {


        ArrayList<Integer> list= new ArrayList<>();

        list.add(100);
        list.add(200);
        list.add(200);
        list.add(100);
        list.add(300);
        list.add(400);
        list.add(500);


        System.out.println(list);
        /*
        int num1=1;
        list.remove(num1);*/

        Integer num=200;
       // list.remove(200); there is no such a index as a 200 will give exception
        boolean r=list.remove(num);

        System.out.println(list);
        System.out.println(r);

        System.out.println("============================================");

        System.out.println(list.size());

        list.clear();

        System.out.println(list);

        ArrayList<Character> characters=new ArrayList<>();

        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');

       int first= characters.indexOf('A');
       int last= characters.lastIndexOf('A');

        System.out.println(first);
        System.out.println(last);
        System.out.println("======================================");

        boolean r2=characters.contains('A');

        boolean r3=characters.contains('Z');

        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);

        ArrayList<Integer> list1= new ArrayList<>();
        list1.add(100);
        list1.add(100);
        list1.add(100);

        ArrayList<Integer> list2= new ArrayList<>();
        list2.add(100);
        list2.add(100);
        list2.add(100);

        System.out.println(list1.equals(list2));

    }
}
