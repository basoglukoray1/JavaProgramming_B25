package day30_CustomClass;

public class Offer {

  /*
   Offer:
    Attributes:
        Location, hasBenifit(boolean), salary, WFH(boolean), JobTitle

    Actions:
        SetInfo, getInfo


    create a class named MyOffers
        1. create 7 objects Offer Class and store them into an arraylist

        2. write a program that can only keep the offers from local area

        3. write program that can remove all the offers that are not SDET or QA

        4. write a program that can remove all the offers that are not WFH

        5. write a program that can remove all the offers that do not have benifits
   */

    public String location;
    public boolean hasBenefit;
    public double salary;
    public boolean WFH;
    public String jobTittle;

    public void setInfo(String location, boolean hasBenefit, double salary, boolean WFH, String jobTittle) {
        this.location = location;
        this.hasBenefit = hasBenefit;
        this.salary = salary;
        this.WFH = WFH;
        this.jobTittle = jobTittle;
    }

    public String toString() {
        return "Offer{" +
                "location='" + location + '\'' +
                ", hasBenefit=" + hasBenefit +
                ", salary= $" + salary +
                ", WFH=" + WFH +
                ", jobTittle='" + jobTittle + '\'' +
                '}';
    }
}
