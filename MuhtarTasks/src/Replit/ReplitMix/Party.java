package Replit.ReplitMix;



import java.util.Scanner;

public class Party {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        String name="";
        String guestList="";
        String answer="";

        do{
            System.out.println("Please enter guest name:");
            name=scan.next();
            guestList += name+", ";
            System.out.println("Do you want to enter new guest name");
            answer=scan.next();

        }while(answer.equalsIgnoreCase("yes"));
        if (answer.equalsIgnoreCase("no")) {
            System.out.println(guestList.substring(0, guestList.length() - 2));

        }else{
            System.err.println("Invalid");
        }




        /*String name="";
        String guestList="";
        String a="";
      do {
          System.out.println("Please enter a guest name:");
          name = scan.next();
          guestList += name+", ";
          System.out.println("Do you want to enter new guest name:");
          a = scan.next();
      }while (a.equalsIgnoreCase("yes"));



        System.out.println(guestList.substring(0,guestList.length()-2));*/















    }
}
