package day34_GarbageCollection_AccesModidifiers;

import day27_WrapperClasses.day30_CustomClass.Dog;

import java.util.ArrayList;


public class GarbageCollection {

    public static void main(String[] args) {

/*
       String str=null; // null for only non= primitives default value of all non primitives

        System.out.println(str.toUpperCase());
*/

        String str="WWooden Spoon"; // after line 17  "Wwoden spoon will be eligible for garbage collection
        str = null;

        System.out.println( str );



        Dog dog1=new Dog();
        dog1.name="Lucy";// it will be eligibile for garbage collection

          dog1  =  new Dog();
            dog1.name="Max";

        System.out.println(dog1);


        String str1= "Python";

           str1    =   "Java";

        System.out.println(str1);

        System.out.println("=========================== ");

        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(120);
        ArrayList<Integer> list2=list1;
        list2.add(130);
        list2.add(1659);
        list2.add(5465121);

        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list1 == list2);

        System.out.println("---------------------------------------------------------------");

        ArrayList<String> l1=new ArrayList<>();
        l1.add("JAva");

        ArrayList<String> l2=l1;
        l2.add("Python");


        System.out.println("l1 = " + l1);
        System.out.println("l2 = " + l2);


    }






}
