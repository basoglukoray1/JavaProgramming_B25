package WeeklyMeetingQuestions.SecondWeek;

public class MergeString {
    public static void main(String[] args) {


        String str1 = "korayko";
        String str2 = "Caglacagla";

        String result = "";

        for (int i = 0; i < str1.length() || i < str2.length(); i++) {
            if (i < str1.length()) {
                result += str1.charAt(i); // k
            }
            if (i < str2.length()) {
                result += str2.charAt(i) ;
            }


        }

        System.out.println(result);





    }
}
