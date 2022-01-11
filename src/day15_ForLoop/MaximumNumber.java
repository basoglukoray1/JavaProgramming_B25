package day15_ForLoop;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {

        int max=-2147483647;
        int min=2147483647;

        for (int i = 1; i <6 ; i++) {
            Scanner s=new Scanner(System.in);
            System.out.println("Enter a number");
            int num= s.nextInt();
            if (num>max){
                max=num;
            }if (min>num){
                min=num;
            }
        }
        System.out.println("min = " + min);
        System.out.println("max =  "+max);
















    }
}
