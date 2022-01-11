package day37_Inheritance.inheritance_Animal.phoneTask;

public class Samsung extends Phone {
    public Samsung( String model, String color, double price, String size) {
        super("Samsung", model, color, price, size);
    }


    public void freeze(){
        System.out.println(brand+" "+model+" is  freezing ");
    }

















}
