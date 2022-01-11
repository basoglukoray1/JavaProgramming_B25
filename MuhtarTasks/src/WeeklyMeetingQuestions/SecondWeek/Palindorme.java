package WeeklyMeetingQuestions.SecondWeek;

public class Palindorme {
    public static void main(String[] args) {


        String str = "level";
        String result="";
        for (int i = str.length()-1; i >=0 ; i--) {
            result += str.charAt(i);
        }

        if (result.equalsIgnoreCase(str)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }






    }
}
