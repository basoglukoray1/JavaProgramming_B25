package day24CustomMethods;

public class Task3_Reverse {
    public static void main(String[] args) {

    reverse("Koray Koray midir?");



    }

        public static void reverse(String sentence){

        String result="";
            for (int i = sentence.length()-1; i >=0 ; i--) {
                result += sentence.charAt(i);
            }

            System.out.println(result);

        }











}
