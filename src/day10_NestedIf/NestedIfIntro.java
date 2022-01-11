package day10_NestedIf;

public class NestedIfIntro {
    public static void main(String[] args) {

        int score=975;
        if(score>=0&&score<=100){
            if(score>=60) {
                System.out.println("Passed");
            }else {
                System.out.println("Failed");
            }

        }else{
            System.out.println("invalid");
        }
        System.out.println("--------------------------------");

        int age= 25;
        boolean hasId=true;

        if (age>=21) {
            System.out.println("eligible to buy alcohol");

            if (hasId) {
                System.out.println("Enjoy");
            } else {
                System.out.println(" You must have an ID");
            }
        }else{
                System.out.println("Not eligible to buy alcohol");
            }















    }
}
