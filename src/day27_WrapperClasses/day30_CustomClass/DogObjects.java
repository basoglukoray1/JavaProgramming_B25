package day27_WrapperClasses.day30_CustomClass;

import java.util.ArrayList;

public class DogObjects {


    public static void main(String[] args) {

        Dog dog1=new Dog();

        dog1.name="Koray";
        dog1.breed="Kangal";
        dog1.age= 12;
        dog1.size="Big";
        dog1.color="Yellow";
        dog1.gender='F';

        //System.out.println(dog1);

        Dog dog2=new Dog();
        dog2.setInfo("Suleyman", "Pit-Bull", 15, 'F', "Large", "Black");

        Dog dog3=new Dog();
        dog3.setInfo("Jack","German Sepherd",2,'M',"Large","Black");

        System.out.println(dog3);

        dog1.eat();

        dog2.play();

        Dog dog4=new Dog();
        dog4.setInfo("Muhallebi","Labrador", 12, 'F',"Small","White");
        Dog dog5=new Dog();
        dog5.setInfo("Sully", "Pit-Bull", 6, 'M', "Large", "Black");

        System.out.println("-------------------------------------------");

        Dog[] dogs ={ dog1,dog2,dog3,dog4,dog5};


        ArrayList<Dog> femaleDogs=new ArrayList<>();
        ArrayList<Dog> maleDogs=new ArrayList<>();

        for (Dog each : dogs) {
            if (each.gender=='F'){
                femaleDogs.add(each);
            }else if (each.gender=='M'){
                maleDogs.add(each);
            }

        }

        System.out.println(femaleDogs+" ");
        System.out.println(maleDogs);






    }















}
