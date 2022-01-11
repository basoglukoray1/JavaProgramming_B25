package day32_Constructor;

public class Carpet {


    public double width,length;
    public int unitPrice;
    public boolean isPersian;

    public Carpet(double width, double length, int unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }
    public double calcCost(){

        double totalCost= width * length * unitPrice;

        if (isPersian){
            totalCost+=200;

        }
        return totalCost;
    }
    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice= $" + unitPrice +
                ", totalPrice= $"+ calcCost()+
                ", isPersian=" + isPersian +
                '}';
    }
















}
