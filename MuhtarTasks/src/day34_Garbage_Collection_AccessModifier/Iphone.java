package day34_Garbage_Collection_AccessModifier;

public class Iphone {
    public String model;
    public char size;
    public String color;
    public int price;
    public static boolean isSmartphone;
    public static String madeIn;
    public static String designedIn;
    public static String OS;

    public Iphone(String model, char size, String color, int price) {
        this.model = model;
        this.size = size;
        this.color = color;
        this.price = price;

    }

    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", size=" + size +
                ", color='" + color + '\'' +
                ", price= $" + price +
                '}';
    }

    static {
        isSmartphone=true;
        madeIn="China";
        designedIn="USA";
        OS="Ios";
    }

    public static void printOperatingSystem(){
        System.out.println(OS);
    }

    public void call(long phoneNumber){
        System.out.println(model+" is calling "+ phoneNumber);
    }
    public void text(long phoneNumber){
        System.out.println(model+" is texting "+phoneNumber);
    }
    public void faceTime(long phoneNumber){
        System.out.println(model+" is facetiming "+ phoneNumber);
    }
    public void faceTime(String email){
        System.out.println(model + " is faceTiming with " + email);
    }



}
