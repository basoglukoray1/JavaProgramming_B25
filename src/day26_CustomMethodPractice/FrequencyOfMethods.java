package day26_CustomMethodPractice;

public class FrequencyOfMethods {
    public static void main(String[] args) {
    /*1. Create a class named FrequencyOfElements:
            1.1 Create a method that passes two parameters:
             an integer array and an Integer element.
             The method returns the frequency of the given
             integer element from the integer array*/
        int[] arr={1,1,1,1,2,2,3,4,11,4,56,7,8};
        int howMany=frequecyOfElement(arr, 1);
        System.out.println(howMany);




    }

        // {1,1,1,2,3,4,5} //returns the frequency of the given element from the given array
    public static int frequecyOfElement(int[] array, int element){
        int count=0;
        for (int each : array) {
            if (each == element){
                count++;
            }
        }
               return count;
    }


    //returns the frequency of the given element from the given array
    public static int frequecyOfElement(double[] array, double element){
        int count=0;
        for (double each : array) {
            if (each == element){
                count++;
            }
        }
        return count;
    }


    //returns the frequency of the given element from the given array
    public static int frequecyOfElement(char[] array, char element){
        int count=0;
        for (char each : array) {
            if (each == element){
                count++;
            }
        }
        return count;
    }


    //returns the frequency of the given element from the given array
    public static int frequecyOfElement(String[] array, String element){
        int count=0;
        for (String each : array) {
            if (each.equalsIgnoreCase(element)){
                count++;
            }
        }
        return count;
    }





}
