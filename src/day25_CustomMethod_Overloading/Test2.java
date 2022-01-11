package day25_CustomMethod_Overloading;


import utilities.StringUtility;

public class Test2 {
    public static void main(String[] args) {

        String str="Wooden Spoon";

        StringUtility.printEachChar(str);
        System.out.println("----------------");
        String str2="Java Programming language";

        String reverse=StringUtility.reverse(str2);

        System.out.println(reverse);
        System.out.println("______________________");

        String word= "Civic";
       boolean palindrome= StringUtility.isPalindrome(word);

        System.out.println(palindrome);
        System.out.println("=====================");

        String[] names={"Anna","Java","Python","racecar","Mom"};
        int count=0;

        for (String each : names) {
            if (StringUtility.isPalindrome(each)){
                count++;

            }
        }

        System.out.println(count);
        System.out.println("=============================");

        String s2="aaaaabbbbbccccccdddddgergregergergege";

        String result=StringUtility.removeDuplicates(s2);

        System.out.println(result);






    }
}
