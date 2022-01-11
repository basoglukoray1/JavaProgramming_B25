package day16_ForLoopStringPractice;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String str="aabbaacc";
                  //01234567
           //result=a b   c= abc
        String result=" ";//result should be abc

        for (int i = 0; i <=str.length()-1 ; i++) {
            char ch= str.charAt(i); // represents each char of str

            if (!result.contains(ch+"")) {
                result += ch;
            }
            System.out.println(result);

        }










    }
}
