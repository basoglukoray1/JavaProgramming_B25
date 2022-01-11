package day24_CustomMethod_Returm;

public class ReturnMethodPractice {
    public static void main(String[] args) {
 // find the max number between 100 -200

      int maxNum=maxNumber(100,200);
        System.out.println(maxNum);
        // multiply the max number by2
        int multiplication=maxNum*2;
        System.out.println(multiplication);

    }

      public static int maxNumber(int n1,int n2){

            int result=0;
        if (n2>n1){
            result =n2;
        }else{
           result =n1;
        }

        return result;
    }







}
