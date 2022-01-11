package day35_Encapsulation.encapsulation;

public class EmployeeObjects {
    public static void main(String[] args) {

        Employee e1=new Employee("Koray", 'M',30,120000);

        System.out.println(e1);

        e1.setAge(32);

        System.out.println(e1);

        Employee e2=new Employee("Suleyman", 'F',36,138000);
        e2.setName("Memo");

        e2.setSalary(e2.getSalary()+5000);

        System.out.println(e2);










    }
}
