package day24CustomMethods;

public class Task1_FrequencyOfWord {
    public static void main(String[] args) {
        frequencyOfWords("Java is my favorite programI love Java Java","Java");


    }


    public static void frequencyOfWords(String sentence,String word){

        int frequency=0;

        for (int i = 0; i <=sentence.length()-word.length() ; i++) {
            String each=sentence.substring(i,i+word.length());
            if (each.equals(word)){
                frequency++;
            }

        }

        System.out.println(frequency);

    }






}
