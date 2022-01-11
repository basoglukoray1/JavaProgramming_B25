package day33_Statics;

public class EmployeeObjects {
    public static void main(String[] args) {


        Employee e1=new Employee();
        e1.name="Koray";
        e1.salary=120000;
        Employee e2=new Employee();
        e2.name="Aygun";
        e2.salary=110000;
        Employee e3=new Employee();
        e3.name="Fady";
        e3.salary=123000;
        Employee e4=new Employee();
        e4.name="Cagla";
        e4.salary=124000;
        Employee e5=new Employee();
        e5.name="Ernie";
        e5.salary=126000;

        System.out.println(e1.name+ "  :  "+ e1.salary);
        System.out.println(e2.name+ "  :  "+ e2.salary);
        System.out.println(e3.name+ "  :  "+ e3.salary);
        System.out.println(e4.name+ "  :  "+ e4.salary);
        System.out.println(e5.name+ "  :  "+ e5.salary);





    }
}
