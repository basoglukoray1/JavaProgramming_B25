package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethod1 {
    public static void main(String[] args) {


        ArrayList<Integer> numbers =  new ArrayList<>();

       numbers.add(10);
       numbers.add(15);
        numbers.add(16);
        numbers.add(168);

        numbers.add(2,25);
        numbers.add(5,45);

        System.out.println(numbers);

        System.out.println(numbers.size());

        int lastIndex= numbers.size()-1;

        System.out.println(lastIndex);

        Integer anyObject=numbers.get(4);

        System.out.println(anyObject);

        System.out.println("===============================");

        for (int i = 0; i <=numbers.size()-1 ; i++) {
            System.out.print(numbers.get(i)+" ");

        }
        System.out.println("-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

       ArrayList<String> list=new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("Java");
        list.add("C#");
        list.add("Ruby");

        System.out.println(list);

        list.set(2,"JavaScript");
        list.set(3,"C++");

        System.out.println(list);

        System.out.println("================================");

        ArrayList<String> employees=new ArrayList<>();

        employees.add("Ernie");
        employees.add("Koray");
        employees.add("NAzir");
        employees.add("Nattaya");
        employees.add("Gorkhmaz");
        employees.add("Selma");
        employees.add("Tania");

        System.out.println(employees);

        employees.remove(1);
        employees.remove(2);
        employees.remove(0);
        employees.remove(1);


        System.out.println(employees);

        employees.remove(employees.size()-1);

        System.out.println(employees);












    }
}
