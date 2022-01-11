package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysIntro {
    public static void main(String[] args) {

        //create a variable that capable enough contain 5 names

        String[] myGroups= new String[5];
        myGroups[0]="Gunay";
        myGroups[1]="Neira";
        myGroups[2]="Suat";
        myGroups[3]="hulya";
        myGroups[4]="Mikael";

        //System.out.println(myGroups); //hashcode

        System.out.println(Arrays.toString(myGroups));

        System.out.println("=========================================");


        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number");
        int day=s.nextInt();

        String[] days={"Monday", "Tueasday", "Wednesday", "Thursday", "Friday", "Saturday", "Sumday"};

        if (day <1 || day >7) {
            System.err.println("Invalid number");
            System.exit(0);
        }


        System.out.println(days[day-1]);

        System.out.println("---------------------------------------");




    }
}
