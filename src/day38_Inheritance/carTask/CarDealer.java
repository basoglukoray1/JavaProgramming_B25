package day38_Inheritance.carTask;

public class CarDealer {
    public static void main(String[] args) {


        Toyota toyota=new Toyota("CH-R","White",2018,26700,22000);

        Tesla tesla = new Tesla("Model S", "black", 2022, 0, 94500);

        BMW bmw=new BMW("330i","Grey",2019,135000,12500);

        toyota.start();

        tesla.start();

        bmw.start();






    }
}
