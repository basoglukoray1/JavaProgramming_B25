package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Practice {
    public static void main(String[] args) {


        ArrayList<Integer> nums=new ArrayList<>(Arrays.asList(1,3,5,7,9,4,865456,3,1,5,152));


        for (Integer each : nums) {

           if( Collections.frequency(nums, each) == 1  ){
            System.out.println(each);
            break;
        }
        }


       // String unique="";

        ArrayList<Integer> result=new ArrayList<>();

        for (Integer each: nums) {
            if (Collections.frequency(nums,each) == 1){
                result.add(each); //

            }
        }


        System.out.println(result.get(result.size()-1));
































    }
}
