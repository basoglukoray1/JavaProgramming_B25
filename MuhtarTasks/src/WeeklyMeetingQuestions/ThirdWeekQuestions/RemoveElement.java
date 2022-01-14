package WeeklyMeetingQuestions.ThirdWeekQuestions;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] array={10,20,30,40};

       int[] result=removeElement(array, 2);

        System.out.println(Arrays.toString(result));
    }

    public static int[] removeElement(int[] arr, int index){

        int[] arr1=new int[arr.length-1];

        int j=0;
        for (int i = 0; i < arr.length; i++) {
            if (i == index){
                continue;
            }else{
               arr1[j++]=arr[i];
            }
        }




        return arr1;

    }





}
