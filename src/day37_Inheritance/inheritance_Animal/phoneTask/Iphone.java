package day37_Inheritance.inheritance_Animal.phoneTask;

public class Iphone extends Phone {


    public Iphone( String model, String color, double price, String size) {
        super("Apple", model, color, price, size);
    }

    Iphone p1=new Iphone("12","Grey",1099,"Plus");

    public void faceTime(long phoneNumber){
        System.out.println(brand + " " + model + " " + " is having a Face Time with " + phoneNumber);
    }

    public void faceTime(String email){
        System.out.println(brand + " " + model + " is having a Face Time with " + email);
    }









}
