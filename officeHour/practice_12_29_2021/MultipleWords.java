package practice_12_29_2021;

public class MultipleWords {
    public static void main(String[] args) {
        /*
        /*

    Task :  Write a program that accepts string and prints multiple words in the string

        "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer”

        output : wooden spoons
                 trash can
                  dish washer
         */


        String words="knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer";

        String [] splitArr=words.split(", ");

        for (String each : splitArr) {

            if (each.contains(" ")){
                System.out.println(each);
            }

        }







    }
}
