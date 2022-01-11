package day37_Inheritance.inheritance_Animal.animalTask;

public class Parrot extends Animal{
    public Parrot(String name, String breed, String size, String color, char gender, int age) {
        super(name, breed, size, color, gender, age);
    }

    public void Speak(){
        System.out.println(name+ " is speaking");
    }


}
