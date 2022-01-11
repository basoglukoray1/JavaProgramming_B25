package day11_SwitchScanner.InterViewQuestions;

import java.util.Arrays;

public class RemoveAllzeros {
    public static void main(String[] args) {

        int[] array = {10, 0, 5, 0, 1, 0};

        int[] move=new int[array.length];

            int x=0; //+1
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0){
                move[x]=array[i];
                x++;


        }

        }

        System.out.println(Arrays.toString(move));









    }
}
