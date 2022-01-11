package day37_Inheritance.inheritance_Animal.animalTask;

public class AnimalObjects {
    public static void main(String[] args) {

        Dog d1=new Dog("Duman","Kangal","Big","Brown",'M',12);

        System.out.println(d1);
        d1.bark();

        Cat cat1=new Cat("Mamais","Bombai","Small","Black",'F',1);

        System.out.println(cat1);
        cat1.scratch();

        Parrot parrot1=new Parrot("King","Macaw","Small", "Green",'M',
                14);
        System.out.println(parrot1);
        parrot1.Speak();

    }
}
