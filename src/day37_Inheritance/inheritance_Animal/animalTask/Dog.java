package day37_Inheritance.inheritance_Animal.animalTask;

public class Dog extends Animal {

 public Dog(String name, String breed, String size, String color, char gender, int age){
     super(name, breed, size, color, gender, age);
 }
    public void bark(){
        System.out.println("Barking");
    }

}
