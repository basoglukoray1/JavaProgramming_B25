package day36_Inheritance.inheritance;

public class Zoo {
    public static void main(String[] args) {


        Dog dog = new Dog();
        dog.setInfo("Max", "Husk","Small","Blacl",'M',12);
        dog.eat();
        dog.bark();
        dog.sleep();
        dog.sleep();

        Cat cat = new Cat();
        cat.setInfo("Mamais", "Unkonwn","Small","Black",'F',1);
        cat.sleep();
        cat.meow();
        cat.eat();
        cat.move();



        Tiger tiger = new Tiger();
        tiger.setInfo("Fistik","Bengfal","Medium","White",'F',12);
        tiger.roar();
        tiger.hunt();
        tiger.eat();
        tiger.drink();
    }






}
