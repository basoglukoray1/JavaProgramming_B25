package Replit.ReplitMix;

import java.util.Scanner;

public class ShoppingList2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String shoppingListReport = "";
        String item = "";
        String countinue = "";
        double price = 0;
        int count = 1;
        double totalPrice = 0;


        do{
            System.out.println("Enter Item" + count +" and its price:");
            item = scan.next();
            price = scan.nextDouble();
            shoppingListReport += "Item" + count + ": " + item + " Price: " + price + ", ";
            totalPrice += price;
            count++;

            System.out.println("Add one more item?");
            countinue = scan.next();

        }while(countinue.equalsIgnoreCase("yes"));

        System.out.println(shoppingListReport.substring(0,shoppingListReport.length()-2));
        System.out.println("Total price: " + totalPrice);


    }}




            /*
            Example:

    output: Enter Item1 and its price:
    input: Tomatoes
    input: 5.5
    output: Add one more item?
             */
            /*
    In this assignment, you will write a program that will generate a shopping list. It's more advanced version of assignment Shopping list I.
    Your program should ask use to enter items followed by its price.
    After adding item, ask user if he wants to add one more item.
    If so, repeat previous steps again.
    If no, print shopping list report and total price as show in examples.
     Your program should accept up to 10 items.
             */














