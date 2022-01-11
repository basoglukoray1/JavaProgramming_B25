package Replit.ReplitMix;




import java.util.Scanner;

public class JavaPython {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();


     int frequencyOfJava=0;
        int frequencyOfPython=0;

        for (int i = 0; i <=sentence.length()-4 ; i++) {
            if (sentence.substring(i , i+4).equalsIgnoreCase("Java")){
                frequencyOfJava++;
            }

        }
        for (int j = 0; j <=sentence.length()-6 ; j++) {
            if (sentence.substring(j , j+6).equalsIgnoreCase("python")){
                frequencyOfPython++;
            }
        }

        System.out.println(frequencyOfJava);
        System.out.println(frequencyOfPython);
        if (frequencyOfJava == frequencyOfPython){
            System.out.println(true);
        }else{
            System.out.println(false);
        }




    }
}
