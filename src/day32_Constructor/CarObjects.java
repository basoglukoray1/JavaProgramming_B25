package day32_Constructor;

public class CarObjects {
    public static void main(String[] args) {

        Car car1= new Car("Toyota");

        Car car2= new Car("Honda", "Civic");

        Car car3= new Car("BMW", "330i", 2012);

        Car car4= new Car("Mercedes", "C300", 2018, 27000);

        Car car5= new Car("Lexus", "RX350", 2017,42000,"Black");

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);
















    }
}
