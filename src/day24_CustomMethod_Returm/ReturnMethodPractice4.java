package day24_CustomMethod_Returm;

public class ReturnMethodPractice4 {
    public static void main(String[] args) {
        String str=removeDuplicates("aabbcc");
        System.out.println(str);
    }

//create a method that can remove duplicate
    public static String removeDuplicates(String str){

        String result="";

        for (int i = 0; i <str.length() ; i++) {
            char each=str.charAt(i);

            if (!result.contains(each+"")){
            result+=each;
        }

        }
        return  result;

    }









}
