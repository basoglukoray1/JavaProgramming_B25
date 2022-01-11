package day20_Arrays;

public class TaskTwo {
    public static void main(String[] args) {

        String[] classMates={"Ernie","Gorkhmaz","Nattaya","Mucahit","Ayhan",
                "Sina","Edrees","Nazir","Koray","Togrul"};

        String reverse="";
        String each="";
        for (int i = classMates.length-1; i>=0; i--) {
                each += classMates[i]+"\n";

        }

        for (int j =each.length()-1; j >=0 ; j--) {
            reverse += each.charAt(j)+"";
        }
        System.out.print(reverse);






    }
}
