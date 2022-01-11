package utilities;

import day34_GarbageCollection_AccesModidifiers.AccessModifiers;

import java.io.PrintStream;

public class Test_AccessModifiers {
    public static void main(String[] args) {

        System.out.println(AccessModifiers.publicData);
       // System.out.println(AccessModifiers.defaultData); // not visible
       // System.out.println(AccessModifiers.privateData); // not visible
        // Because different package

        AccessModifiers.method1();
      //  AccessModifiers.method2(); // not visible bc different package
     //   AccessModifiers.method3(); // not visible bc different class and package






    }
}
