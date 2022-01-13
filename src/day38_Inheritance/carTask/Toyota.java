package day38_Inheritance.carTask;

public class Toyota extends Car {

   public Toyota(String model, String color, int year, int miles, double price){
       super("Toyota","CH-R","White",2018,26700,22000);
   }

   public void reliable(){
       System.out.println(brand+" is very reliable");
   }




}
