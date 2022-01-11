package day11_Switch_Scanner;

public class Browser {
    public static void main(String[] args) {

        String browserName="chrome";

        String result="";

    if (browserName=="chrome"||browserName=="firefox"||browserName=="opera"||browserName
    =="safari"||browserName=="edge"){

        if (browserName=="chrome"){
            result="Chrome is selected browser";
        }else if (browserName=="firefox"){
            result="Firefox is selected browser";
        }else if (browserName=="firefox"){
            result="Opera is selected browser";
        }
        else if (browserName=="firefox"){
            result="Safari is selected browser";
        }else{
            result="Edge is selected browser";
        }

    }else{
        result="Invalid Browser Name";
    }


        System.out.println(result);


    }
}
