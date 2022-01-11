package day33_Statics;

import java.util.Arrays;

public class StudentObjects {
    public static void main(String[] args) {

        Student student1=new Student("Koray");

        Student student2=new Student("Aygun",'F');

        Student student3=new Student("Kamil",11);

        Student student4=new Student("Suleyman", 12,'A');

        Student student5=new Student("Memo", 'M',32);

        Student student6= new Student("Serhat",'M', 23,52,'B');

        Student student7=new Student("Ali",'M',12,12,'B');

        Student[] students={student1,student2,student3,student4,student5,student6,student7};

        System.out.println(Arrays.toString(students));

    }
}
