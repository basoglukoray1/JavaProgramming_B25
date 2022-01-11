package WeeklyMeetingQuestions.FirstWeek;

import java.util.Arrays;

public class ReturnSumOfTwoElements {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5,7,9,8};

        int[] result2=sumOfElements(arr1, 15);


        System.out.println(Arrays.toString(result2));

    }

    public static int[] sumOfElements(int[] nums,int target){
        // int[] num= {1,2,3,4,4,5}  ===> target = 8;
        // int[] outut= [ index1 , index2]
        int[] result=new int[2];
        for (int i = 0; i < nums.length; i++) {

            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target && i != j) {
                        result[1] = i;
                        result[0] = j;

                }

            }
    }


        return result;

}


}
