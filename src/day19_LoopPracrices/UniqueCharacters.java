package day19_LoopPracrices;

public class UniqueCharacters {
    public static void main(String[] args) {
        String str="aabccdeef";
        String result="";


        for (int j= 0; j <str.length() ; j++) {

        char ch= str.charAt(j);
        int count=0;// represents the frequency of the ch

        for (int i = 0; i <str.length() ; i++) {
            char each=str.charAt(i);//each character of str
            if(ch == each){
                count++;
            }
        }
            if (count ==1){
                result += ch;
            }

        }
        System.out.println(result);



    }
}
