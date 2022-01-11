package day18_NestedLoop;

import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int kingBed = 120;
        int queenBed = 100;
        int singleBed = 80;
        int total = 0;


            System.out.println("Which bedroom would you like to reserve?");
            String room = scan.nextLine();

            while (!(room.equals("king") || room.equals("queen") || room.equals("single")) ) {
                System.err.println("Invalid Room Type, Please re-enter:");
                room = scan.nextLine();
            }
            System.out.println("How many nights would you like to stay?:");
            int days = scan.nextInt();

            System.out.println("Would you like to reserve another room?");
            String answer = scan.next();

            while (!(answer.equals("yes") || answer.equals("no"))) {
                System.err.println("Invalid ,re-enter");
                scan.next();

            }

            if (answer.equals("no")) {
                if (room.equals("king")) {
                    total += kingBed * days;


                }if (room.equals("queen")) {
                    total += queenBed * days;


                } if (room.equals("single")) {
                    total += singleBed * days;

                }


            System.out.println("Total price= "+total);

        }








    }
}
