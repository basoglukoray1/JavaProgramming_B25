package day30_CustomClass;

public class Employees {

    /*
     Employees:
    Attributes:
        employeeName, gender, SSN, employeeID, JobTitle, Salary

    Actions:
        attendMeeting, Workoing, getInfo, SetInfo
     */

    public String name;
    public char gender;
    public long SSN;
    public int ID;
    public String title;
    public double salary;

    public void setInfo(String name, char gender, long SSN, int ID, String title, double salary) {
        this.name = name;
        this.gender = gender;
        this.SSN = SSN;
        this.ID = ID;
        this.title = title;
        this.salary = salary;
    }

    public String toString() {
        return "Employees{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", SSN=" + SSN +
                ", ID=" + ID +
                ", title='" + title + '\'' +
                ", salary= $" + salary +
                '}';
    }

    public void attendance(){
        System.out.println(name+ " has attended to meeting");
    }
    public void working(){
        System.out.println(name+" is currently working");
    }















}
