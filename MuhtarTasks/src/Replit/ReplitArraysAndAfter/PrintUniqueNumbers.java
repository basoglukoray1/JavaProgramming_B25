package Replit.ReplitArraysAndAfter;



public class PrintUniqueNumbers {

    public static void main(String[] args) {
       int[] nums={1,2,3,2,4,5,6,2,56,7,8,9,9}; //1 3 4 5 6 7 8
        printUniqueNumbers(nums);
    }

    public static void printUniqueNumbers(int[] nums){
        //WRITE YOUR CODE HERE


        for (int each : nums) {
            int count=0;
            for (int each2 : nums) {
                if (each==each2){
                    count++;
            }

        }
            if (count==1){
                System.out.println(each+" ");
            }
        }



    }










}
