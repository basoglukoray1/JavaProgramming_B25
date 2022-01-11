package day09_Ifstatement;

public class MedianNumber {
    public static void main(String[] args) {

     /*
     2. Create a class called MedianNumber. write a program that can find the median number between three DIFFERENT given integers

            Ex:
                a = 10, b= 15, c = 20;

            Output:
                15 is the median number
      */
int a=150, b=15, c=75;

    if (a<b&&a>c|| a>c&&a<b){
        System.out.println(b+" is the median number");
    }if (b>a&&b<c||b>c&&b<a){
            System.out.println(a+" is the median number");
        }if(c>a&&c<b||c>b&&c<a) {
            System.out.println(c+" is the median number");
        }












    }
}
