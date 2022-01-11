package day35_Encapsulation.encapsulation;

public class Employee {

    private String name;
    private char gender;
    private int age;
    private double salary;

    public Employee(String name, char gender, int age,double salary) {
        setName(name);
        setGender(gender);
        setAge(age);
        setSalary(salary);
    }

    public String getName() {

        return name;
    }
    public void  setName(String name){
        if (name.isEmpty()) {
            System.err.println("Invalid");
            System.exit(0);
        }
        this.name=name;
    }
    public char getGender(){

        return gender;
    }
    public void setGender(char gender){
        if (!(gender=='F'|| gender=='M')){
            System.err.println("Invalid gender");
            System.exit(0);
        }
        this.gender=gender;
    }

    public int getAge(){

        return age;
    }
    public void setAge(int age){
        if (age<=16 || age>120){
            System.err.println("Invalid age");
            System.exit(0);
        }
        this.age=age;
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        this.salary=salary;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", salary= $" + salary +
                '}';
    }
}
