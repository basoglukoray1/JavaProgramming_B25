package day17_While_DoWhile;

public class FrequencyOfWord2 {
    public static void main(String[] args) {

        String str= "Cat Cat Dog Dog";

        int frequencyOfCat=0;
        int frequencyOfDog=0;
        for (int i = 0; i <=str.length()-3 ; i++) {

            boolean name=str.substring(i, i+3).equalsIgnoreCase("cat");
            boolean name2=str.substring(i, i+3).equalsIgnoreCase("Dog");

            if (name){
                frequencyOfCat++;
            }else if(name2){
                frequencyOfDog++;
            }


        }


        System.out.println("frequencyOfDog = " + frequencyOfDog);
        System.out.println("frequencyOfCat = " + frequencyOfCat);






    }
}
