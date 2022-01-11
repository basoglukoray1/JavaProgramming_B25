package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class EmployeesObjects {
    public static void main(String[] args) {


        Employees e1=new Employees();
        e1.setInfo("Koray",'M',1112223335,1905,"QA", 82000);
        Employees e2=new Employees();
        e2.setInfo("Mucahit",'M',1112548789,1908,"QA", 124000);
        Employees e3=new Employees();
        e3.setInfo("Ayhan",'M',1312448782,1911,"Project Manager", 185000);
        Employees e4=new Employees();
        e4.setInfo("Sina",'M',1112543214,1923,"Product Owner", 98000);
        Employees e5=new Employees();
        e5.setInfo("Hayriye",'F',425548789,1903,"SDET", 92000);

        ArrayList<Employees> list=new ArrayList<>();
        list.addAll(Arrays.asList(e1,e2,e3,e4,e5));

        System.out.println(list);

        System.out.println("===========================");

        //list.removeIf(p-> p.salary<100000);

        list.removeIf(p-> p.title.equals("QA") || p.title.equals("SDET"));
        System.out.println(list);


    }
}
