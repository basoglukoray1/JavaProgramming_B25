package day29_ArrayList;

import java.util.ArrayList;

public class FirstUniqueElement_InterviewQuestioon {
    public static void main(String[] args) {


        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(200);
        list.add(10);
        list.add(30);

        System.out.println(list);

        for (Integer each1 : list) {

            int frequency = 0;
            for (Integer each2 : list) {
                if (each2 == each1) {
                    frequency++;
                }

            }

            if (frequency==1){
                System.out.println(each1);
                break;
            }

        }













    }
}
