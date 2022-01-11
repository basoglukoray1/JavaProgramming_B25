package day20_Arrays;

import java.util.Arrays;

public class ArraysPractice1 {
    public static void main(String[] args) {

        //store the elements: 10,20,50,70;

        int[] elements={10 , 20 , 50, 70};


        System.out.println(Arrays.toString(elements));

        System.out.println("-------------------------");

        int[] scores=new int[5];
        scores[1]=85;
        scores[scores.length-1]=95;
        scores[3]=75;
        scores[0]=65;
        scores[2]=55;

        System.out.println(Arrays.toString(scores));//[0,85,0,0,95]

        System.out.println("-----------------------------------------");

        String[] months={"Jan","Feb","Mar","apr","may","Jun","July","aug","sep","oct","nov","dec"};

        for (int i = 0; i < months.length ; i++) {
            System.out.println(months[i]);
            }

        System.out.println("-------------------------------------------");

        for (int i = months.length-1 ; i >=0 ; i--) {
            System.out.println(months[i]);
        }





        }









    }

