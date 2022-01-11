package day36_Inheritance.encapsulation;

public class Student {


    private String name;
    private char gender,grade;
    private int age;
    private String schoolName;

    public static boolean isStudent=true;

    public Student(String name, char gender, char grade, int age, String schoolName) {
        this.name = name;
        this.gender = gender;
        this.grade = grade;
        this.age = age;
        this.schoolName = schoolName;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", grade=" + grade +
                ", age=" + age +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setAge(int age){
        if(age <= 5 || age > 90){
            System.err.println("Invalid Age: "+age);
            return;
        }
        this.age=age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (!(gender== 'M' || gender=='F')){
            return;
        }
        this.gender = gender;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        if (!(grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F')) {
            return;
        }
        this.grade = grade;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }




}
