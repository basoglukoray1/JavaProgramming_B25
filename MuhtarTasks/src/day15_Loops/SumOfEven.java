package day15_Loops;

public class SumOfEven {
    public static void main(String[] args) {

        int sum=0;
        for (int i = 2; i <=100 ; i++) {
            if (i%2==0){
                System.out.print(i+" ");
                sum+=i;
            }

        }
        System.out.println("\n"+sum);
        System.out.println();
        System.out.println("--------------------");

        for (int u = 1; u <=100 ; u++) {
            if (u%2==1){
                System.out.print(u+" ");
                sum+=u;
            }
        }
        System.out.println("\nsum = " + sum);






    }
}
