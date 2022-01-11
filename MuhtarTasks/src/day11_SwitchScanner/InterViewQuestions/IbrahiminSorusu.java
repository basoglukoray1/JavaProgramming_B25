package day11_SwitchScanner.InterViewQuestions;

import java.sql.Array;
import java.util.Arrays;

public class IbrahiminSorusu {
    public static void main(String[] args) {

        String skills="cmpzcmbzzmcpzzpzcmb";   // pcmbz    // 1 team

        String newEach=""; // bbccccmmmmpppzzzzz

        for (int i = 0; i < skills.length() ; i++) {

            if (skills.charAt(i)=='b'){
                newEach += skills.charAt(i);

            }
        }
        for (int j = 0; j < skills.length() ; j++) {

            if(skills.charAt(j)=='c'){
                newEach += skills.charAt(j);
            }
           }
        for (int k= 0; k < skills.length() ; k++) {

            if(skills.charAt(k)=='m'){
                newEach += skills.charAt(k);
            }
        }
        for (int u = 0; u < skills.length() ; u++) {

            if(skills.charAt(u)=='p'){
                newEach += skills.charAt(u);
            }
        }
        for (int l = 0; l < skills.length() ;l++) {

            if(skills.charAt(l)=='z'){
                newEach += skills.charAt(l);
            }
        }

        System.out.println(newEach);
        System.out.println("==============================");

        int frequencyOfB=0;
        int frequencyOfC=0;
        int frequencyOfM=0;
        int frequencyOfP=0;
        int frequencyOfZ=0;

        for (int i = 0; i < newEach.length(); i++) {
            if (newEach.charAt(i)=='b'){
                frequencyOfB++;
            }if (newEach.charAt(i)=='c'){
                frequencyOfC++;
            }if (newEach.charAt(i)=='m'){
                frequencyOfM++;
            }if (newEach.charAt(i)=='p'){
                frequencyOfP++;
            }if (newEach.charAt(i)=='z'){
                frequencyOfZ++;
            }
        }

        System.out.println("frequencyOfB = " + frequencyOfB);
        System.out.println("frequencyOfC = " + frequencyOfC);
        System.out.println("frequencyOfM = " + frequencyOfM);
        System.out.println("frequencyOfP = " + frequencyOfP);
        System.out.println("frequencyof Z " + frequencyOfZ);
        System.out.println("=============================");

        int[] arr1= {frequencyOfC,frequencyOfB,frequencyOfM,frequencyOfP,frequencyOfZ}; //
        System.out.println(Arrays.toString(arr1));

       Arrays.sort(arr1); // 2 ,3 ,4 ,4 6

       int teamSum=0;
       teamSum=arr1[0];
        System.out.println(teamSum);





    }
}
