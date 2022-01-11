package day31_Constructor.ScrumTask;

import java.util.Arrays;

public class MyScrumTeam {
    public static void main(String[] args) {

        // 3 testers object

        Tester tester1=new Tester("Koray", 1905,"SDET", 110000);
        Tester tester2=new Tester("Mucahit", 1906,"SDET", 112000);
        Tester tester3=new Tester("Suleyman", 1907,"SDET", 100000);
        Tester tester4=new Tester("Kemal", 1908,"SDET", 108000);

        Tester[] testers= {tester2,tester3,tester4};


        // 4 dvelopers object
        Developer developer1= new Developer("Dardan",1212,"Java Developer", 152000);
        Developer developer2= new Developer("Ali",1213,"Java Master", 150000);
        Developer developer3= new Developer("Ahmet",1214,"Software Developer", 164000);
        Developer developer4= new Developer("Mehmet",1216,"Senior Developer", 132000);

        Developer[] developers={developer2,developer3,developer4};
        // 1 Scrum Team Object

        ScrumTeam scrum= new ScrumTeam("Ayhan","Cagla","Sina", 10);
        scrum.addDeveloper(developer1);
        scrum.addTester(tester1);

        scrum.addTesters(testers);
        scrum.addDevelopers(developers);

        System.out.println(scrum);

        System.out.println("====================================================================");

        for ( Tester each   :  scrum.testersList ){
            System.out.println(each.name + " : "+ each.salary );
        }

        System.out.println("============================================");

        for (Developer eachDev : scrum.devopsList) {
            System.out.println(eachDev.name+" : "+ eachDev.salary);
        }

        System.out.println("-====--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        scrum.removeTester(1905);

        System.out.println(scrum);

        scrum.removeDeveloper(1212);

        System.out.println(scrum);





        // for // 0, 1 ,2 ,3

        // for each { ashfja, asjghfkjas, asfhjsa }
                        //0     1            2




    }
}
