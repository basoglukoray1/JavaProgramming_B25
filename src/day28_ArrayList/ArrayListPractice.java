package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {

        ArrayList<Integer> nums=new ArrayList<>();


           nums.add(10);
            nums.add(20);
            nums.add(30);
            nums.add(40);
            nums.add(50);

            System.out.println(nums);

        for (int i = 0; i < nums.size(); i++) {
            nums.set(i, nums.get(i)*2);

        }
        System.out.println(nums);




   /*
   {1,2,3,4,5,6}

   {2,3,6,8,10,12}
    */









    }
}
