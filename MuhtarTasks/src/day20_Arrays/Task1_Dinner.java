package day20_Arrays;

public class Task1_Dinner {
    public static void main(String[] args) {

        String[] classMates={"Ernie","Gorkhmaz","Nattaya","Mucahit","Ayhan",
        "Sina","Edrees","Nazir","Koray","Togrul"};

        String initial="";

        for (int i = 0; i < classMates.length; i++) {
          initial += classMates[i].charAt(0)+"\n";

        }

        System.out.println(initial);








    }
}
