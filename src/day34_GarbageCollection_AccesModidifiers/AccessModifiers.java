package day34_GarbageCollection_AccesModidifiers;

public class AccessModifiers {
    public static final int publicData=100;
    static int defaultData=300;
    private static int privateData=200;


    public static void method1(){
        System.out.println("Public");
    }
    static void method2(){
        System.out.println("Default");
    }
    private static void method3(){
        System.out.println("Private");
    }

    public static void main(String[] args) {
        System.out.println(publicData);
        System.out.println(defaultData);
        System.out.println(privateData);
    }

}
