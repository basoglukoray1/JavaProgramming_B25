package Replit.ReplitMix;

import java.util.Scanner;

public class PatientInformation {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Welcome to the patient portal!");
        System.out.println("Please enter your personal information");
        System.out.println("Enter your first name");
        String firstName=s.next();
        System.out.println("Enter your last name");
        String lastName=s.next();
        s.nextLine();
        System.out.println("Enter your email");
        String email= s.nextLine();
        System.out.println("Enter your street");
        String street=s.nextLine();
        System.out.println("Enter your city");
        String city=s.nextLine();
        System.out.println("Enter your state");
        String state=s.next();
        System.out.println("Enter your zip code");
        int zipCode=s.nextInt();
        System.out.println("Enter your work phone number");
        long phoneNumber= s.nextLong();
        System.out.println("Enter your personal phone number");
        long personalNumber=s.nextLong();
        System.out.println("Enter your age");
        int age=s.nextInt();
        System.out.println("Enter your height");
        double height=s.nextDouble();
        System.out.println("Enter your weight");
        double weight=s.nextDouble();
        System.out.println("Are you married?");
        boolean isMarried=s.nextBoolean();

        System.out.println("Patient personal information Full name: "+lastName+
        ", "+firstName+" Address: "+street+", "+city+", "+state+" "+zipCode+" "+
                "Contacts: work phone number - "+ phoneNumber+", personal phone number - "+personalNumber+", email: "+
                email+" Age: "+age+" Height: "+height+" Weight: " +weight+" pounds Married?: "+isMarried);


        /*Declare 2 int variables: age, zipcode Declare 2 double variables: height, weight. Declare boolean variable: isMarried (for marriage status). Declare 2 long variables: workPhoneNumber and personalPhoneNumber.

Create a Scanner object named scan.

Execution flow with example:

Welcome to the patient portal!
Please enter your personal information
Enter your first name
James
Enter your last name
May
Enter your email
jamesmay@gmail.com
Enter your street
7925 Jones Branch Dr
Enter your city
McLean
Enter your state
VA
Enter your zip code
22102
Enter your work phone number
7896542314
Enter your personal phone number
2406542314
Enter your age
35
Enter your height
5.10
Enter your weight
173.2
Are you married?
true
Welcome to the patient portal!
Please enter your personal information
Enter your first name
James
Enter your last name
May
Enter your email
jamesmay@gmail.com
Enter your street
7925 Jones Branch Dr
Enter your city
McLean
Enter your state
VA
Enter your zip code
22102
Enter your work phone number
7896542314
Enter your personal phone number
2406542314
Enter your age
35
Enter your height
5.10
Enter your weight
173.2
Are you married?
true
build contacts variable by concatenating work phone, personal phone and email

build fullName variable by concatenating first name and last name

build address variable by concatenating street, city, state, zip code*/














    }
}
