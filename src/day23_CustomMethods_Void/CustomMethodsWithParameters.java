package day23_CustomMethods_Void;

public class CustomMethodsWithParameters {

//cerate a function that can check if a number is odd numberr or even number
public static void main(String[] args) {

    oddOrEven(5);
    ageOfPerson(1991);
    printNumbers(3,8);


}
    public static void oddOrEven(int number){

        if (number%2==0){
            System.out.println(number+" is even number");
        }else{
            System.out.println(number+" is odd number");
        }

    }

    //create a function that can display age of the person

    public static void ageOfPerson(int birthYear){

        int age= 2021-birthYear;

        System.out.println("Your age is: "+age);

    }


    public static void printNumbers(int x,int y){
        for (int i = x; i <y ; i++) {
            System.out.println(i);

    }
}





}
