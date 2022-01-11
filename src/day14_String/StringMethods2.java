package day14_String;

public class StringMethods2 {
    public static void main(String[] args) {

        String str="Java is fun, I love learning Java";
        String s1=str.replace("Java","Python");
        System.out.println(s1);
        
        String email="JohnSmith@yahoo.com";
         String newEmail=email.replace("yahoo", "gmail");
         
        System.out.println("email = " + email);
        System.out.println("newEmail = " + newEmail);

        String s="Dog Dog Dog Dog Dog Dog";
        String sNew=s.replace("Dog", "Cat");
        System.out.println("s new = " + sNew);

        String s2="C# is fun, C# is cool";

        s2=s2.replace(" C#","Java");


        System.out.println("s2 = " + s2);

        String s3="Java";
        s3=s3.replace("a","e");
        System.out.println("s3 = " + s3);

        System.out.println("--------------------------------");

        String result="Java Java Java";
        //result=result.replace("Java", "Python");
        result=result.replaceFirst("Java", "Python");
        System.out.println(result);

        String result2="C# is fun, C# is cool";






    }
}
