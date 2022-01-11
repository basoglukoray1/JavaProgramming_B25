package day35_Encapsulation;

public class CydeoStudent {

    public String name;
    public char gender;
    public int age;
    public int batchNumber;
    public int groupNumber;
    public static String schoolName;
    public String fieldOfStudy;
    public static String programmingLanguage;
    public static String secretCode;


    public CydeoStudent(String name, char gender, int age, int groupNumber, int batchNumber, String fieldOfStudy) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.groupNumber = groupNumber;
        this.batchNumber=batchNumber;
        this.fieldOfStudy=fieldOfStudy;
    }

    static {
        schoolName="Cydeo";
        programmingLanguage="Java";
        secretCode="Wooden Spoon";

    }

    public static  void printSchoolName(){
        System.out.println(schoolName);
    }


    public static void printSecretCode() {
        System.out.println("code is " + secretCode);
    }

    public void attendClass(){
        System.out.println(name+" attending the class of batch "+ batchNumber);
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                '}';
    }
}
