package WeeklyMeetingQuestions.FirstWeek;

public class FrequecnyOfEach {
    public static void main(String[] args) {
        String str="aaabbbccc";
        String result="";

        for (int i = 0; i <str.length() ; i++) {
            char each =str.charAt(i);
            int count=0;

            for (int j = 0; j <str.length() ; j++) {
                char each2=str.charAt(j);

                if (each == each2){
                    count++;
                }

            }
            if (!result.contains(each+"")) {
                result += each + "" + count;

            }
        }

        System.out.println(result);




    }


}
