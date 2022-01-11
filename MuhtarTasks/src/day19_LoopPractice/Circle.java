package day19_LoopPractice;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        double radius= s.nextDouble();

        double diameter=0;
        double area=0;
        double perimeter=0;
        String result="";


            if(!(radius<=0)) {//1

                diameter=2*radius;
                area=radius*radius*3.14;
                perimeter= 2*radius*3.14;

            }else{
                System.err.println("Invalid entry");
                System.exit(0);
            }
            System.out.println("radius = " + diameter);
            System.out.println("radius = " + area);
            System.out.println("radius = " + perimeter);

while (true) {
    System.out.println("Would you like to calculate another circle?");
    String a = s.next();


    if ((a.equalsIgnoreCase("yes") || a.equalsIgnoreCase("no"))) {

        if (a.equalsIgnoreCase("yes")) {
            System.out.println("Enter the radius of the circle");
            radius = s.nextDouble();

            if (!(radius <= 0)) {//1


                diameter = 2 * radius;
                area = radius * radius * 3.14;
                perimeter = 2 * radius * 3.14;

            } else if(a.equalsIgnoreCase("no")){
                System.err.println("Invalid entry");
                System.exit(0);
            }else{
                System.out.println("Invalid Entry, Please re enter");
                a = s.next();
            }
            System.out.println("radius = " + diameter);
            System.out.println("radius = " + area);
            System.out.println("radius = " + perimeter);

        }
        if (a.equalsIgnoreCase("no")) {
            System.err.println("Thank you for using Cydeo Circle Calculator APP");
            System.exit(0);
        }
    }

}


    }
}
