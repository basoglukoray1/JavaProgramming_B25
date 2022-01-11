package day27_WrapperClasses.day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects {
    public static void main(String[] args) {

        Car car1=new Car();
        car1.setInfo("Mercedes","AMG 63",2015,120000,"Grey");

        Car car2 = new Car();
        car2.setInfo("BMW", "3.20dci",2004,7500,"Black");

        System.out.println(car1);
        System.out.println(car2);
        System.out.println("===============================================");
        System.out.println("===============================================");
       // Car[] cars={car1,car2}

        ArrayList<Car> cars=new ArrayList<>(Arrays.asList(car1,car2));

        for (Car each : cars) {
            System.out.println(each.brand+ " "+ each.price);
        }
        System.out.println("================================================");

        cars.removeIf(each -> each.brand.equals("BMW") && each.year >= 2005 && each.year <= 2008);
        cars.removeIf(each -> each.brand.equals("Toyota") && each.year>= 1995 &&  each.year <=1997);




    }
}
