package day17_While_DoWhile;

import java.util.Scanner;

public class WhileLoopPractice {
    public static void main(String[] args) {

        //username: Cydeo
        //password: Cydeo123

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your username:");
        String u = scan.next();
        System.out.println("Enter your password:");
        String p = scan.next();

        if (u.equals("Cydeo") && p.equals("Cydeo123")) {
            System.out.println("Logged in");
        } else {
            int attempts = 3;
            while (!(u.equals("Cydeo") && p.equals("Cydeo123"))&& attempts>0) {
                if(attempts==1){
                    System.err.println("This is your last chance");
                }
                System.out.println("Enter your username again!:");
                u = scan.next();
                System.out.println("Enter your password again!:");
               p = scan.next();

                attempts--;
            }
            if (u.equals("Cydeo") && p.equals("Cydeo123")) {
                System.out.println("Logged in");

            }else {
                System.out.println("your account is locked");
            }

        }


        scan.close();



    }}

