package day08_IfStatement;

public class LogicalOperators {
    public static void main(String[] args) {
        String name ="Steven";
        int age =19;
        String citizen="USA";
        boolean isEligibleToVote=age>=18&& citizen=="USA";

        System.out.println(name+" is eligible to vote: "+isEligibleToVote);

        System.out.println("-------------------------------");

        String name2="Josh";

        int creditScore=720;
        int age2=17;
int income=17000;
        boolean isEligible2=creditScore>=700&& age2>=21&& income>=60000;

        System.out.println(name2+" is eligible for loan: "+isEligible2);

        System.out.println("-------------------------------------");
        String name3="Shay";
        int age3=21;
        char gender='F';

        boolean isEligible3= age3>=18 && (gender =='M'|| gender=='F');
                            //true          //false         //true
                            //=true


        System.out.println(name3+" is eligible to register " +isEligible3);









    }
}
