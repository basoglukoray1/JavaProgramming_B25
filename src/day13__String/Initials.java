package day13__String;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter first name:");
        String firstName=s.nextLine();
        System.out.println("Enter last name:");
        String lastName=s.nextLine();

        String result=firstName.charAt(0)+"."+lastName.charAt(0);


        System.out.println(result);

        s.close();



    }
}
