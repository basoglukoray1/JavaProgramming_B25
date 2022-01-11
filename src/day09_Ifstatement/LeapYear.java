package day09_Ifstatement;

public class LeapYear {
    public static void main(String[] args) {
        int year=1991;

        boolean leapYear= year%4==0;

        if (leapYear){
            System.out.println(year+ " is leap year.");
        }else{
            System.err.println(year+" is not leap year");
        }














    }
}
