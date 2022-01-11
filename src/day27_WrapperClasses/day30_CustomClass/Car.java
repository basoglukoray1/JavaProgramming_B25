package day27_WrapperClasses.day30_CustomClass;

public class Car {

    public String brand;
    public String model;
    public int year;
    public long price;
    public String color;

    public void setInfo(String carBrand, String carModel, int carYear, long carPrice, String carColor) {
        brand = carBrand;
       model = carModel;
       year = carYear;
       price = carPrice;
       color = carColor;
    }

    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price= $" + price +
                ", color='" + color + '\'' +
                '}';
    }

    public void start(){
        System.out.println("Driving "+brand + " is started");
    }
    public void stop(){
        System.out.println(brand+ " is stopped");
    }















}
