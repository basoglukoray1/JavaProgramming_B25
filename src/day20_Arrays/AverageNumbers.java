package day20_Arrays;

public class AverageNumbers {
    public static void main(String[] args) {

        int[] numbers={10,20,30,40,50,60};

        double sum=0;
        double av=0;
        for (int i = 0; i < numbers.length ; i++) {
            sum+=numbers[i];
            av= sum / numbers.length;
        }

        System.out.println(sum);
        System.out.println(av);








    }
}
