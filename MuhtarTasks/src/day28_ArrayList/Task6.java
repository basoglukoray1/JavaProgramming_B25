package day28_ArrayList;

import java.util.ArrayList;

public class Task6 {
    public static void main(String[] args) {

/*
6. Write a program that can find the minimum number from an ArrayList of integers
		Ex:
			list = [1,2,3,4,5];
			output:
				1
 */
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        Integer min=Integer.MAX_VALUE;
        for (Integer each : list) {
            if (each<min){
                min=each;
            }
        }

        System.out.println(min);









    }
}
