package day37_Inheritance.inheritance_Animal.phoneTask;

public class Phone {
    public String brand,model,color;
    public double price;
    public String size;

    public static boolean hasBattery;

    public Phone(String brand, String model, String color, double price, String size) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
        this.size = size;
    }

    static {
        hasBattery=true;
    }

    public void call(long phoneNumber){
        System.out.println(brand + " "+ model +" is calling");

    }
    public void text(long phoneNUmber){
        System.out.println(brand + " "+model+" is texting");
    }

    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price= $" + price +
                ", size='" + size + '\'' +
                ", has battery="+ hasBattery+
                '}';
    }
}
