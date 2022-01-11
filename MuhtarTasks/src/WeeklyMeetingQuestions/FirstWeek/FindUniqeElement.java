package WeeklyMeetingQuestions.FirstWeek;

import java.util.Arrays;

public class FindUniqeElement {
    public static void main(String[] args) {

        String[] arr1={"Java", "C#", "Python", "Python", "Swift"};

        int length=0;

        String unique="";

        String[] result= new String[length];

        for (String each : arr1) {
            int frequency=0;

            for (String each2 : arr1) {
                if (each.equals(each2)){
                    frequency++;
                }

            }
                if (frequency==1){
                    length++;
                   unique += each+" ";
                }

        }

        result = unique.split(" ");

        System.out.println(Arrays.toString(result));















    }
}
