package day34_GarbageCollection_AccesModidifiers;

import java.util.ArrayList;

public class Circle {
    public double radius;
    public static double pi;
    public static String name;

    //public static Sheet sheet; we will see in the future

    public static ArrayList<Integer> numbers= new ArrayList<>();
    // we can not add any object



    public Circle(double radius){
        this.radius=radius;
      //  pi=3.14; not going to give error but this is not correct;

    }

    static {
        pi=3.14;
        name="Circle";

        numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
    }







}
