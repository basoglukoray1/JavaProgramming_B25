package WeeklyMeetingQuestions.FirstWeek;

import java.util.Arrays;

public class RemoveElement {
    /*
    4.  Create a method that passes two parameters: an integer array and an integer index. the method removes the element at the given index of the array and returns the new array
                    Ex:
                        int[] arr = {10,20,30,40}
                        remove(arr, 2) ==> {10, 20, 40}
     */

    public static int[] removeElement(int[] arr, int index) {

        int[] arr2 = new int[arr.length - 1];

        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == index) {
                continue;
            }
            arr2[j++] = arr[i];

        }
        return arr2;

    }







    public static void main(String[] args) {
        int[] arr1={10,20,30,40};
        int [] result=removeElement(arr1 , 2);
        System.out.println(Arrays.toString(result));
    }
































}
