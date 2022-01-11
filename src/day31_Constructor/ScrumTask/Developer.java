package day31_Constructor.ScrumTask;

public class Developer {

    /*
create a class called Developer
 Attributes:
 name, employeeID, JobTitle, Salary

 Add A constructor that can set all the fileds

 Actions:
 coding(), unitTesting(), fixingBug(), toString()
 */

    public String name;
    public int employeeID;
    public String jobTittle;
    public double salary;

    public Developer(String name, int employeeID, String jobTittle, double salary) {
        this.name = name;
        this.employeeID = employeeID;
        this.jobTittle = jobTittle;
        this.salary = salary;
    }

    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", jobTittle='" + jobTittle + '\'' +
                ", salary= $" + salary +
                '}';
    }

    public void coding(){
        System.out.println(name+ " is coding");
    }

    public void unitTesting(){
        System.out.println(name+ " is unit testing");
    }
    public void fixingBug(){
        System.out.println(name+ " is fixing bugs");
    }






}
