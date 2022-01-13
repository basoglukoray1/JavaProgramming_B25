package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstUniqueElement_InterviewQuestioon {
    public static void main(String[] args) {


        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(10,12,10,225,15,120,12));

        int result=0;
        for (Integer each1 : list) {

            int frequency = 0;
            for (Integer each2 : list) {
                if (each2 == each1) {
                    frequency++;
                }

            }

            if (frequency==1){
                result = each1;
                break;
            }

        }
        System.out.println(result);













    }
}
