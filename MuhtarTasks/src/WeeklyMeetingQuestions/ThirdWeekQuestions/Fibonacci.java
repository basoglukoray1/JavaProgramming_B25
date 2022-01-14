package WeeklyMeetingQuestions.ThirdWeekQuestions;

public class Fibonacci {
    public static void main(String[] args) {

        int expect=12;

        int n1=0;
        int n2=1;
        int sum=0;

        System.out.println(n1);
        System.out.println(n2);

        for (int i = 2; i <expect ; i++) {
            sum= n1+n2;
            System.out.println(sum);
            
            n1=n2;
            n2=sum;
        }








    }
}
