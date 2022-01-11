package WeeklyMeetingQuestions.SecondWeek;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] arr1={1,2,0,4,50,0,506,0};

        int [] result= new int[arr1.length];

        int index=0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > 0) {
                result[index++] = arr1[i];
            }
        }
        System.out.println(Arrays.toString(result));

    }
}
