package day17_While_DoWhile;

import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age= scan.nextInt();//valid age : 1-120;


        while ( !(age>=1&&age<=120)){
            System.err.println("Invalid entry, please re-enter the age" +
                    "");
            age= scan.nextInt();
        }

        System.out.println("Are you a US citizen? yes/no");
        String asnwer= scan.next();

        while(   !(asnwer.equalsIgnoreCase("yes")|| asnwer.equalsIgnoreCase("no"))){
            System.err.println("Invalid enter, please enter again (yes or no) :");
            asnwer= scan.next();
        }

            if( age>=18 && asnwer.equalsIgnoreCase("yes")){
                System.out.println("You are eligible to vote");
            }else{
                System.err.println("You are not eligible not to vote");
            }





    }
}
