package day24_CustomMethod_Returm;

public class WarmUpTasks {
    public static void main(String[] args) {
        initials("Koray","Basoglu");
        domain("basoglukoray@gmail.com");
    }

    public static void initials(String firstName,String lastName){

        System.out.println(firstName.toUpperCase().charAt(0) + " " + lastName.toUpperCase().charAt(0));


    }

    public static void domain(String email){
        System.out.println(email.substring(email.indexOf("@")+1,email.lastIndexOf(".")));

    }

/*
1. Create a method that can display the initials of the person

2. Create a method that can display the domain of the email

3. Create a method that can display the name of the month based on the given number to the method

4. Create a method that can print the name of the day based on the given number to the method

5. Create a method that can print how many days a month has
 */







}
