package Replit.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class removeEveryOther {

    //create your method below
    public static ArrayList<String> removeEveryOther(ArrayList<String> list){



       list.removeIf(p -> list.indexOf(p) %2==0);



        return list;
    }







    // Do not touch below

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.next());
        }

        System.out.println(removeEveryOther(list));

    }
}
