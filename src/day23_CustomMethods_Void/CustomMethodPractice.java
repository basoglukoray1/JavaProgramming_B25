package day23_CustomMethods_Void;

public class CustomMethodPractice {
    //create a fucction that can prin hello world 5 times
    // create a function that can print hello Cydeo 5 times

    public static void main(String[] args) {
        System.out.println("Test starting");
        helloWorld5Times();
        System.out.println("----------------------");
        helloCydeo5Times();
        System.out.println("Test completed");
        System.out.println("----------");
        evenNumbers();

    }


    public static void helloWorld5Times(){
        for (int i = 0; i <5 ; i++) {
            System.out.println("Hello World");
        }
    }

    public static void helloCydeo5Times(){
        for (int i = 0; i <5 ; i++) {
            System.out.println("Hello Cydeo");
        }

    }

    //create a function that can can print all the even numbers from1-10

    public static void evenNumbers(){
        for (int i =2 ; i <11 ; i+=2) {
            System.out.print(i);
        }

    }






}
