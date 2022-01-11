package Replit.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class RepeatAll {

    //create your method below
    public static ArrayList<Boolean> repeatAll(ArrayList<Boolean> list){

        ArrayList<Boolean> modified=new ArrayList<>();

        for (Boolean each : list) {
            modified.add(each);
        }
        for (Boolean each2 : list) {
            modified.add(each2);
        }



        return modified;
    }






    // Do not touch below

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Boolean> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextBoolean());
        }

        System.out.println(repeatAll(list));

    }
}
