package day31_Constructor.ScrumTask;

public class Tester {
    /*
    Scrum Task:
    create a class called Tester
            Attributes:
                name, employeeID, JobTitle, Salary

            Add A constructor that can set all the fileds

            Actions:
               smokeTesting(),  creatingTicket(), dailyStandUp() toString()
     */

    public String name;
    public int employeeID;
    public String jobTittle;
    public double salary;

    public Tester(String name, int employeeID, String jobTittle, double salary) {
        this.name = name;
        this.employeeID = employeeID;
        this.jobTittle = jobTittle;
        this.salary = salary;
    }

    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", jobTittle='" + jobTittle + '\'' +
                ", salary= $" + salary +
                '}';
    }

    public void smokeTesting(){
        System.out.println(name+ " performing smoke test");
    }

    public void creatingTicket(){
        System.out.println(name+" is creating ticket");
    }











}
