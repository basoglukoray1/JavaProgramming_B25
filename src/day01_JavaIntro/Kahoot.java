    package day01_JavaIntro;

    public class Kahoot {
        public static void main(String[] args) {
            // What is the output from the following code fragment?
            String[] name = {"Dursun", "Feristah", "Mucella", "Mebsure", "Durdane"};
            for (int i = 0; i < name.length; i = i + 2)
                System.out.print(name[i] + " ");

            System.out.println("-------------------------------");


            int x = 6;
            int y = 12;

            double z = y - x > x - y ? y - x : x - y;
            System.out.println(z);

            System.out.println("============================");


            int a=7;       //7   9     10    9
            boolean result=a++ > ++a &&++a> a++;
            System.out.println(a);

            System.out.println("=======================================");


           /* int[] array={2,4,6,8,1,3,5,7};
            
            int george=0;

            for (int i = 0; i < array.length ; i++) {

                george += array[i];

            }

            System.out.println(george);*/




        }
    }