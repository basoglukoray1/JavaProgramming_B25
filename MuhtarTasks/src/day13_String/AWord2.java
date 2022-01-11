package day13_String;

import java.util.Scanner;

public class AWord2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String input=s.nextLine();
        if (input.startsWith("x")){
            input=input.substring(1);
        }
        System.out.println(input);


    }
}
