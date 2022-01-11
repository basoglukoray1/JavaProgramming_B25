package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {


        Scanner input= new Scanner(System.in);
        System.out.println("Enter number between 1 to 7:");
        int input1=input.nextInt();
        String result="";

        if (input1>=1&&input1<=7){
            result=(input1==1)?"Monday":(input1==2)?"Tuesday":(input1==3)?"Wednesday"
                    :(input1==4)?"Thursday":(input1==5)?"Friday":(input1==6)?"Saturday"
                    :"Sunday";
        }else {
            result="Invalid Number";
        }

        System.out.println(result);

        input.close();







    }
}
