package Replit.ReplitMix;



public class Practice_Group {
    public static void main(String[] args) {

       /*Use a nested loop to print the following shape
        *
        * *
        * * *
        * * * *
        * * * * *
        * * * * * *
        * * * * * * *
        * * * * * * * *
        * * * * * * * * *
        * * * * * * * * * *


        */

        for (int i= 1; i <=10 ; i++) {
        /*  *
            *
            *
            *
            *
            *
            *
            *
            *
            *
         */

            for (int j =10; j >= i ; j--) { // j=1 ; j<=1  *           //j = 10  ; j>=10 * * * * * * * * * *

                System.out.print("* ");   // j=1  ;   j<=2  * *        //j = 10  ; j>=9  * * * * * * * * *

            }                             // j=1   ; j<=3  * * *       //j = 10  ; j>=8  * * * * * * * *

            /* *
             * *
             */
            System.out.println();

        }









    }
}
