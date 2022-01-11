package day30_CustomClass;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class OfferObjects {
    public static void main(String[] args) {


        Offer offer1=new Offer();
        offer1.setInfo("New York", true, 118000.0, false, "QA");
        Offer offer2=new Offer();
        offer2.setInfo("New York", true, 98000.0, true, "QA");
        Offer offer3= new Offer();
        offer3.setInfo("Atlanta", false,86000.0, true,"SDET");
        Offer offer4= new Offer();
        offer4.setInfo("Los Angeles", true, 132000.0,true,"Scrum Master");
        Offer offer5= new Offer();
        offer5.setInfo("San Francisco", true,123000.0,false,"Product Owner");

        ArrayList<Offer> available=new ArrayList<>(Arrays.asList(offer1,offer2,offer3,offer4,offer5));

       /* available.removeIf(p -> !p.location.equals("New York"));
        System.out.println(available);*/

       /* available.removeIf(p -> !(p.jobTittle.equals("QA")|| p.jobTittle.equals("SDET")));
        System.out.println(available);*/

      /*  available.removeIf(p -> p.WFH==false);
        System.out.println(available);*/

        available.removeIf(p-> p.hasBenefit==false);
        System.out.println(available);



























    }
}
