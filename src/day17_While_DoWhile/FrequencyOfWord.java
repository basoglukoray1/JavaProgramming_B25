package day17_While_DoWhile;

public class FrequencyOfWord {
    public static void main(String[] args) {

        String str= "JavaJava";

        int frequency=0;

        for (int i = 0; i <=str.length()-4 ; i++) {

            boolean name=str.substring(i, i+4).equalsIgnoreCase("java");

            if (name){
                frequency++;
            }


        }


        System.out.println("frequency = " + frequency);







    }
}
