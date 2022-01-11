package day20_Arrays;

import java.util.Arrays;

public class ItemsTask {
    public static void main(String[] args) {
        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};

        int index=-1;


       /* for (int i = 0; i < items.length; i++) {
            if (items[i].equals("Gloves")) {
                index = i;
            }

        }
        System.out.println(index);*/

       /* boolean hasIpad=false;
        for (int j = 0; j < items.length ; j++) {
            if (items[j].equals("iPad")){
                hasIpad = true;
            }
        }

        System.out.println(hasIpad);*/

        int[] nums={1,12,345,13,2,5,6,8};
        int[] reverse=new int[nums.length];

        Arrays.sort(nums);
        int j = 0;
        for (int i = nums.length - 1 ; i >= 0; i--, j++) {
            reverse[j] = nums[i];
        }

        System.out.println(Arrays.toString(nums));
        System.out.println("--------------------------");



        System.out.println(Arrays.toString(reverse));






    }
}
