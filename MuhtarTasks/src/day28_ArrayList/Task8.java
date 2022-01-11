package day28_ArrayList;



import java.util.ArrayList;
import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {

      /*
      8. Given the following arraylists:
		ArrayList<Integer>  scores = new ArrayList<>();
  		scores.addAll( Arrays.asList(100, 90, 75, 85, 65, 85, 55, 45, 73, 73, 35, 47));


  		ArrayList<Integer> gradeOfA = new ArrayList<>(); // 90 ~ 100
        ArrayList<Integer> gradeOfB = new ArrayList<>(); // 80 ~ 89
        ArrayList<Integer> gradeOfC = new ArrayList<>(); // 70 ~ 79
        ArrayList<Integer> gradeOfD = new ArrayList<>(); // 60 ~ 69
        ArrayList<Integer> gradeOfF = new ArrayList<>(); // 0 ~ 59


        Write a program that can count the total numbers of grade A, B, C, D and F
       */


        ArrayList<Integer> scores = new ArrayList<>();
        scores.addAll( Arrays.asList(100, 90, 75, 85, 65, 85, 55, 45, 73, 73, 35, 47));


        ArrayList<Integer> gradeOfA = new ArrayList<>(); // 90 ~ 100
        ArrayList<Integer> gradeOfB = new ArrayList<>(); // 80 ~ 89
        ArrayList<Integer> gradeOfC = new ArrayList<>(); // 70 ~ 79
        ArrayList<Integer> gradeOfD = new ArrayList<>(); // 60 ~ 69
        ArrayList<Integer> gradeOfF = new ArrayList<>(); // 0 ~ 59

        for (int i = 0; i < scores.size(); i++) {
            if (scores.get(i) >= 0 && scores.get(i) <= 100) {
                if (scores.get(i) >= 90 && scores.get(i) <= 100) {
                    gradeOfA.add(scores.get(i));
                } else if (scores.get(i) >= 80) {
                    gradeOfB.add(scores.get(i));
                } else if (scores.get(i) >= 70) {
                    gradeOfC.add(scores.get(i));
                } else if (scores.get(i) >= 60) {
                    gradeOfD.add(scores.get(i));
                } else {
                    gradeOfF.add(scores.get(i));
                }
            }else{
                System.err.println("Invalid score");
            }
        }

        System.out.println("gradeOfA = " + gradeOfA.size());
        System.out.println("gradeOfB = " + gradeOfB.size());
        System.out.println("gradeOfC = " + gradeOfC.size());
        System.out.println("gradeOfD = " + gradeOfD.size());
        System.out.println("gradeOfF = " + gradeOfF.size());


    }
}
