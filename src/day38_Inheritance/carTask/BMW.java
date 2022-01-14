package day38_Inheritance.carTask;

public class BMW extends Car {
    public BMW(String model, String color, int year, int miles, double price) {
        super("BMW", model, color, year, miles, price);
    }

    public void breaksDown() {
        System.out.println(brand + " " + model + " is breaking down");
    }

    public void racing() {
        System.out.println(brand + " " + model + " is a racing car");
    }


    @Override
    public void start() {
        System.out.println("Please call mechanic to start "+ brand+" "+model);
    }
}





