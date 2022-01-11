package Replit.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class AppendPosSum {
    //create your method below
    public static ArrayList<Integer> appendPosSum(ArrayList<Integer> list){

        ArrayList<Integer> result=new ArrayList<>();

        int sum=0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)>0){
                result.add(list.get(i));
            }
            sum += result.get(i);
            result.add(sum);
        }


        return result;

    }


    // Do not touch below

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextInt());
        }

        System.out.println(appendPosSum(list));

    }
}
