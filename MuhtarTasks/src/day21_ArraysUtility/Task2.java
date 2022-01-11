package day21_ArraysUtility;

public class Task2 {
    public static void main(String[] args) {

      /*  2. Write a program that can count the even and odd number from an array of integers

        Note: MUST use for each loop*/

        int[] numbers={2,3,5,7,8,9,10,12,13};

        int countEven=0;
        int countOdd=0;

        for (int each : numbers) {
            if (each%2==0){
               countEven++;
            }
            if (each%2==1){
                countOdd++;
            }
        }


        System.out.println("countEven = " + countEven);
        System.out.println("countOdd = " + countOdd);







    }
}
