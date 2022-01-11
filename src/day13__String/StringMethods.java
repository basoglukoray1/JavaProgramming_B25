package day13__String;

public class StringMethods {
    public static void main(String[] args) {
        
        String word="Cydeo";
        char thirdChar=word.charAt(2);
        System.out.println("thirdChar = " + thirdChar);
        
        
        
        /*char tenthChar=word.charAt(9);

        System.out.println("tenthChar = " + tenthChar);*/

        System.out.println("====================================");

        String s1="Batch 25 is the best batch";
        int totalchars=s1.length();
        System.out.println("totalchars = " + totalchars);

        char lastchar=s1.charAt(s1.length()-1);
        System.out.println("lastchar = " + lastchar);
        System.out.println("-----------------------------");

        String str="wooden spoon";
        str=str.toUpperCase();//"WOODEN SPOON"
        System.out.println(str);
        
        
        String s="JaVa";
        s=s.toUpperCase();
        System.out.println(s);
        
        
        
        
        
        
    }
}
