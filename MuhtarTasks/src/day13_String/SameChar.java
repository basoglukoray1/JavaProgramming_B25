package day13_String;

public class SameChar {
    public static void main(String[] args) {
        String ex="level";
        if (ex.charAt(0)==ex.charAt(ex.length()-1)){
            System.out.println("same");
        }else{
            System.out.println("invalid");
        }

        System.out.println("________________________________________");

        String s1="koray";
        String s2="basoglu";

        char n1=s1.toUpperCase().charAt(0);
        char n2=s2.toUpperCase().charAt(0);

        System.out.println(n1+"."+n2);
        System.out.println("--------------------------------");

        String t1="kor";
      int lenght=t1.length();
        char ch=  t1.charAt(t1.length()-1);
        char ch2= t1.charAt(t1.length()-2);
        char ch3=t1.charAt(t1.length()-3);
        if(lenght==0){
            System.out.println("String is empty ");
        }else if (lenght>3){
            System.out.println(ch3+""+ch2+""+ch);
        }else if (lenght<=3){
            System.out.println(t1);
        }
        System.out.println("==================================");









    }
}
