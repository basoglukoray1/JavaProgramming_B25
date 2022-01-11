package day21_ArraysUtility;

public class Task4 {
    public static void main(String[] args) {

       /* 4. write a program that can count how many palindromes in an array of string
        Ex:
        {"anna", "level", "Java"};

        output:
        2*/


      String[] names={"anna", "level", "Java"};
        int count=0;
        for (String each : names) {

            String reverse = "";
            for (int i = names.length, j = 0; i >= 0; i--, j++) {
                reverse +=each.charAt(i);
            }
            if (each.equals(reverse))
                count++;
            System.out.println(reverse);
        }

        System.out.println(count);




    }
}
