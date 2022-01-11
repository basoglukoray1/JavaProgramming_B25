package day27_WrapperClasses.day30_CustomClass;

import java.util.ArrayList;

public class StudentObject {
    public static void main(String[] args) {

        Student student1=new Student();
        student1.setInfo("Aygun", 'F',39,2210, 'A');

        Student student2=new Student();
        student2.setInfo("Hulya", 'F',26,2113, 'B');

        Student student3=new Student();
        student3.setInfo("Ahmet", 'F',18,2215, 'C');

        Student student4=new Student();
        student4.setInfo("Suleyman", 'F',35,2216, 'D');

        Student student5=new Student();
        student5.setInfo("Murat", 'F',30,2218, 'F');


        Student[] students={student1,student2,student3,student4,student5};

        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("==========================================");

        ArrayList<Student> earlyBirds=new ArrayList<>();
        ArrayList<Student> angryBirds=new ArrayList<>();

        for (Student student : students) {
            if (student.grade =='A'){
                earlyBirds.add(student);
            }else{
                angryBirds.add(student);
            }
        }

        System.out.println(earlyBirds);
        System.out.println(angryBirds);















    }
}
