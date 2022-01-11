package day32_Constructor;

import com.sun.tools.attach.AgentInitializationException;

public class Employee {

    public String name;
    public char gender;
    public String jobTitle;
    public double salary;

    public Employee(String name){
        this.name= name;
    }

    public Employee(String name , char gender){
        this(name);
       //* Employee(name);
        this.gender=gender;
    }

    public Employee(String name, char gender, String jobTittle){
        this(name,gender);
        this.jobTitle=jobTittle;
    }

    public Employee(String name, char gender, String jobTittle, double salary){
        this(name,gender,jobTittle);
        this.salary=salary;
    }







    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }










}
