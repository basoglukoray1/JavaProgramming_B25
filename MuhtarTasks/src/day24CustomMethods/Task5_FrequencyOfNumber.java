package day24CustomMethods;

public class Task5_FrequencyOfNumber {
    public static void main(String[] args) {



    }

        public static void frequencyOfNum(int[] nums){

            int frequency=0;
            for (int each : nums){
                if (nums[each]==each){
                    frequency++;
                }
            }

            System.out.println(frequency);






        }








}
