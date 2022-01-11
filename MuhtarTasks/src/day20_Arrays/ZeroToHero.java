package day20_Arrays;

public class ZeroToHero {
    public static void main(String[] args) {

        int[] arr={10,0,5,0,1,0};
        int[] arr2=new int[6];

        int count =0;
        for (int i= 0;  i< arr.length ; i++) {
            if (arr[i]!=0){
                arr2[i] += arr[i];
            }
            System.out.println(arr2);
        }







    }
}
