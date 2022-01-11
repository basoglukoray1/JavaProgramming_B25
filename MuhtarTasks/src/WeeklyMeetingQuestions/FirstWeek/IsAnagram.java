package WeeklyMeetingQuestions.FirstWeek;

import java.util.Arrays;

public class IsAnagram {
    public static void main(String[] args) {
        /*
3. Find if the given 2 strings are anagram
		ex: "abc" , "bca"
        */

        String str1="earth";
        String str2="heart";

        char[] ch= str1.toCharArray();
        char[] ch2=str2.toCharArray();

        Arrays.sort(ch);
        Arrays.sort(ch2);

        System.out.println(Arrays.equals(ch, ch2));


    }
}
