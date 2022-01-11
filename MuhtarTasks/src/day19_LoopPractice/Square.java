package day19_LoopPractice;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the side of the square:");
        int side=s.nextInt();

        int area=0;
        int perimeter=0;

        if(side<=0){
            System.err.println("Invalid Entry for the side of the square");
            System.exit(0);
        }else{
            area= side*side;
            perimeter= (side+side)*2;
        }
        System.out.println("perimeter = " + perimeter);
        System.out.println("area = " + area);

        while ( true){
            System.out.println("Would you like to calculate another Square?");
            String a=s.next();

            if(a.equalsIgnoreCase("yes")|| a.equalsIgnoreCase("no")){

                if (a.equalsIgnoreCase("yes")){
                    System.out.println("Enter the side of the square:");
                    side=s.nextInt();



                    if(side<=0){
                        System.err.println("Invalid Entry for the side of the square");
                        System.exit(0);
                    }else{
                        area= side*side;
                        perimeter= (side+side)*2;
                    }
                    System.out.println("perimeter = " + perimeter);
                    System.out.println("area = " + area);


                }else if(a.equalsIgnoreCase("no")){
                    System.err.println("Thank you for using Cydeo Square Calculator APP");
                    break;
                }

            } else{
                System.out.println("Invalid Entry! Please re enter valid entry");
                a=s.next();
                if (a.equalsIgnoreCase("no")){
                    System.err.println("Thank you using square APP");
                    System.exit(0);
                }
            }

        }








    }
}
