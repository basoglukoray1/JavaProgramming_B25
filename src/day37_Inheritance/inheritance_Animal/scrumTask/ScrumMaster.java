package day37_Inheritance.inheritance_Animal.scrumTask;

public class ScrumMaster extends Employee{
    public ScrumMaster(String name, int age, char gender, int ID, double salary, String companyName) {
        super(name, age, gender, "Scrum Master", ID, salary, companyName);
    }

    public void improvesTheUseOfScrum(){
        System.out.println(jobTitle + " " +name + " is improving the use of scrum");
    }







}
