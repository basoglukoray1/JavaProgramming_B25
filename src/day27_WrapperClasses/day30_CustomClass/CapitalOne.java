package day27_WrapperClasses.day30_CustomClass;

public class CapitalOne {
    public static void main(String[] args) {

        Employee employee1=new Employee();
        employee1.setInfo( "Ali", 'M', 30, 4242, "SDET", 142400.00, true );

        Employee employee2=new Employee();
        employee2.setInfo("Kevin",'M',35,2298,"Senior QA", 110000,true);
        Employee employee3=new Employee();
        employee3.setInfo("Lina",'F',45,2290,"Manager",80000,true);
        Employee employee4=new Employee();
        employee4.setInfo("David",'M',35,2256,"QA",45000,false);
        Employee employee5=new Employee();
        employee5.setInfo("Anna",'F',28,2287,"QA",85000,true);


        Employee[] employees={employee1,employee2,employee3,employee4,employee5};


        int countFullTime=0;
        int countPartTime=0;
        double max=employees[0].salary;
        for (Employee employee : employees) {
            if (employee.isFullTime==true){
                countFullTime++;
            }else{
                countPartTime++;
            }
        }













    }
}
