package day37_Inheritance.inheritance_Animal.scrumTask;

public class ProductOwner extends Employee{
    public ProductOwner(String name, int age, char gender, String jobTitle, int ID, double salary, String companyName) {
        super(name, age, gender, jobTitle, ID, salary, companyName);
    }

    public void represent(){
        System.out.println(name + " is representing the company");
    }
    public void manage(){
        System.out.println(name + " is managing the company");
    }






}
