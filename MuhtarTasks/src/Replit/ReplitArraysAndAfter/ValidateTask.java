package Replit.ReplitArraysAndAfter;

import java.util.Scanner;

public class ValidateTask {
    public static boolean validateTask(boolean notEmpty,int taskId,int currentId){
        // your code here
        boolean valid= false;
        if (notEmpty ==true && (currentId+1) == taskId){
            valid=true;
        }else{
            valid=false;
        }
return valid;



    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(validateTask(in.nextBoolean(), in.nextInt(), in.nextInt()));
    }
}
