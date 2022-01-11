package Replit.ReplitArraysAndAfter;

import java.util.Scanner;

public class GetDuplicates {

    public static int getDup(String[] r) {

        int numOfDup = 0;
        for (String each : r) { // 1,2,3,1
            int count = 0;

            for (String each2 : r) {
                if (each.equals(each2)) {//1,2,3,1
                    count++;
                }
            }


            if (count >= 2) {
                numOfDup++;
            }



        }

        return numOfDup;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String [] strs = new String[in.nextInt()];
        for(int i=0; i < strs.length; i++) {
            strs[i] = in.next();
        }

        System.out.println(getDup(strs));

    }
}
