package practice_1_5_2022;

public class RemoveSpaces {
    public static void main(String[] args) {


    String str = " Java            is             programming              language";
    str = str.trim();

        for (int i = 0; i <str.length(); i++) {
        if (str.contains("  ")){
            str = str.replaceAll("  "," ");
        }
    }

        System.out.println(str);
    }
}
