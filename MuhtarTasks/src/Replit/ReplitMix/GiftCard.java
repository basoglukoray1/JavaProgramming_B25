package Replit.ReplitMix;

import java.util.Scanner;

public class GiftCard {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        String item=s.nextLine();
        String result="";
        int amount=100;
        /*boolean items=item.equals("Hat")||item.equals("Blanket")||item.equals("Charger")
                ||item.equals("Headphones")||item.equals("Laptop")||item.equals("Pants")
                ||item.equals("Pillow")||item.equals("Smartphone")||item.equals("Socks")||
                item.equals("USB cable");*/
        if (amount<=100){

            if (item.equals("Hat")||item.equals("Blanket")||item.equals("Charger")
                    ||item.equals("Headphones")||item.equals("Laptop")||item.equals("Pants")
                    ||item.equals("Pillow")||item.equals("Smartphone")||item.equals("Socks")||
                    item.equals("USB cable")){

                if(item.equals("Hat")){
                    result="Thank you for your pruchase!\nYour current balance is: "+
                            (amount-25)+"$";

                 }else if (item.equals("Blanket")){
                    result="Thank you for your pruchase!\nYour current balance is: "+
                            (amount-60)+"$";
                }else if (item.equals("Charger")){
                    result="Thank you for your pruchase!\nYour current balance is: "+
                            (amount-15)+"$";}
                else if (item.equals("Headphones")){
                    result="Thank you for your pruchase!\nYour current balance is: "+
                            (amount-30)+"$";}
                else if (item.equals("Laptop")){
                    result="Sorry, not enough funds on your gift card!";}
                else if (item.equals("Pants")){
                    result="Thank you for your pruchase!\nYour current balance is: "+
                    (amount-50)+"$";}
                else if (item.equals("Pillow")){
                    result="Thank you for your pruchase!\nYour current balance is: "+
                            (amount-40)+"$";}
                else if (item.equals("Socks")){
                    result="Thank you for your pruchase!\nYour current balance is: "+
                            (amount-5)+"$";}
                else if (item.equals("USB cable")){
                    result="Thank you for your pruchase!\nYour current balance is: "+
                            (amount-10)+"$";}
                else if (item.equals("Smartphone")){
                    result="Sorry, not enough funds on your gift card!";}



            }else{
                result="Invalid item";
            }

        }else{
            result="Sorry, not enough funds on your gift card!";
        }

        System.out.println(result);














    }
}
