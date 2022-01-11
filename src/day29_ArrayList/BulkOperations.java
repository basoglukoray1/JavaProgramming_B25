package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {

        //ADDALL METHOD with asList method
        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,45,5,6,7,8));

        System.out.println(list);

        //REMOVE ALL METHODS

        list.removeAll(Arrays.asList(3,5,8));

        System.out.println(list);


        //RETAIN METHOds
        ArrayList<Integer> numbers=new ArrayList<>();

        numbers.addAll(Arrays.asList(1,2,3,4,5,6,8,7,9,1,2,3,4,5,6,7,7,7,2));

            numbers.retainAll(Arrays.asList(1,2,3));

        System.out.println(numbers);
        System.out.println("------------------------------");

        ArrayList<Integer> nums=new ArrayList<>();

        nums.addAll(Arrays.asList(10,20,30,40,50,607,706450,45,67));

        boolean r1=nums.contains(10);

        boolean r2= nums.containsAll(Arrays.asList(10,20,30,40,2));

        System.out.println(r1);
        System.out.println(r2);

        System.out.println("=======================================");

        String[] names={"Josh","Jack","Daniel","Shay","Breanna"};

        ArrayList<String> namesList=new ArrayList<>(Arrays.asList(names)); //only non primitive type can use like that

       // namesList.addAll( Arrays.asList(names) );

        System.out.println(namesList);
        System.out.println("=============================================");

        int[] arr2={1,2,3,4,5,6,7,8,9};

        ArrayList<Integer> list3=new ArrayList<>(convertArrayToArrayList(arr2));

        System.out.println(list3);

    }


    public static ArrayList<Integer> convertArrayToArrayList(int[] arrray){
        ArrayList<Integer> list = new ArrayList<>();

        for (Integer each : arrray) {
            list.add(each);
        }


        return list;

    }














}
