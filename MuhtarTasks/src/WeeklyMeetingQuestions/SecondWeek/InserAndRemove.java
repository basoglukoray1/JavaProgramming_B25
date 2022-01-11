package WeeklyMeetingQuestions.SecondWeek;

import java.util.Arrays;

public class InserAndRemove {
    public static void main(String[] args) {

        int[] arr1={10,20,30,40,50,120,12,12,12,12,23};
        int [] result= new int[arr1.length+1];
        int index=6;
        int j=0;
        for (int i=0; i< arr1.length; i++) {
            if (i==index){
                result[i]=100;

            }else{
                result[i]=arr1[j];
                j++;
            }
        }

      result[result.length-1]=arr1[arr1.length-1];


        System.out.println(Arrays.toString(result));









    }
}
