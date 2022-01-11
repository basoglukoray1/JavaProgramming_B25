
package day11_Switch_Scanner;

import java.nio.file.LinkPermission;
import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num1=scan.nextInt();
        System.out.println("enter an decimal: ");
        double num2=scan.nextDouble();

        System.out.println(num1+num2);


        scan.close();






    }













}
