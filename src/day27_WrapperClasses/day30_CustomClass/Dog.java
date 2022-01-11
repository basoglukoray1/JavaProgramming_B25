package day27_WrapperClasses.day30_CustomClass;

public class Dog {

    public String name;
    public String breed;
    public int age;
    public String size;
    public char gender;
    public String color;



    public void setInfo(String dogName, String dogBreed, int dogAge , char dogGender, String dogSize, String dogColor){
        name=dogName;
        breed=dogBreed;
        age=dogAge;
        gender=dogGender;
        size=dogSize;
        color=dogColor;


    }


    public void eat(){
        System.out.println(name+ " is eating");
    }
    public void play(){
        System.out.println(name+ " is playing");
    }

    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", gender=" + gender +
                ", color='" + color + '\'' +
                '}';
    }


}
