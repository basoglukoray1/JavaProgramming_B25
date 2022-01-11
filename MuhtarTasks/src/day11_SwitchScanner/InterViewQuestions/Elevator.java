package day11_SwitchScanner.InterViewQuestions;

public class Elevator {
    public static void main(String[] args) {
        int floorNumber=1;
        String result="";

       /* if (floorNumber>=1&&floorNumber<=3){
            if (floorNumber==1){
                result="Lobby,Verizon,Starbucks";
            }else if (floorNumber==2){
                result="Cybertek, Nasa, Intelsat";
            }else{
                result="Lyft, BofA, Stake house";
            }
        }else {
            result="Invalid floor "+floorNumber;
        }
        System.out.println(result);*/

       /* switch (floorNumber){

            case 1:
                result="Lobby, Verizon, Starbucks";
                break;
            case 2:
                result="Cybertek, NASA, Intelsat";
            break;
            case 3:
                result="Lyft,BofA, Stake House";
                break;
            default:
                result="Invalid floor - "+floorNumber;

        }

        System.out.println(result);*/

        if (floorNumber>=1&&floorNumber<=3){
            switch (floorNumber){

                case 1:
                    result="Lobby, Verizon, Starbucks";
                    break;
                case 2:
                    result="Cybertek, NASA, Intelsat";
                    break;
                case 3:
                    result="Lyft,BofA, Stake House";
                    break;
            }

        }else{
            result="Invalid floor number";
        }


        System.out.println(result);



    }
}
