package day37_Inheritance.inheritance_Animal.phoneTask;

public class Nokia extends Phone{
    public Nokia( String model, String color, double price, String size) {
        super("Nokia", model, color, price, size);
    }


    public void selfDefense(){
        System.out.println("You can use "+brand+" "+model+" as self defense tool");
    }








}
